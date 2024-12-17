/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giaovien.Lesson5;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public abstract class GiangVien {
    private String ten;
    private LocalDate ngaySinh;
    private String hocHam;
    private String hocVi;
    private LocalDate ngayBatDau;

    public GiangVien(String ten, String ngaySinh, String hocHam, String hocVi, String ngayBatDau) {
        this.ten = ten;
        this.ngaySinh = LocalDate.parse(ngaySinh,CauHinh.FORMATTER);
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.ngayBatDau = LocalDate.parse(ngayBatDau,CauHinh.FORMATTER);
    }

    public abstract double tinhTienLuong(float soGioLam);
    
    @Override
    public String toString() {
        return String.format("==============\nTen: %s\nNgaysinh: %s\nHocham: %s\nHocVi: %s\nNgaybatdau: %s", 
                this.ten, this.ngaySinh.format(CauHinh.FORMATTER),this.hocHam,this.hocVi,this.ngayBatDau.format(CauHinh.FORMATTER));
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public LocalDate getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(LocalDate ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }
    
    
}
