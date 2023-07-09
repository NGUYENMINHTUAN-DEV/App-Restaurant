/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 */
public class Ban_DatBanPOJO {
   private String madatban, maban, manv, thoigian, Makhachhang, tinhtrang;
   private int soluongkhach;

   public Ban_DatBanPOJO(){
       
   }
   public Ban_DatBanPOJO(String madatban,String maban,String manv,String thoigian,String Makhachhang,String tinhtrang, int soluongkhach){
       this.madatban = madatban;
       this.maban  = maban;
       this.manv = manv;
       this.thoigian = thoigian;
       this.Makhachhang = Makhachhang;
       this.tinhtrang = tinhtrang;
       this.soluongkhach = soluongkhach;
   }
    public String getMadatban() {
        return madatban;
    }

    public void setMadatban(String madatban) {
        this.madatban = madatban;
    }

    public String getMaban() {
        return maban;
    }

    public void setMaban(String maban) {
        this.maban = maban;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public String getMakhachhang() {
        return Makhachhang;
    }

    public void setMakhachhang(String Makhachhang) {
        this.Makhachhang = Makhachhang;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public int getSoluongkhach() {
        return soluongkhach;
    }

    public void setSoluongkhach(int soluongkhach) {
        this.soluongkhach = soluongkhach;
    }
     @Override
    public String toString() {
        return "DatBan{" + "MaDatBan=" + madatban + ", MaBan=" + maban + ", MaNV=" + manv + ", MaKH=" + Makhachhang + ", ThoiGian=" + thoigian + ", SoLuongKhach=" + soluongkhach + ", Tình trạng=" + tinhtrang + '}';
    }
}
