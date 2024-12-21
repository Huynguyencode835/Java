/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lesson6;

import java.io.FileNotFoundException;
import java.math.BigDecimal;

/**
 *
 * @author ADMIN
 */
public class Lesson6 {

    public static void main(String[] args) throws FileNotFoundException {
        QLKH ds = new QLKH("D:\\Work place\\Code\\JAVA\\Java\\Lesson6\\src\\resources\\tailieu.txt.txt");
        ds.timKiem("Tran Thi Lan").forEach(x->System.out.println(x));
        ds.hienThi();
        ds.ghiTop10("D:\\Work place\\Code\\JAVA\\Java\\Lesson6\\src\\resources\\ketqua.txt");
    }
}
