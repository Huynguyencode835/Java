/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giaovien.Lesson5;

/**
 *
 * @author ADMIN
 */
public class GvCoHuu extends GiangVien{
    private double luongCoBan;
    private float heSo;

    public GvCoHuu(double luongCoBan, float heSo, String ten, String ngaySinh, String hocHam, String hocVi, String ngayBatDau) {
        super(ten, ngaySinh, hocHam, hocVi, ngayBatDau);
        this.luongCoBan = luongCoBan;
        this.heSo = heSo;
    }

    @Override
    public double tinhTienLuong(float soGioLam) {
        return this.luongCoBan*this.heSo+90*soGioLam;
    }

    
    @Override
    public String toString() {
        return "GV CO HUU\n"+super.toString()+"\n"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
