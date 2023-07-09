/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author TRAN THANH NAM
 */
public class KHACHHANGDAO {
    public static ArrayList<KhachHang> getKH(){
        ArrayList<KhachHang> dskh = new ArrayList<KhachHang>();
        try {
            String sql = "select * from KHACHHANG";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                KhachHang b = new KhachHang(rs.getString("MaKhachHang").trim(), rs.getString("TenKhachHang").trim(),  rs.getInt("SDT"),rs.getString("NGSINH").trim());
                dskh.add(b);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu Khách hàng");
        }
        return dskh;
    }
     public static ArrayList<KhachHang> TimDSKH(String maphong){
        ArrayList<KhachHang> dskh = new ArrayList<KhachHang>();
        try {
            String sql = "select * from KhachHang where MaKhachHang like '"+maphong+"'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                KhachHang b = new KhachHang(rs.getString("MaKhachHang").trim(), rs.getString("TenKhachHang").trim(),  rs.getInt("SDT"),rs.getString("NGSINH").trim());
                dskh.add(b);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu Khách hàng");
        }
        return dskh;
    }
    
     public static String TimtenKH(String makh){
        String tenkh="";
        try {
            String sql = "select TenKhachHang from KHACHHANG where MaKhachHanglike '"+makh+"'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                 tenkh=rs.getString(1);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu Khách hàng");
        }
        return tenkh;
    }
    public static int ThemXoaSuaKH(String sql){
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
    

    
    public static void XoaKH(ArrayList<KhachHang> dskh, String makh){
        dskh.removeIf(x -> x.getMakh().equals(makh));
    }
    
    public static void SuaKH(ArrayList<KhachHang> dskh, KhachHang kh){
        for(KhachHang b: dskh){
            if(b.getMakh().equals(kh.getMakh())){
                b.setTenkh(kh.getTenkh());
            }
        }
    }
   
}
