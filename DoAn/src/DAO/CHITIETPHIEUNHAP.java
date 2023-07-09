package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import POJO.ChiTietPhieu;

public class CHITIETPHIEUNHAP extends ConnectionDB{
    public List<ChiTietPhieu> doc()
    {
        open();
        List<ChiTietPhieu> dsChiTietPhieu = new ArrayList<>();
        ResultSet rs = executeQuery("Select * from ChiTietPhieuNhap");
        
        try {
            while (rs.next())
            {
                ChiTietPhieu pnx = new ChiTietPhieu();
                pnx.maPhieu = rs.getString("MaPhieuNhap");
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
        ResultSet rs = executeQuery("Select * from ChiTietPhieuNhap where MaPhieuNhap='" 
                + maPhieuNhap + "' AND MaNguyenLieu='" + maNguyenLieu + "'");
        
        try {
            while (rs.next())
            {
                ChiTietPhieu pnx = new ChiTietPhieu();
                pnx.maPhieu = rs.getString("MaPhieuNhap");
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
    
    public List<ChiTietPhieu> docTheoLoai(String maPhieuNhap)
    {
        open();
        List<ChiTietPhieu> dsChiTietPhieu = new ArrayList<>();
        ResultSet rs = executeQuery("Select * from ChiTietPhieuNhap where MaPhieuNhap='" + maPhieuNhap + "'");
        
        try {
            while (rs.next())
            {
                ChiTietPhieu pnx = new ChiTietPhieu();
                pnx.maPhieu = rs.getString("MaPhieuNhap");
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
        boolean kq = executeUpdate("insert into ChiTietPhieuNhap values('" 
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
        boolean kq = executeUpdate("update ChiTietPhieuNhap set SoLuong="
                + soLuong + ", DonGia=" 
                + donGia + ", where MaPhieuNhap='" 
                + maPhieuNhap + "' AND MaNguyenLieu='" + maNguyenLieu + "'");
        close();
        return kq;
    }
    
    public boolean xoa(String maPhieuNhap, String maNguyenLieu)
    {              
        open();
        boolean kq = executeUpdate("delete ChiTietPhieuNhap where MaPhieuNhap='" 
                + maPhieuNhap + "' AND MaNguyenLieu='" + maNguyenLieu + "'");
        close();
        return kq;
    }
}
