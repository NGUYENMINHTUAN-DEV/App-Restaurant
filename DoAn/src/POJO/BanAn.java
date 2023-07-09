/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author 
 */
public class BanAn {
    private String maBan;
    private String tenBan;
    private int soGhe;
    private String trangThai;

    public BanAn() {
    }

    public BanAn(String maBan, String tenBan, int soGhe, String trangThai) {
        this.maBan = maBan;
        this.tenBan = tenBan;
        this.soGhe = soGhe;
        this.trangThai = trangThai;
    }

    public String getMaBan() {
        return maBan;
    }

    public String getTenBan() {
        return tenBan;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
}
