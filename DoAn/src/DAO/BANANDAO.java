/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import POJO.BanAn;

/**
 *
 * @author Thuong Nguyen
 */
public class BANANDAO {

   public static ArrayList loadBanAn() {
        try {
            ArrayList<BanAn> list = new ArrayList<>();
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            String sql = "select * from BAN";
            ResultSet resultSet = cnn.executeQuery(sql);
            while (resultSet.next()) {
                BanAn x = new BanAn();
                x.setMaBan(resultSet.getString("MABAN"));
                x.setTenBan(resultSet.getString("TENBAN"));
                list.add(x);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
