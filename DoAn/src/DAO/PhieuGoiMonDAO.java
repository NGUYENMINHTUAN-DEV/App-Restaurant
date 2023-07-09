/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.PhieuGoiMon;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Thuong Nguyen
 */
public class PhieuGoiMonDAO {

    public static ArrayList<PhieuGoiMon> getPhieuGoiMonByMaBan(String maBan) {
        try {
            String sql = "select * from CHITIETDATBAN P,MONAN M where MABAN='" + maBan + "' AND P.MAMONAN=M.MAMONAN";
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            ResultSet resultSet = cnn.executeQuery(sql);
            ArrayList<PhieuGoiMon> dsPhieu = new ArrayList<>();
            while (resultSet.next()) {
                PhieuGoiMon phieuGoiMon = new PhieuGoiMon();
                //phieuGoiMon.setMaBan();
                phieuGoiMon.setMaMonAn(resultSet.getInt("MAMONAN"));
                phieuGoiMon.setMaNhanVien(resultSet.getString("MANV"));
                phieuGoiMon.setSoLuong(resultSet.getInt("SOLUONG"));
                phieuGoiMon.setTenMonAn(resultSet.getString("TENMONAN"));
                phieuGoiMon.setDonGia(resultSet.getInt("DONGIA"));
                dsPhieu.add(phieuGoiMon);
            }
            return dsPhieu;
        } catch (NumberFormatException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean themPhieuGoiMon(PhieuGoiMon x, String maNV) { 
        try {
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            String sql = "insert CHITIETDATBAN values('" + x.getMaDatban() + "','" + x.getMaBan() + "','" + maNV+ "','" + x.getMaMonAn() + "','" + x.getSoLuong()  + "')";
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

    public static boolean updatePhieuGoiMon(PhieuGoiMon x) {
        try {
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            String sql = "update CHITIETDATBAN SET SOLUONG='" + x.getSoLuong() + "' WHERE MAMONAN='" + x.getMaMonAn() + "' AND MABAN='" + x.getMaBan() + "'";
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

    public static boolean xoaPhieuGoiMon(PhieuGoiMon x) {
        try {
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            String sql = "delete from CHITIETDATBAN WHERE MABAN= '" + x.getMaBan() + "' AND MAMONAN= '" + x.getMaMonAn() + "'";
            
            boolean kq = cnn.executeUpdate(sql);
            cnn.close();
            return kq;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean deleteAllPhieuGoiMonByMaBan(String maBan) {
        try {
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            
            String sqlCallDisable="{call disableTrigger}";
            boolean kq= cnn.excuteCallable(sqlCallDisable);
            
            String sqlDeletePhieuGoiMon = "delete from CHITIETDATBAN where MABAN='" + maBan + "'";
            kq = cnn.executeUpdate(sqlDeletePhieuGoiMon);
            
            
            String sqlCallEnable="{call enableTrigger}";
            kq= cnn.excuteCallable(sqlCallEnable);
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static int findFootQuantityInPhieuGoiMon(PhieuGoiMon x) {
       
        try {
            ConnectionDB cnn = new ConnectionDB();
            String sql = "select * from CHITIETDATBAN where MABAN='" + x.getMaBan() + "' and MAMONAN='" + x.getMaMonAn() + "'";
            cnn.getCn();
            ResultSet resultSet = cnn.executeQuery(sql); 
            if (resultSet.next()) {
                return resultSet.getInt("SOLUONG");
            }
            cnn.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return -1;
    }

    public static boolean checkBanAnHasChecked(String maBan) {
        
        try {
            String sql = "select * from CHITIETDATBAN where MABAN='" + maBan + "'";
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            ResultSet rs = cnn.executeQuery(sql);
            if (rs.next()) {
                cnn.close();
                return true;
            }
            cnn.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return false;
    }
}
