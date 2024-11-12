/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lesson3;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;

/**
 *
 * @author ADMIN
 */
public class Lesson3 {

    public static void main(String[] args) throws FileNotFoundException {
        QuanLyHV ds = new QuanLyHV();
        ds.them("src/main/resources/hocvien.txt");
        ds.nhapDiem();
        ds.hienThi();
        System.out.println("====");
        ds.dsThanhTichTot().forEach(x->x.hienThi());
    }
}
