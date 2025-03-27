/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author ADMIN
 */
public class QLKH {
    private List<KhachHang> ds = new ArrayList<>();

    public QLKH(String duongDan) throws FileNotFoundException {
        File f = new File(duongDan);
        try (Scanner sc = new Scanner(f)){
            sc.nextLine();
            sc.nextLine();
            while(sc.hasNext()){
                String[] res = sc.nextLine().split(", ");
                if(res.length == 3){
                    this.ds.add(new KhachHang(res[0], res[1],new BigDecimal(Double.parseDouble(res[2]))));
                }else if(res.length == 4){
                    this.ds.add(new KhachHangVip(res[0], res[1],new BigDecimal(Double.parseDouble(res[2])),res[3]));
                }
            }
        }
    }
    
    public void hienThi(){
        this.ds.stream().forEach(x->System.out.println(x));
    }
    
    public BigDecimal tongDu(){
        return this.ds.stream().map(KhachHang::getSoSu).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
    
    public List<KhachHang> timKiem(String ten){
        return this.ds.stream().filter(x->x.getHoTen().contains(ten)).collect(Collectors.toList());
    }
    
    public KhachHang timKiem(int ma){
        String temp = String.format("KH-%04d", ma);
        return this.ds.stream().filter(x->x.getMaSo().contains(temp)).findFirst().get();
    }
    
    public void sapXep(){
        this.ds.sort((x,y)->x.soSanhSoDu(y));
    }
    
    public List<KhachHang> timKiem() throws ClassNotFoundException{
        Class c = Class.forName("com.mycompany.lesson6.KhachHangVip");  
        return this.ds.stream().filter(x->c.isInstance(x)).collect(Collectors.toList());
    }
    
    public void ghiTop10(String duongDan) throws FileNotFoundException{
        File f = new File(duongDan);
        try(PrintWriter w = new PrintWriter(f)){
            this.sapXep();
            for(int i=this.ds.size()-1; i > this.ds.size()- 10; i--){
                w.println(this.ds.get(i));
            }
        }
    }
}
