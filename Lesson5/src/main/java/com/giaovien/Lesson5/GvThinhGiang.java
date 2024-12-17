/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giaovien.Lesson5;

/**
 *
 * @author ADMIN
 */
public class GvThinhGiang extends GiangVien{
    private String noiCongTac;

    public GvThinhGiang(String noiCongTac, String ten, String ngaySinh, String hocHam, String hocVi, String ngayBatDau) {
        super(ten, ngaySinh, hocHam, hocVi, ngayBatDau);
        this.noiCongTac = noiCongTac;
    }

    @Override
    public double tinhTienLuong(float soGioLam) {
        return soGioLam*90;
    }

    @Override
    public String toString() {
        return "GV THINH GIANG\n"+super.toString()+String.format("\nNoi cong tac: %s\n", this.noiCongTac); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
