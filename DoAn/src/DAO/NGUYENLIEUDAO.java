package DAO;

import POJO.NguyenLieu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class NGUYENLIEUDAO extends ConnectionDB{
    public List<NguyenLieu> doc()
    {
        open();
        List<NguyenLieu> dsNguyenLieu = new ArrayList<>();
        ResultSet rs = executeQuery("Select * from NguyenLieu");
        
        try {
            while (rs.next())
            {
                NguyenLieu nl = new NguyenLieu();
                nl.maNguyenLieu = rs.getString("MaNguyenLieu");
                nl.tenNguyenLieu = rs.getString("TenNguyenLieu");
                nl.donViTinh = rs.getString("DonViTinh");
                nl.soLuong = rs.getInt("SoLuong");
                dsNguyenLieu.add(nl);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        close();
        return dsNguyenLieu;
    }
    
    public NguyenLieu doc(String maLoai)
    {
        open();
        ResultSet rs = executeQuery("Select * from NguyenLieuAn where MaLoai='" + maLoai + "'");
        
        try {
            while (rs.next())
            {
                NguyenLieu nl = new NguyenLieu();
                nl.maNguyenLieu = rs.getString("MaNguyenLieu");
                nl.tenNguyenLieu = rs.getString("TenNguyenLieu");
                nl.donViTinh = rs.getString("DonViTinh");
                nl.soLuong = rs.getInt("SoLuong");
                close();
                return nl;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        close();
        return null;
    }
}
