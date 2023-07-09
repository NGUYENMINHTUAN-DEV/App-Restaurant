/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author 
 */
public class MonAn extends LoaiMon {

    private int maMonAn;
    private String tenMonAn;
    private int soLuong;
    private String hinh;
    private String donViTinh;
    private int donGia;
    private String moTa;

    public MonAn() {
    }

    public MonAn(int maMonAn, String tenMonAn, int soLuong, String hinh, String donViTinh, int donGia, String moTa) {
        this.maMonAn = maMonAn;
        this.tenMonAn = tenMonAn;
        this.soLuong = soLuong;
        this.hinh = hinh;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
        this.moTa = moTa;
    }

    public MonAn(int maMonAn, String tenMonAn, int soLuong, String hinh, String donViTinh, int donGia, String moTa, int maLoai, String tenLoai) {
        super(maLoai, tenLoai);
        this.maMonAn = maMonAn;
        this.tenMonAn = tenMonAn;
        this.soLuong = soLuong;
        this.hinh = hinh;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
        this.moTa = moTa;
    }

    public int getMaMonAn() {
        return maMonAn;
    }

    public void setMaMonAn(int maMonAn) {
        this.maMonAn = maMonAn;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    
    @Override
    public String toString() {
        return this.getTenMonAn();
    }
}
