package DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import POJO.PhieuNhapXuat;

public class PHIEUNHAPDAO extends ConnectionDB{
    public List<PhieuNhapXuat> doc()
    {
        open();
        List<PhieuNhapXuat> dsPhieuNhapXuat = new ArrayList<>();
        ResultSet rs = executeQuery("Select * from PhieuNhapKho");
        
        try {
            while (rs.next())
            {
                PhieuNhapXuat pnx = new PhieuNhapXuat();
                pnx.maPhieu = rs.getString("MaPhieuNhap");
                pnx.ngay = rs.getDate("NgayNhap");
                pnx.tongTien = rs.getInt("TongTien");
                dsPhieuNhapXuat.add(pnx);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        close();
        return dsPhieuNhapXuat;
    }
    
    public PhieuNhapXuat doc(String maPhieuNhap)
    {
        open();
        ResultSet rs = executeQuery("Select * from PhieuNhapKho where MaPhieuNhap='" + maPhieuNhap + "'");
        
        try {
            while (rs.next())
            {
                PhieuNhapXuat pnx = new PhieuNhapXuat();
                pnx.maPhieu = rs.getString("MaPhieuNhap");
                pnx.ngay = rs.getDate("NgayNhap");
                pnx.tongTien = rs.getInt("TongTien");
                close();
                return pnx;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        close();
        return null;
    }
    
    public boolean them(String maPhieu, Date ngay, int tongTien)
    {              
        try {
            open();
            PreparedStatement ps = cn.prepareStatement("insert into PhieuNhapKho values(?, ?, ?)");
            ps.setString(1, maPhieu);
            ps.setDate(2, ngay);
            ps.setInt(3, tongTien);
            boolean kq = ps.executeUpdate() > 0;
            close();
            return kq;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean sua(String maPhieu, Date ngay, int tongTien)
    {              
        try {
            open();
            PreparedStatement ps = cn.prepareStatement(
                    "update PhieuNhapKho set NgayNhap=?, TongTien=? where MaPhieuNhap=?");
            ps.setString(3, maPhieu);
            ps.setDate(1, ngay);
            ps.setInt(2, tongTien);
            boolean kq = ps.executeUpdate() > 0;
            close();
            return kq;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean xoa(String maPhieuNhapXuat)
    {              
        open();
        boolean kq = executeUpdate("delete PhieuNhapKho where MaPhieuNhap='" + maPhieuNhapXuat + "'");
        close();
        return kq;
    }
}
