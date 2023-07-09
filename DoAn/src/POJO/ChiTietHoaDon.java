/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author 
 */
public class ChiTietHoaDon {
    private int maHoaDon;
    private int maMonAn;
    private int soLuong;
    private String tenMonAn;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int maHoaDon, int maMonAn, int soLuong, String tenMonAn) {
        this.maHoaDon = maHoaDon;
        this.maMonAn = maMonAn;
        this.soLuong = soLuong;
        this.tenMonAn = tenMonAn;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public int getMaMonAn() {
        return maMonAn;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setMaMonAn(int maMonAn) {
        this.maMonAn = maMonAn;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }
    

}
