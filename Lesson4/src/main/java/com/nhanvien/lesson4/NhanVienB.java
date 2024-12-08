/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhanvien.lesson4;

/**
 *
 * @author ADMIN
 */
public class NhanVienB extends NhanVien{
    public NhanVienB(long cmnd, String hoTen, String queQuan, String gt, long sdt) {
        super(cmnd, hoTen, queQuan, gt, sdt);
    }
    
    public double heSoLuong(){
        return 1.2;
    }

    @Override
    public String toString() {
        return "NhanVien NHOM B\n"+super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
