/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhanvien.Lesson5;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
    private static int cnt = 0;
    private String ms;
    private String ten;
    private String queQuan;
    {
        this.ms=String.format("%06d", ++cnt);
    }
    public NhanVien(String ten, String queQuan) {
        this.ten = ten;
        this.queQuan = queQuan;
    }
    
    public double tinhLuong(int ngayCong){
        return (100.0*ngayCong);
    }

    @Override
    public String toString() {
        return String.format("Ms: %s\nHoten: %s\nQueQuan: %s\n", this.ms,this.ten,this.queQuan);
    }
    
    
}
