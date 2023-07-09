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
public class ChiTietDatMon {

    @Override
    public String toString() {
        return "ChiTietDatMon{" + "MaBan=" + MaBan + ", TenBan=" + TenBan + ", MaMonAn=" + MaMonAn + ", TenMonAn=" + TenMonAn + ", soluong=" + soluong + ", TamTinh=" + TamTinh + '}';
    }

    public ChiTietDatMon(String MaBan, String TenBan, String MaMonAn, String TenMonAn, int soluong, int TamTinh) {
        this.MaBan = MaBan;
        this.TenBan = TenBan;
        this.MaMonAn = MaMonAn;
        this.TenMonAn = TenMonAn;
        this.soluong = soluong;
        this.TamTinh = TamTinh;
    }

    public String getMaBan() {
        return MaBan;
    }

    public void setMaBan(String MaBan) {
        this.MaBan = MaBan;
    }

    public String getTenBan() {
        return TenBan;
    }

    public void setTenBan(String TenBan) {
        this.TenBan = TenBan;
    }

    public String getMaMonAn() {
        return MaMonAn;
    }

    public void setMaMonAn(String MaMonAn) {
        this.MaMonAn = MaMonAn;
    }

    public String getTenMonAn() {
        return TenMonAn;
    }

    public void setTenMonAn(String TenMonAn) {
        this.TenMonAn = TenMonAn;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getTamTinh() {
        return TamTinh;
    }

    public void setTamTinh(int TamTinh) {
        this.TamTinh = TamTinh;
    }
    private String MaBan,TenBan,MaMonAn,TenMonAn;
    private int soluong,TamTinh;
}
