package DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import POJO.PhieuNhapXuat;

public class DAO_PhieuXuat extends ConnectionDB{
    public List<PhieuNhapXuat> doc()
    {
        open();
        List<PhieuNhapXuat> dsPhieuXuatXuat = new ArrayList<>();
        ResultSet rs = executeQuery("Select * from PhieuXuatKho");
        
        try {
            while (rs.next())
            {
                PhieuNhapXuat pnx = new PhieuNhapXuat();
                pnx.maPhieu = rs.getString("MaPhieuXuat");
                pnx.ngay = rs.getDate("NgayXuat");
                pnx.tongTien = rs.getInt("TongTien");
                dsPhieuXuatXuat.add(pnx);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        close();
        return dsPhieuXuatXuat;
    }
    
    public PhieuNhapXuat doc(String maPhieuXuat)
    {
        open();
        ResultSet rs = executeQuery("Select * from PhieuXuatKho where MaPhieuXuat='" + maPhieuXuat + "'");
        
        try {
            while (rs.next())
            {
                PhieuNhapXuat pnx = new PhieuNhapXuat();
                pnx.maPhieu = rs.getString("MaPhieuXuat");
                pnx.ngay = rs.getDate("NgayXuat");
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
            PreparedStatement ps = cn.prepareStatement("insert into PhieuXuatKho values(?, ?, ?)");
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
                    "update PhieuXuatKho set NgayXuat=?, TongTien=? where MaPhieuXuat=?");
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
        boolean kq = executeUpdate("delete PhieuXuatKho where MaPhieuXuat='" + maPhieuNhapXuat + "'");
        close();
        return kq;
    }
}
