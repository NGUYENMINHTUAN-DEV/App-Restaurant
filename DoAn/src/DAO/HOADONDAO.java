/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import POJO.ChiTietHoaDon;
import POJO.HoaDon;

/**
 *
 * @author Thuong Nguyen
 */
public class HOADONDAO {

      public static boolean themHoaDon(HoaDon x, String maNV) {
        try {
            Date currentDay = new Date();
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            String sql = "insert into HOADON values('" + maNV + "', 1, '" + new SimpleDateFormat("yyyy/MM/dd").format(currentDay) + "',N'Thanh toán','" + x.getTongTien() + "')";
            if (cnn.executeUpdate(sql)) {
                cnn.close();
                return true;
            }
            cnn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String getLastInsertMaHoaDon() {
        try {
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            String sql = "select * from HOADON";
            ResultSet resultSet = cnn.executeQuery(sql);
            if (resultSet.last()) {
                return resultSet.getString("MAHD");
            }
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<HoaDon> layDanhSachHoaDon() {
        ArrayList<HoaDon> dsHoaDon = new ArrayList<>();
        try {
            String sql = "Select * from HOADON";
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            ResultSet resultSet = cnn.executeQuery(sql);
            while (resultSet.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(resultSet.getInt(1));
                hd.setMaKhachHang(resultSet.getInt(2));
                hd.setMaNhanVien(resultSet.getString(3));
                hd.setNgayThanhToan(resultSet.getDate(4));
                hd.setTrangThai(resultSet.getString(5));
                hd.setTongTien(resultSet.getInt(6));
                dsHoaDon.add(hd);
            }
            cnn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsHoaDon;
    }

    public static ArrayList<ChiTietHoaDon> layDanhSachCTHoaDon(String ma) {
        ArrayList<ChiTietHoaDon> dsCTHoaDon = new ArrayList<>();
        try {
            String sql = "Select * from CHITIETHOADON, MONAN  WHERE  CHITIETHOADON.MAMONAN = MONAN.MAMONAN AND MAHD='" + ma + "'";
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            ResultSet resultSet = cnn.executeQuery(sql);
            while (resultSet.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon();
                cthd.setMaHoaDon(resultSet.getInt("MAHD"));
                //cthd.setMaMonAn(resultSet.getInt(2));
                cthd.setSoLuong(resultSet.getInt("SOLUONG"));
                cthd.setTenMonAn(resultSet.getString("TENMONAN"));
                dsCTHoaDon.add(cthd);
            }
            cnn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsCTHoaDon;
    }
}