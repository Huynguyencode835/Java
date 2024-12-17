/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giaovien.Lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ADMIN
 */
public class QlGiangVien {
    private List<GiangVien> ds = new ArrayList<>();
    
    public void them(GiangVien... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void hienThi(){
        this.ds.stream().forEach(x->System.out.println(x));
    }
    
    public void xoa(GiangVien gv){
        this.ds.remove(gv);
    }
    
    public List<GiangVien> traCuu(String tuKhoa){
        return this.ds.stream().filter(x->x.getTen().contains(tuKhoa) || x.getHocHam().contains(tuKhoa) || x.getHocVi().contains(tuKhoa)).collect(Collectors.toList());
    }
    
    public void tinhTienLuong(){
        System.out.println("Moi nhap so gio lam ");
        float time = Float.parseFloat(CauHinh.cs.nextLine());
        
        this.ds.stream().forEach(x->System.out.println(x+"\n"+x.tinhTienLuong(time)+"\n"));
        
        this.ds.sort((x,y)->{
            double c1 = x.tinhTienLuong(time);
            double c2 = y.tinhTienLuong(time);
            return Double.compare(c1, c2);
        });
    }
    
    public List<GiangVien> tim(String duongDan) throws ClassNotFoundException{
        Class c = Class.forName(duongDan);
        List<GiangVien> res = new ArrayList<>();
        this.ds.forEach(x->{
            if(c.isInstance(x))
                res.add(x);
        });
        return res;
    }
}
