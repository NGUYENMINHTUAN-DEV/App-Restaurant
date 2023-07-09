/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import POJO.Ban;
import POJO.Ban_DatBanPOJO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author TRAN THANH NAM
 */
public class Ban_DatBanDAO {
    public static ArrayList<Ban> getDSB(){
        ArrayList<Ban> dsdp = new ArrayList<Ban>();
        try {
            String sql = "select * From Ban where TrangThai = N'CÒN TRỐNG'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                Ban b = new Ban();
                b.maBan = rs.getString("MaBan");
                b.tenBan = rs.getString("TenBan");
                b.soGhe = rs.getInt("SoGhe");
                b.trangThai = rs.getString("TrangThai");
                dsdp.add(b);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu bàn");
        }
        return dsdp;
    }
    public static ArrayList<Ban_DatBanPOJO> getDSDB(){
        ArrayList<Ban_DatBanPOJO> dsdb = new ArrayList<Ban_DatBanPOJO>();
        try {
            String sql = "select * from DatBan";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                Ban_DatBanPOJO b = new Ban_DatBanPOJO(rs.getString("MaDatBan").trim(), rs.getString("MaBan").trim(), rs.getString("MaNV").trim(), rs.getString("ThoiGian").trim(),rs.getString("MaKhachHang").trim(),rs.getString("TinhTrang").trim(),rs.getInt("SoLuongKhach"));
                dsdb.add(b);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu dat bàn");
        }
        return dsdb;
    }
     public static ArrayList<Ban_DatBanPOJO> TimDSDB(String madatban){
        ArrayList<Ban_DatBanPOJO> dsdp = new ArrayList<Ban_DatBanPOJO>();
        try {
            String sql = "select * from DatBan where MaDatBan like '"+madatban+"'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
               Ban_DatBanPOJO b = new Ban_DatBanPOJO(rs.getString("MaDatBan").trim(), rs.getString("MaBan").trim(), rs.getString("MaNV").trim(), rs.getString("ThoiGian").trim(),rs.getString("MaKhachHang").trim(),rs.getString("TinhTrang").trim(),rs.getInt("SoLuongKhach"));
                dsdp.add(b);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu bàn");
        }
        return dsdp;
    }
    
     public static String TimtenDatBan(String madatphong){
        String tenkhachhang="";
        try {
            String sql = "select MaKhachHang from DatBan where MaDatBan like '"+madatphong+"'";
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
    public static int ThemXoaSuaDatBan(String sql){
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
    

    
    public static void XoaDatPhong(ArrayList<Ban_DatBanPOJO> dsdp, String madatban){
        dsdp.removeIf(x -> x.getMadatban().equals(madatban));
    }
    
    public static void SuaDatPhong(ArrayList<Ban_DatBanPOJO> dsdp, Ban_DatBanPOJO datbN){
        for(Ban_DatBanPOJO b: dsdp){
            if(b.getMadatban().equals(datbN.getMadatban())){
                b.setMakhachhang(datbN.getMakhachhang());
            }
        }
    }
   
    public static void SuaTrangThaiBan(ArrayList<Ban_DatBanPOJO> dsdp, String madatban, String trangthai){
        for(Ban_DatBanPOJO b: dsdp){
            if(b.getMadatban().equals(madatban)){
                b.setMakhachhang(trangthai);
            }
        }
    }
}
