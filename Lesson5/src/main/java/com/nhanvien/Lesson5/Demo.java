/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhanvien.Lesson5;

/**
 *
 * @author ADMIN
 */
public class Demo {
    public static void main(String[] args) {
        NhanVien a = new NhanVien("Huy nguyen", "Quang Ngai");
        NhanVien a1 = new NhanVienBP(BoPhan.Bo_Phan_A,"Huy nguyen", "Quang Ngai");
        NhanVien a3 = new NhanVienBP(BoPhan.Bo_Phan_B,"Ti nguyen", "Quang Nam");
        NhanVien a4 = new NhanVienBP(BoPhan.Bo_Phan_C,"Teo nguyen", "Quang Binh");
        NhanVien a2 = new NhanVien("Huy nguyen Quoc", "Quang Ngai");
        QlNhanVien ds = new QlNhanVien();
        ds.them(a, a1, a2, a3, a4);
        ds.hienThi();
        
        System.out.printf("%.1f ngan dong\n",a.tinhLuong(2));
        System.out.printf("%.1f ngan dong\n",a1.tinhLuong(2));
        System.out.printf("%.1f ngan dong\n",a3.tinhLuong(2));
        System.out.printf("%.1f ngan dong\n",a4.tinhLuong(2));
    }
}
