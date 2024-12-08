/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhanvien.lesson4;

/**
 *
 * @author ADMIN
 */
public class Demo {
    public static void main(String[] args) {
        NhanVien a = new NhanVienNormal(12355, "Nguyen Huy", "Quang ngai", "Nam", 987);
        NhanVien b = new NhanVienA(4569743, "Nguyen Quoc", "Quang nam", "Nu", 654);
        NhanVien d = new NhanVienB(456784, "Nguyen Quoc Huy", "Quang nam", "Nam", 654);
        NhanVien c = new NhanVienC(4565434, "Nguyen Quoc Huy", "Quang Binh", "Nu", 678654);
        
        QlNhanVien ds = new QlNhanVien();
        ds.them(a, b, c, d);
        ds.tim("Quang nam").stream().forEach(x->System.out.println(x));
    }
}
