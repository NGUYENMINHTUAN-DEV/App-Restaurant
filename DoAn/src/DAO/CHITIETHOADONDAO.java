/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Thuong Nguyen
 */
public class CHITIETHOADONDAO {

    public static boolean themChiTietHoaDon(String maHoaDon, String maBan) {
         try {
            String sql = "select * from CHITIETDATBAN where MABAN='" + maBan + "'";
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            ResultSet resultSet = cnn.executeQuery(sql);
            while (resultSet.next()) {
                String sqlCTHD = "insert into CHITIETHOADON values('" + maHoaDon + "','" + resultSet.getString("MAMONAN") + "','" + resultSet.getString("SOLUONG") + "')";
                cnn.executeUpdate(sqlCTHD);
            }
//            String sqlDeletePhieuGoiMon = "delete from PHIEUGOIMON where MABAN='" + maBan + "'";
//            serverProvider.executeUpdate(sqlDeletePhieuGoiMon);
            cnn.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
