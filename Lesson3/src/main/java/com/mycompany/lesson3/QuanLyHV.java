/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QuanLyHV {

    private List<HocVien> ds = new ArrayList<>();

    public void hienThi() {
        this.ds.forEach(x -> x.hienThi());
    }

    public void them(HocVien... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void them(String duongDan) throws FileNotFoundException {
        File f = new File(duongDan);
        try ( Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                this.ds.add(new HocVien(sc.nextLine(), sc.nextLine()));
            }
        }
    }

    public void nhapDiem() {
        for (var x : this.ds) {
            System.out.println("Moi Nhap Diem cho: " + x.getTenHV());
            x.nhapDiem();
        }
    }

    public List<HocVien> dsThanhTichTot() {
        return this.ds.stream().filter(h -> h.isHocBong()).collect(Collectors.toList());
    }

    //tim kiem theo ten
    public List<HocVien> timKiem(String ht) {
        return this.ds.stream().filter(h -> h.getTenHV().contains(ht)).collect(Collectors.toList());
    }

    //tim kiem theo id
    public HocVien timKiem(int id) {
        return this.ds.stream().filter(h -> h.getMaHV() == id).findFirst().get();
    }

    public void sapXep() {
        this.ds.sort((h1, h2) -> {
            double t1 = h1.diemTb();
            double t2 = h2.diemTb();
            if(t1>t2)
                return 1;
            else if(t1<t2)
                return -1;
            else
                return 0;
        });
    }
    
    public long cntTuoi18(){
        return this.ds.stream().filter(x->x.isDuoi18()).count();
    }
    
    public void xuatDs(String duongdan) throws FileNotFoundException{
        
        File f = new File(duongdan);
        try(PrintWriter w = new PrintWriter(f)){
            List<HocVien> hb = this.dsThanhTichTot();
            for(var x: hb){
                w.printf("%d-%s: %.1f\n",x.getMaHV(),x.getTenHV(),x.diemTb());
            }
        }
    }
    
    
}
