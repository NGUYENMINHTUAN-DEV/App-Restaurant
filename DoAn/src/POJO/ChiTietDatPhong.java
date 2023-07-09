/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author tuan
 */
public class ChiTietDatPhong {

    @Override
    public String toString() {
        return "ChiTietDatPhong{" + "MaDatPhong=" + MaDatPhong + ", MaMonAn=" + MaMonAn + ", SoLuong=" + SoLuong + '}';
    }

    public ChiTietDatPhong(String MaDatPhong, String MaMonAn, int SoLuong) {
        this.MaDatPhong = MaDatPhong;
        this.MaMonAn = MaMonAn;
        this.SoLuong = SoLuong;
    }

    public String getMaDatPhong() {
        return MaDatPhong;
    }

    public void setMaDatPhong(String MaDatPhong) {
        this.MaDatPhong = MaDatPhong;
    }

    public String getMaMonAn() {
        return MaMonAn;
    }

    public void setMaMonAn(String MaMonAn) {
        this.MaMonAn = MaMonAn;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    private String MaDatPhong, MaMonAn;
    private int SoLuong;
    
}
