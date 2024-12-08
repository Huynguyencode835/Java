/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhanvien.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ADMIN
 */
public class QlNhanVien {
    private List<NhanVien> ds = new ArrayList<>();
    
    public void them(NhanVien... sp) {
        this.ds.addAll(Arrays.asList(sp));
    }
    
    public void hienThi(){
        this.ds.stream().forEach(x->System.out.println(x));
    }
    
    public NhanVien tim(long cmnd){
        return this.ds.stream().filter(x->x.getCmnd()== cmnd).findFirst().get();
    }
    
    public List<NhanVien> tim(String str){
        return this.ds.stream().filter(x->x.getHoTen().contains(str) || x.getQueQuan().contains(str)).collect(Collectors.toList());
        
    }
}
