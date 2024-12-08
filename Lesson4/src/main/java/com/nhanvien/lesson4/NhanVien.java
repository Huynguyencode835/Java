/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhanvien.lesson4;

/**
 *
 * @author ADMIN
 */
public abstract class NhanVien {
    private int ms;
    private static int cnt =1;
    {
        this.ms=cnt++;
    }
    private long cmnd;
    private String hoTen;
    private String queQuan;
    private String gt;
    private long sdt;

    public NhanVien(long cmnd, String hoTen, String queQuan, String gt, long sdt) {
        this.cmnd = cmnd;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.gt = gt;
        this.sdt = sdt;
    }

    public abstract double heSoLuong();
    
    public double luong(int soNgayCong){
        return this.heSoLuong()*100*soNgayCong;
    }

//    @Override
//    public String toString() {
//        return String.format("MS: %i\nCMND: %i\nHOTEN: %s\nQHEQUAN: %s\nGIOITINH: %s\nSDT: %i\n"
//                ,this.ms,this.cmnd,this.hoTen,this.queQuan,this.gt,this.sdt);
//    }
   
    @Override public String toString() { 
        return String.format("MS: %d\nCMND: %d\nHOTEN: %s\nQUEQUAN: %s\nGIOITINH: %s\nSDT: %d\n"
            , this.ms, this.cmnd, this.hoTen, this.queQuan, this.gt, this.sdt); 
    }
    
    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public long getCmnd() {
        return cmnd;
    }

    public void setCmnd(long cmnd) {
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public long getSdt() {
        return sdt;
    }

    public void setSdt(long sdt) {
        this.sdt = sdt;
    }
    
}
