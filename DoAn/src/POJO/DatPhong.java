/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.sql.Date;

/**
 *
 * @author tuan
 */
public class DatPhong {

    public DatPhong(String MaDatPhong, String MaPhong, String MaNV, String MaKH, String ThoiGian, int SoLuongKhach, int SDT) {
        this.MaDatPhong = MaDatPhong;
        this.MaPhong = MaPhong;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.ThoiGian = ThoiGian;
        this.SoLuongKhach = SoLuongKhach;
        this.SDT = SDT;
    }

    @Override
    public String toString() {
        return "DatPhong{" + "MaDatPhong=" + MaDatPhong + ", MaPhong=" + MaPhong + ", MaNV=" + MaNV + ", MaKH=" + MaKH + ", ThoiGian=" + ThoiGian + ", SoLuongKhach=" + SoLuongKhach + ", SDT=" + SDT + '}';
    }

    public String getMaDatPhong() {
        return MaDatPhong;
    }

    public void setMaDatPhong(String MaDatPhong) {
        this.MaDatPhong = MaDatPhong;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(String ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public int getSoLuongKhach() {
        return SoLuongKhach;
    }

    public void setSoLuongKhach(int SoLuongKhach) {
        this.SoLuongKhach = SoLuongKhach;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }
    private String MaDatPhong,MaPhong,MaNV,MaKH,ThoiGian;
    private int SoLuongKhach,SDT ;
    
}
