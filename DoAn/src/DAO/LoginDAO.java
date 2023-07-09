/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Maitr
 */
public class LoginDAO {

    public NhanVien getEmployeeByUsernameAndPassword(String username, String password, String quyen) {
        NhanVien employee = null;
        ConnectionDB conet = new ConnectionDB();
        String query = "Select * from NHANVIEN n where n.TAIKHOAN = ? and n.MATKHAU = ? and n.QUYEN = ?";

        try (Connection connection = conet.getCn(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, quyen);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Quyền của bạn là: " + quyen);
                String maNV = resultSet.getString("MaNV").trim();
                String mabp = resultSet.getString("MABP").trim();
                String hoten = resultSet.getString("HOTENNV").trim();
                String sdt = resultSet.getString("SDT").trim();
                String ngaysinh = resultSet.getString("NGAYSINH").trim();
                String gioitnh = resultSet.getString("GIOITINH").trim();
                String diachi = resultSet.getString("DIACHI").trim();
                String hinhANh = resultSet.getString("HINH");
                if (hinhANh != null && !hinhANh.trim().isEmpty()) {
                    // Xử lý giá trị name ở đây
                    hinhANh = resultSet.getString("HINH").trim();
                } else {
                    hinhANh = null;
                }
                employee = new NhanVien(maNV, hoten, sdt, ngaysinh, gioitnh, diachi, hinhANh, username, password, quyen);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }
  
}
