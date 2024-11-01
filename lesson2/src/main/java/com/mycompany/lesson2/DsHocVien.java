/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DsHocVien {

    List<QlThongTinHocVien> ds;

    public DsHocVien() {
        this.ds = new ArrayList<>();
    }

    public void init(){
        File f = new File("lesson2/src/resources/thongtin.txt");
        try {
            Scanner sc = new Scanner(f);
            QlThongTinHocVien temp = new QlThongTinHocVien();
            temp.setHoTen(sc.nextLine());
            temp.setQueQuan(sc.nextLine());
            temp.setNgaySinh(sc.nextLine());
            this.ds.add(temp);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DsHocVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void hienThi() {
        for (var x : ds) {
            x.toString();
        }
    }

    public QlThongTinHocVien timHocVien(int mhv) {
        for (var x : this.ds) {
            if (x.getMaHocVien() == mhv) {
                return x;
            }
        }
        return null;
    }

    public DsHocVien timHocVien(String qq) {
        DsHocVien res = new DsHocVien();
        for (var x : this.ds) {
            if (x.getQueQuan().equals(qq)) {
                res.add(x);
            }
        }
        return res;
    }

    private void add(QlThongTinHocVien temp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
