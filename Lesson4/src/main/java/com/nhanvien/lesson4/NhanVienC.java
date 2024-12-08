/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhanvien.lesson4;

/**
 *
 * @author ADMIN
 */
public class NhanVienC extends NhanVien{
    public NhanVienC(long cmnd, String hoTen, String queQuan, String gt, long sdt) {
        super(cmnd, hoTen, queQuan, gt, sdt);
    }
    
    public double heSoLuong(){
        return 2.5;
    }

    @Override
    public String toString() {
        return "NhanVien NHOM C\n"+super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
