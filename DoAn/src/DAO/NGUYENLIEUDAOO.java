/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.NguyenLieuu;
import POJO.NguyenLieuu;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuan
 */
public class NGUYENLIEUDAOO {
    public static ArrayList<NguyenLieuu> getNL(){
        ArrayList<NguyenLieuu> dsnl = new ArrayList<NguyenLieuu>();
        try {
            String sql = "select * from NguyenLieu";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                NguyenLieuu b = new NguyenLieuu(rs.getString("MaNguyenLieu").trim(), rs.getString("TenNguyenLieu").trim(), rs.getString("DonViTinh").trim(), rs.getInt("SoLuong"));
                dsnl.add(b);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu bàn");
        }
        return dsnl;
    }
     public static ArrayList<NguyenLieuu> TimNL(String manl){
        ArrayList<NguyenLieuu> dsnl = new ArrayList<NguyenLieuu>();
        try {
            String sql = "select * from NguyenLieu where MaNguyenLieu like '"+manl+"'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
               NguyenLieuu b = new NguyenLieuu(rs.getString("MaNguyenLieu").trim(), rs.getString("TenNguyenLieu").trim(), rs.getString("DonViTinh").trim(), rs.getInt("SoLuong"));
                dsnl.add(b);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu bàn");
        }
        return dsnl;
    }
    
   
    public static int ThemXoaSuaNL(String sql){
        int i=0;
        try {
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
             i = cn.executeUpdatee(sql);
            cn.close();
            System.out.println("Thêm/xóa/sửa thành công");
            
        } catch (Exception e) {
            System.out.println("Thêm/xóa/sửa không thành công");
           
        }
        return i;
    }

    public List<NguyenLieuu> doc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

 
}
