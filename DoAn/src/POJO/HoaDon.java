/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

import java.util.Date;

/**
 *
 * @author Thuong Nguyen
 */
public class HoaDon {
    private int maHoaDon;
    private int maKhachHang;
    private String maNhanVien;
    private Date ngayThanhToan;
    private String trangThai;
    private int tongTien;

    public HoaDon() {
    }

    public HoaDon(int maHoaDon, int maKhachHang, String maNhanVien, Date ngayThanhToan, String trangThai, int tongTien) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
        this.ngayThanhToan = ngayThanhToan;
        this.trangThai = trangThai;
        this.tongTien = tongTien;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    
}
