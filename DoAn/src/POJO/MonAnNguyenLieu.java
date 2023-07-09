/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author tuan
 */
public class MonAnNguyenLieu extends MonAn {

    public MonAnNguyenLieu(String Mamonan, String manguyenlieu, int soLuong, String tennguyenlieu) {
        this.Mamonan = Mamonan;
        this.manguyenlieu = manguyenlieu;
        this.soLuong = soLuong;
        this.tennguyenlieu = tennguyenlieu;
    }

    public String getMamonan() {
        return Mamonan;
    }

    public void setMamonan(String Mamonan) {
        this.Mamonan = Mamonan;
    }

    public String getManguyenlieu() {
        return manguyenlieu;
    }

    public void setManguyenlieu(String manguyenlieu) {
        this.manguyenlieu = manguyenlieu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTennguyenlieu() {
        return tennguyenlieu;
    }

    public void setTennguyenlieu(String tennguyenlieu) {
        this.tennguyenlieu = tennguyenlieu;
    }

    private String Mamonan;
    private String manguyenlieu;
    private int soLuong;
    private String tennguyenlieu;
   

    public MonAnNguyenLieu() {
    }

    
}
  
  
