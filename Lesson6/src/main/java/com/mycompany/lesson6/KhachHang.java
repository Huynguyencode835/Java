/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson6;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.xml.crypto.Data;

/**
 *
 * @author ADMIN
 */
public class KhachHang {
    protected static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static int cnt=1;
    private String maSo;
    private String hoTen;
    private LocalDate ngaySinh;
    private BigDecimal soSu;
    {
        if (cnt > 9999) {
            throw new IllegalStateException("Quá số lượng khách hàng."); 
        }
        this.maSo = String.format("KH-%04d", cnt++);
    }
    public KhachHang(String hoTen, String ngaySinh, BigDecimal soSu) {
        this.hoTen = hoTen;
        this.ngaySinh = LocalDate.parse(ngaySinh,FORMATTER);
        this.soSu = soSu;
    }

    public int tinhTuoi(){
        return LocalDate.now().getYear() - this.ngaySinh.getYear();
    }
    
    public int soSanhSoDu(KhachHang kh){
        return this.soSu.compareTo(kh.getSoSu());
    }

    
    @Override
    public String toString() {
        return String.format("===============\nMaso: %s\nHoten: %s\nNgaySinh: %s_ %d tuoi\nSodu: %.1f\n",
                this.maSo,this.hoTen,this.ngaySinh.format(FORMATTER),this.tinhTuoi(),this.soSu);
    }
    
    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        KhachHang.cnt = cnt;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public BigDecimal getSoSu() {
        return soSu;
    }

    public void setSoSu(BigDecimal soSu) {
        this.soSu = soSu;
    }
    
    
}
