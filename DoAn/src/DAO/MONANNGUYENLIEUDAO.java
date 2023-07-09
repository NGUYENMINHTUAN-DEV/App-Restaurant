/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import POJO.MonAnNguyenLieu;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tuan
 */
public class MONANNGUYENLIEUDAO {
  
     public static boolean themChiTietHoaDon(String Manguyenlieu, String MaMon) {
         try {
            String sql = "select * from MonAn_NguyenLieu where MaMonAn='" + Manguyenlieu + "'";
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            ResultSet resultSet = cnn.executeQuery(sql);
            while (resultSet.next()) {
               
            }
//            String sqlDeletePhieuGoiMon = "delete from PHIEUGOIMON where MABAN='" + maBan + "'";
//            serverProvider.executeUpdate(sqlDeletePhieuGoiMon);
            cnn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
     public static ArrayList<MonAnNguyenLieu> TimDSNL(String mamon){
        ArrayList<MonAnNguyenLieu> dsmanl = new ArrayList<MonAnNguyenLieu>();
        try {
            String sql = "select * from MonAn_NguyenLieu where MaMonAn like '"+mamon+"'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                 // MoAnNguyenLieu b = new MoAnNguyenLieu(rs.getString("MaMonAn").trim(), rs.getString("MaNguyenLieu").trim(), rs.getInt("SoLuong"));
               // dsmanl.add(b);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return dsmanl;
    }
    
   
    public static int ThemXoaSua(String sql){
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
 
}
