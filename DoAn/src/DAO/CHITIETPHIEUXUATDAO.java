package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import POJO.ChiTietPhieu;

public class CHITIETPHIEUXUATDAO extends ConnectionDB{
    public List<ChiTietPhieu> doc()
    {
        open();
        List<ChiTietPhieu> dsChiTietPhieu = new ArrayList<>();
        ResultSet rs = executeQuery("Select * from ChiTietPhieuXuat");
        
        try {
            while (rs.next())
            {
                ChiTietPhieu pnx = new ChiTietPhieu();
                pnx.maPhieu = rs.getString("MaPhieuXuat");
                pnx.maNguyenLieu = rs.getString("MaNguyenLieu");
                pnx.soLuong = rs.getInt("SoLuong");
                pnx.donGia = rs.getInt("DonGia");
                dsChiTietPhieu.add(pnx);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        close();
        return dsChiTietPhieu;
    }
    
    public ChiTietPhieu doc(String maPhieuNhap, String maNguyenLieu)
    {
        open();
        ResultSet rs = executeQuery("Select * from ChiTietPhieuXuat where MaPhieuXuat='" 
                + maPhieuNhap + "' AND MaNguyenLieu='" + maNguyenLieu + "'");
        
        try {
            while (rs.next())
            {
                ChiTietPhieu pnx = new ChiTietPhieu();
                pnx.maPhieu = rs.getString("MaPhieuXuat");
                pnx.maNguyenLieu = rs.getString("MaNguyenLieu");
                pnx.soLuong = rs.getInt("SoLuong");
                pnx.donGia = rs.getInt("DonGia");
                close();
                return pnx;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        close();
        return null;
    }
    
    public List<ChiTietPhieu> docTheoLoai(String maPhieuXuat)
    {
        open();
        List<ChiTietPhieu> dsChiTietPhieu = new ArrayList<>();
        ResultSet rs = executeQuery("Select * from ChiTietPhieuXuat where MaPhieuXuat='" + maPhieuXuat + "'");
        
        try {
            while (rs.next())
            {
                ChiTietPhieu pnx = new ChiTietPhieu();
                pnx.maPhieu = rs.getString("MaPhieuXuat");
                pnx.maNguyenLieu = rs.getString("MaNguyenLieu");
                pnx.soLuong = rs.getInt("SoLuong");
                pnx.donGia = rs.getInt("DonGia");
                dsChiTietPhieu.add(pnx);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        close();
        return dsChiTietPhieu;
    }
    
    public boolean them(String maPhieuNhap, String maNguyenLieu, int soLuong, int donGia)
    {              
        open();
        boolean kq = executeUpdate("insert into ChiTietPhieuXuat values('" 
                + maPhieuNhap + "', N'" 
                + maNguyenLieu + "', " 
                + soLuong + ", " 
                + donGia + ")");
        close();
        return kq;
    }
    
    public boolean sua(String maPhieuNhap, String maNguyenLieu, int soLuong, int donGia)
    {              
        open();
        boolean kq = executeUpdate("update ChiTietPhieuXuat set SoLuong="
                + soLuong + ", DonGia=" 
                + donGia + ", where MaPhieuNhap='" 
                + maPhieuNhap + "' AND MaNguyenLieu='" + maNguyenLieu + "'");
        close();
        return kq;
    }
    
    public boolean xoa(String maPhieuNhap, String maNguyenLieu)
    {              
        open();
        boolean kq = executeUpdate("delete ChiTietPhieuXuat where MaPhieuXuat='" 
                + maPhieuNhap + "' AND MaNguyenLieu='" + maNguyenLieu + "'");
        close();
        return kq;
    }
}
