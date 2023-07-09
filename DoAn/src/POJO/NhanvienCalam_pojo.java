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
public class NhanvienCalam_pojo {

    
    public NhanvienCalam_pojo(String manv,String maca,String gioBD,String GioKT, String tenca){
        this.manv = manv;
        this.maca = maca;
        this.gioBD = gioBD;
        this.GioKT = GioKT;
        this.tenca = tenca;
    }
    public NhanvienCalam_pojo(){
        
    }
    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMaca() {
        return maca;
    }

    public void setMaca(String maca) {
        this.maca = maca;
    }

    public String getGioBD() {
        return gioBD;
    }

    public void setGioBD(String gioBD) {
        this.gioBD = gioBD;
    }

    public String getGioKT() {
        return GioKT;
    }

    public void setGioKT(String GioKT) {
        this.GioKT = GioKT;
    }
    private String manv, maca, gioBD, GioKT, tenca;

    public String getTenca() {
        return tenca;
    }

    public void setTenca(String tenca) {
        this.tenca = tenca;
    }
}
