/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson5;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ADMIN
 */
public class QlTaiKhoan {
    private List<TaiKhoan> ds = new ArrayList<>();
    
    public void them(TaiKhoan... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void them(String duongDan) throws FileNotFoundException {
        File f = new File(duongDan);
        try ( Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                if(sc.nextLine().contains("TaiKhoanCoKyHan")){
                    String kH = sc.nextLine();
                    this.ds.add(new TaiKhoanCoKH(KyHan.valueOf(kH), sc.nextLine(), new BigDecimal(sc.nextLine())));
                }else{
                    this.ds.add(new TaiKhoan(sc.nextLine(), new BigDecimal(Double.parseDouble(sc.nextLine()))));
                }
            }
        }
    }
    
    public void hienThi(){
        this.ds.stream().forEach(x->System.out.println(x));
    }
    
    public TaiKhoan traCuuTK(String stk){
        return this.ds.stream().filter(x->x.getStk().contains(stk)).findFirst().get();
    }
    
    public List<TaiKhoan> traCuuTen(String ten){
        return this.ds.stream().filter(x->x.getTenTk().contains(ten)).collect(Collectors.toList());
    }
}
