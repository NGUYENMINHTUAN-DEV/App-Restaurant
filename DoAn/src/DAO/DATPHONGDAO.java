/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.DatPhong;
import POJO.Phong;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tuan
 */
public class DATPHONGDAO {
    public static ArrayList<DatPhong> getDPP(){
        ArrayList<DatPhong> dsdp = new ArrayList<DatPhong>();
        try {
            String sql = "select * from DatPhong";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                DatPhong b = new DatPhong(rs.getString("MaDatPhong").trim(), rs.getString("MaPhong").trim(), rs.getString("MaNV").trim(), rs.getString("MaKhachHang").trim(),rs.getString("ThoiGian").trim(),rs.getInt("SoLuongKhach"), rs.getInt("SDT"));
                dsdp.add(b);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu bàn");
        }
        return dsdp;
    }
     public static ArrayList<DatPhong> TimDSDP(String madatphong){
        ArrayList<DatPhong> dsdp = new ArrayList<DatPhong>();
        try {
            String sql = "select * from DatPhong where MaDatPhong like '"+madatphong+"'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
               DatPhong b = new DatPhong(rs.getString("MaDatPhong").trim(), rs.getString("MaPhong").trim(), rs.getString("MaNV").trim(), rs.getString("MaKhachHang").trim(),rs.getString("ThoiGian").trim(),rs.getInt("SoLuongKhach"), rs.getInt("SDT"));
                dsdp.add(b);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu bàn");
        }
        return dsdp;
    }
    
     public static String TimtenDatPhong(String madatphong){
        String tenkhachhang="";
        try {
            String sql = "select MaKhachHang from DatPhong where MaDatPhong like '"+madatphong+"'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                 tenkhachhang=rs.getString(1);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu bàn");
        }
        return tenkhachhang;
    }
    public static int ThemXoaSuaDatPhong(String sql){
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
    

    
    public static void XoaDatPhong(ArrayList<DatPhong> dsdp, String madatphong){
        dsdp.removeIf(x -> x.getMaDatPhong().equals(madatphong));
    }
    
    public static void SuaDatPhong(ArrayList<DatPhong> dsdp, DatPhong datphong){
        for(DatPhong b: dsdp){
            if(b.getMaDatPhong().equals(datphong.getMaDatPhong())){
                b.setMaKH(datphong.getMaKH());
            }
        }
    }
   
    public static void SuaTrangThaiBan(ArrayList<DatPhong> dsdp, String madatphong, String trangthai){
        for(DatPhong b: dsdp){
            if(b.getMaDatPhong().equals(madatphong)){
                b.setMaKH(trangthai);
            }
        }
    }
    
    
}
