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
import POJO.MonAn;
import POJO.MonAnNguyenLieu;

/**
 *
 * @author Thuong Nguyen
 */
public class MonAnDAO {

    public static ArrayList<MonAn> showMonAn(String key) {
        ArrayList<MonAn> dsMA = new ArrayList<>();
        try {
            String sql;
            if (key.isEmpty()) {
                sql = "SELECT * FROM MONAN, LOAIMONAN WHERE MONAN.MALOAI=LOAIMONAN.MALOAI";
            } else {
                sql = "SELECT * FROM MONAN, LOAIMONAN WHERE MONAN.MALOAI=LOAIMONAN.MALOAI AND (MAMONAN LIKE '%" + key + "%' OR TENLOAI LIKE '%" + key + "%' OR TENMONAN LIKE '%" + key + "%' OR SOLUONG LIKE '%" + key + "%' OR DONVITINH LIKE '%" + key + "%' OR DONGIA LIKE '%" + key + "%' OR MONAN.MOTA LIKE '%" + key + "%')";
            }
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            ResultSet resultSet = cnn.executeQuery(sql);
            while (resultSet.next()) {
                MonAn ma = new MonAn();
                ma.setMaMonAn(resultSet.getInt("MAMONAN"));
                ma.setTenLoai(resultSet.getString(2));
                ma.setTenMonAn(resultSet.getString("TENMONAN"));
                ma.setSoLuong(resultSet.getInt("SOLUONG"));
                ma.setDonViTinh(resultSet.getString("DONVITINH"));
                ma.setDonGia(resultSet.getInt("DONGIA"));
                ma.setMoTa(resultSet.getString("MOTA"));
                ma.setHinh(resultSet.getString("HINH"));

                dsMA.add(ma);
            }
            cnn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsMA;
    }

    public static boolean themCSDL(MonAn m) {
        boolean kq = false;
        String sql = "INSERT INTO MONAN VALUES(N'" + m.getTenMonAn() + "',  N'" + m.getHinh() + "', " + m.getDonGia() + ", N'" + m.getMaLoai() + "', N'" + m.getDonViTinh() + "', " + m.getSoLuong() + ",  N'" + m.getMoTa() + "')";
        ConnectionDB cnn = new ConnectionDB();
        cnn.getCn();
        if (cnn.executeUpdate(sql)) {
            kq = true;
        }
        cnn.close();
        return kq;
    }

    public static boolean capNhatCSDL(MonAn m) {
        boolean kq = false;
        String sql = "UPDATE MONAN SET TENMONAN=N'" + m.getTenMonAn() + "', HINH=N'" + m.getHinh() + "', DONGIA=" + m.getDonGia() + ", MALOAI='" + m.getMaLoai() + "', DONVITINH=N'" + m.getDonViTinh() +  "', SOLUONG=" + m.getSoLuong() + ", MOTA=N'" + m.getMoTa() + "' where MAMONAN='" + m.getMaMonAn() +"'" ;
        ConnectionDB cnn = new ConnectionDB();
        cnn.getCn();
        if (cnn.executeUpdate(sql)) {
            kq = true;
        }
        cnn.close();
        return kq;
    }

    public static boolean xoaCSDL(MonAn m) {
        boolean kq = false;
        String sql = "DELETE FROM MONAN WHERE MAMONAN='" + m.getMaMonAn() + "'";
        ConnectionDB cnn = new ConnectionDB();
        cnn.getCn();
        if (cnn.executeUpdate(sql)) {
            kq = true;
        }
        cnn.close();
        return kq;
    }

    public static ArrayList<MonAn> loadMonAn() {
        try {
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            String sql = "select * from MONAN";
            ResultSet resultSet = cnn.executeQuery(sql);
            ArrayList<MonAn> dsMonAn = new ArrayList<>();
            while (resultSet.next()) {
                MonAn monAn = new MonAn();
                monAn.setMaMonAn(resultSet.getInt("MAMONAN"));
                monAn.setMaLoai(resultSet.getInt("MALOAI"));
                monAn.setTenMonAn(resultSet.getString("TENMONAN"));
                monAn.setHinh(resultSet.getString("HINH"));
                monAn.setDonGia(resultSet.getInt("DONGIA"));
                dsMonAn.add(monAn);
            }
            return dsMonAn;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static MonAn getOneMonAnByMaMonAn(String maMonAn) {
        try {
            String sql = "select * from MONAN where MAMONAN='" + maMonAn + "'";
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            ResultSet resultSet = cnn.executeQuery(sql);
            if (resultSet.next()) {
                MonAn x = new MonAn();
                x.setMaMonAn((resultSet.getInt("MAMONAN")));
                x.setMaLoai(resultSet.getInt("MALOAI"));
                x.setTenMonAn(resultSet.getString("TENMONAN"));
                x.setHinh(resultSet.getString("HINH"));
                x.setDonGia(resultSet.getInt("DONGIA"));

                cnn.close();
                return x;
            }
            cnn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int getSoLuongByMaMonAn(String maMonAn) {
        try {
            String sql = "select * from MONAN where MAMONAN='" + maMonAn + "'";
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            ResultSet resultSet = cnn.executeQuery(sql);
            if (resultSet.next()) {
                return resultSet.getInt("SOLUONG");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static ArrayList getThongKeTienBanDuoc(Date s, Date f) {
        try {
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
//           String s1 = new SimpleDateFormat("yyyy/MM/dd").format(s);
//           String s2 = new SimpleDateFormat("dd/MM/yyyy").format(s);

            String sql = "SELECT * FROM  F_TK_TienTungSanPham('" + new SimpleDateFormat("yyyy/MM/dd").format(s) + "','" + new SimpleDateFormat("yyyy/MM/dd").format(f) + "')";
            ResultSet resultSet = cnn.executeQuery(sql);
            ArrayList<MonAn> dsMonAn = new ArrayList<>();
            while (resultSet.next()) {
                MonAn monAn = new MonAn();
                monAn.setMaMonAn(resultSet.getInt("MASP"));
                monAn.setTenMonAn(resultSet.getString("TENSP"));
                monAn.setDonGia(resultSet.getInt("THANHTIEN"));
                dsMonAn.add(monAn);
            }
            return dsMonAn;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList getThongKeSoLuongBanDuoc(Date s, Date f) {
        try {
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
//           String s1 = new SimpleDateFormat("yyyy/MM/dd").format(s);
//           String s2 = new SimpleDateFormat("dd/MM/yyyy").format(s);

            String sql = "SELECT * FROM  F_TK_SLTungSanPham('" + new SimpleDateFormat("yyyy/MM/dd").format(s) + "','" + new SimpleDateFormat("yyyy/MM/dd").format(f) + "')";
            ResultSet resultSet = cnn.executeQuery(sql);
            ArrayList<MonAn> dsMonAn = new ArrayList<>();
            while (resultSet.next()) {
                MonAn monAn = new MonAn();
                monAn.setMaMonAn(resultSet.getInt("MASP"));
                monAn.setTenMonAn(resultSet.getString("TENSP"));
                monAn.setSoLuong(resultSet.getInt("SOLUONG"));
                dsMonAn.add(monAn);
            }
            return dsMonAn;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int getIndexMonAn(String maMonAn) {
        try {
            String sql;
            sql = "SELECT * FROM MONAN, LOAIMONAN WHERE MONAN.MALOAI=LOAIMONAN.MALOAI";
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            ResultSet resultSet = cnn.executeQuery(sql);
            while (resultSet.next()) {
                if(maMonAn.equals(resultSet.getString("MAMONAN")))
                    return resultSet.getRow()-1;
            }
            cnn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
      public static ArrayList<MonAnNguyenLieu> laydsnl(String ma) {
        ArrayList<MonAnNguyenLieu> dsNL = new ArrayList<>();
        try {
            String sql = "Select * from MonAn_NguyenLieu, NguyenLieu  WHERE  MonAn_NguyenLieu.MaNguyenLieu = NguyenLieu.MaNguyenLieu AND MaMonAn='" + ma + "'";
            ConnectionDB cnn = new ConnectionDB();
            cnn.getCn();
            ResultSet resultSet = cnn.executeQuery(sql);
            while (resultSet.next()) {
               MonAnNguyenLieu ds= new MonAnNguyenLieu();
                ds.setMamonan(resultSet.getString("MaMonAn"));
                ds.setManguyenlieu(resultSet.getString("MaNguyenLieu"));
              ds.setTennguyenlieu(resultSet.getString("TenNguyenLieu"));
                ds.setSoLuong(resultSet.getInt("SoLuong"));
                dsNL.add(ds);
            }
            cnn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNL;
    }
      public static ArrayList<String> getDSLOAI()
    {
        ArrayList<String> dsq = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT TENLOAI FROM LOAIMONAN";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next())
            {
               String q = rs.getString("TENLOAI");
               dsq.add(q);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return dsq;
    }
}
