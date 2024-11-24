/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nganhang.lesson4;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class Demo {

    public static void main(String[] args) {
        TaiKhoan a = new TaiKhoanKKH("Huy Nguyen", "0816712272", "ssss", 10, "12/12/2005", "Hoat dong");
        a.hienThi();
        TaiKhoan b = new TaiKhoanKH(TaiKhoanKH.KyHan.MOT_NAM,"05/05/2005","Huy Nguyen", "0816712272", "ssss", 10, "12/12/2005", "Hoat dong");
        b.hienThi();
    }
}
