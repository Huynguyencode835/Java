/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class DsPhanSo {

    List<PhanSo> ds = new ArrayList<>();

    public DsPhanSo() {
    }

    public void add(PhanSo a) {
        this.ds.add(a);
    }

    public void hienThi() {
        for (var x : ds) {
            x.hienThi();
            System.out.println("");
        }
    }

    public PhanSo tinhTong() {
        PhanSo res = new PhanSo();
        for (var x : ds) {
            res = res.congPhanSo(x);
        }
        return res;  
    }

    public PhanSo timPhanSoLonNhat() {
        PhanSo max = new PhanSo();
        for (var x : ds) {
            if (x.soSanh(max) == 1) {
                max.setTuSo(x.getTuSo());
                max.setMauSo(x.getMauSo());
            }
        }
        return max;
    }
    
    public void xoaPhanSo(PhanSo a){
        int p = -1;
        for(var x: this.ds){
            ++p;
            if(x.soSanh(a)==0)
                break;
        }
        if(p!=-1)
            this.ds.remove(0);
    }
    
    public static void swap(PhanSo a,PhanSo b){
        PhanSo temp = new PhanSo(a.getTuSo(),a.getMauSo());
        a.setTuSo(b.getTuSo());
        a.setMauSo(b.getMauSo());
        b.setTuSo(temp.getTuSo());
        b.setMauSo(temp.getMauSo());
    }
    
    public void sapXep(){
        for(int i = 0;i<this.ds.size()-1;i++){
            for(int j =i+1;j<this.ds.size();j++){
                if(ds.get(i).soSanh(ds.get(j))==1)
                   swap(ds.get(i),ds.get(j));
            }
        }
    }
    
}
