/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author 
 */
public class PhieuGoiMon {

    private int maDatban;
    private int maBan;
    private String maNhanVien;
    private int maMonAn;
    private int soLuong;
    private String tenMonAn;
    private float donGia;

    public PhieuGoiMon(int maDatban, int maBan, String maNhanVien, int maMonAn, int soLuong, String tenMonAn, float donGia) {
        this.maDatban = maDatban;
        this.maBan = maBan;
        this.maNhanVien = maNhanVien;
        this.maMonAn = maMonAn;
        this.soLuong = soLuong;
        this.tenMonAn = tenMonAn;
        this.donGia = donGia;
    }
    public PhieuGoiMon(int maMonAn, int maBan) {
        this.maMonAn = maMonAn;
        this.maBan = maBan;
    }

    public PhieuGoiMon() {
    }

    public int getMaDatban() {
        return maDatban;
    }

    public void setMaDatban(int maDatban) {
        this.maDatban = maDatban;
    }

    public int getMaBan() {
        return maBan;
    }

    public void setMaBan(int maBan) {
        this.maBan = maBan;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getMaMonAn() {
        return maMonAn;
    }

    public void setMaMonAn(int maMonAn) {
        this.maMonAn = maMonAn;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    

}
