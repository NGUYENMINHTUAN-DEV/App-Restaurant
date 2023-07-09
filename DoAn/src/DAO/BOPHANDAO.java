/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.BoPhan;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Thuong Nguyen
 */
public class BOPHANDAO {

    public static ArrayList<BoPhan> layDanhSachBoPhan() {
        ArrayList<BoPhan> dsBP = new ArrayList<>();
        try {
            String sql = "SELECT * FROM BOPHAN";
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            ResultSet rs = cnn.executeQuery(sql);
            while (rs.next()) {
                BoPhan bp = new BoPhan();
                bp.setMaBP(rs.getString("MABP"));
                bp.setTenBP(rs.getString("TENBP"));
                dsBP.add(bp);
            }
            cnn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsBP;
    }

}
