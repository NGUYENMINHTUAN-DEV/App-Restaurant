/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import POJO.Phong;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tuan
 */
public class PhongDAO {
    public static ArrayList<Phong> getDP(){
        ArrayList<Phong> dsp = new ArrayList<Phong>();
        try {
            String sql = "select * from Phong";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                Phong b = new Phong(rs.getString("MaPhong").trim(), rs.getString("TenPhong").trim(), rs.getString("TrangThai").trim(), rs.getInt("SoLuongKhachToiDa"), rs.getFloat("DonGiaThue"));
                dsp.add(b);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return dsp;
    }
     public static ArrayList<Phong> TimDSP(String maphong){
        ArrayList<Phong> dsp = new ArrayList<Phong>();
        try {
            String sql = "select * from Phong where MaPhong like '"+maphong+"'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                Phong b = new Phong(rs.getString("MaPhong").trim(), rs.getString("TenPhong").trim(), rs.getString("TrangThai").trim(),rs.getInt("SoLuongKhachToiDa"), rs.getFloat("DonGiaThue"));
                dsp.add(b);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return dsp;
    }
    
     public static String TimtenPhong(String maphong){
        String tenphong="";
        try {
            String sql = "select TenPhong from Phong where MaPhong like '"+maphong+"'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                 tenphong=rs.getString(1);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return tenphong;
    }
    public static int ThemXoaSuaPhong(String sql){
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
    

    
    public static void XoaPhong(ArrayList<Phong> dsp, String maphong){
        dsp.removeIf(x -> x.getMaPhong().equals(maphong));
    }
    
    public static void SuaBan(ArrayList<Phong> dsp, Phong phong){
        for(Phong b: dsp){
            if(b.getMaPhong().equals(phong.getMaPhong())){
                b.setTenPhong(phong.getTenPhong());
            }
        }
    }
   
    public static void SuaTrangThaiBan(ArrayList<Phong> dsp, String maphong, String trangthai){
        for(Phong b: dsp){
            if(b.getMaPhong().equals(maphong)){
                b.setTrangThai(trangthai);
            }
        }
    }
    
    public static Boolean KiemTraPhong(ArrayList<Phong> dsp, String maphong){
        for(Phong b : dsp)
            if(b.getMaPhong().equals(maphong) && b.getTrangThai().equals("Đang phục vụ"))
                return true;
        return false;        
    } 

 
}
