/*
 
 */
package POJO;

/**
 *
 * @author tuan
 */
public class Phong {

    
    
    public Phong(String MaPhong, String TenPhong, String TrangThai, int SoLuongKhachToiDa, float DonGiaThue) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.TrangThai = TrangThai;
        this.SoLuongKhachToiDa = SoLuongKhachToiDa;
        this.DonGiaThue = DonGiaThue;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public int getSoLuongKhachToiDa() {
        return SoLuongKhachToiDa;
    }

    public void setSoLuongKhachToiDa(int SoLuongKhachToiDa) {
        this.SoLuongKhachToiDa = SoLuongKhachToiDa;
    }

    public float getDonGiaThue() {
        return DonGiaThue;
    }

    public void setDonGiaThue(float DonGiaThue) {
        this.DonGiaThue = DonGiaThue;
    }
    private String MaPhong,TenPhong,TrangThai;
    private int SoLuongKhachToiDa;
    private float DonGiaThue;
    
    @Override
    public String toString() {
        return "Phong{" + "MaPhong=" + MaPhong + ", TenPhong=" + TenPhong + ", TrangThai=" + TrangThai + ", SoLuongKhachToiDa=" + SoLuongKhachToiDa + ", DonGiaThue=" + DonGiaThue + '}';
    }
    public Phong(){
        
    }
}
