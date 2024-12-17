/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lesson5;

import java.io.FileNotFoundException;
import java.math.BigDecimal;

/**
 *
 * @author ADMIN
 */
public class Lesson5 {

    public static void main(String[] args) throws FileNotFoundException {
        TaiKhoan a = new TaiKhoan("Huy Nguyen", new BigDecimal(100000));
        TaiKhoan a1 = new TaiKhoanCoKH(KyHan.MOT_TUAN, "Huy nguyen", new BigDecimal(999900000));
        TaiKhoan a2 = new TaiKhoanCoKH(KyHan.MOT_THANG,"Huy Nguyen", new BigDecimal(10544300));
        TaiKhoan a3 = new TaiKhoanCoKH(KyHan.MOT_NAM, "Huy nguyen Quoc", new BigDecimal(999900000));
        QlTaiKhoan ds = new QlTaiKhoan();
        ds.them(a, a1, a2, a3);
        ds.them("D:\\Work place\\Code\\JAVA\\Java\\Lesson5\\src\\resources\\taikhoan.txt");
        ds.hienThi();
    }
}
