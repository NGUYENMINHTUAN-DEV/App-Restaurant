/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import DAO.*;

/**
 *
 * @author tuan
 */
public class NguyenLieuu {

    @Override
    public String toString() {
        return "NguyenLieuDAO{" + "MaNguyenLieu=" + MaNguyenLieu + ", TenNguyenLieu=" + TenNguyenLieu + ", DonViTinh=" + DonViTinh + ", SoLuong=" + SoLuong + '}';
    }
 
    public NguyenLieuu(String MaNguyenLieu, String TenNguyenLieu, String DonViTinh, int SoLuong) {
        this.MaNguyenLieu = MaNguyenLieu;
        this.TenNguyenLieu = TenNguyenLieu;
        this.DonViTinh = DonViTinh;
        this.SoLuong = SoLuong;
    }

    public String getMaNguyenLieu() {
        return MaNguyenLieu;
    }

    public void setMaNguyenLieu(String MaNguyenLieu) {
        this.MaNguyenLieu = MaNguyenLieu;
    }

    public String getTenNguyenLieu() {
        return TenNguyenLieu;
    }

    public void setTenNguyenLieu(String TenNguyenLieu) {
        this.TenNguyenLieu = TenNguyenLieu;
    }

    public String getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(String DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    private String MaNguyenLieu,TenNguyenLieu,DonViTinh;
    private int SoLuong;
}
