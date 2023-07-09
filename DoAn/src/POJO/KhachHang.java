/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author
 */
public class KhachHang {

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getNgsinh() {
        return ngsinh;
    }

    public void setNgsinh(String ngsinh) {
        this.ngsinh = ngsinh;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }
    private String makh, tenkh, ngsinh;
    private int sdt;
    public KhachHang(String makh,String tenkh,int sdt, String ngsinh){
        this.makh = makh;
        this.tenkh = tenkh;
        this.sdt = sdt;
        this.ngsinh = ngsinh;
    }
    public KhachHang(){
        
    }

    
}
