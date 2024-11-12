/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson3;

import java.time.LocalDate;
import java.util.Date;
import java.util.stream.DoubleStream;

/**
 *
 * @author admin
 */
public class HocVien {
    private static int dem=0;
    private int maHV;
    private String tenHV;
    private LocalDate ngaySinh;
    private double []diem;
    
    {
        setDem(getDem() + 1);
        this.setMaHV(getDem());
    }


    public HocVien(String tenHV, LocalDate ngaySinh) {
        this.tenHV = tenHV;
        this.ngaySinh = ngaySinh;
    }
    
    public HocVien(String tenHV, String ngaySinh){
        this(tenHV, LocalDate.parse(ngaySinh,CauHinh.FORMATTER));
    }

    HocVien(String nguen_Van_a, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void nhapDiem(){
        this.diem = new double[CauHinh.soMon];
        for(int i = 0;i<this.diem.length;i++){
            System.out.printf("Moi nhap diem mon %d ",i+1);
            this.diem[i]= Double.parseDouble(CauHinh.sc.nextLine());
        }
    }
    
    public void hienThi(){
        System.out.printf("%d - %s - %s\n",this.maHV,this.tenHV,this.ngaySinh.format(CauHinh.FORMATTER));
        if(this.diem!=null){
            for(var x:this.diem){
                System.out.printf("%.1f \t",x);
            }
            System.out.println("");
        }
    }
    
    public double diemTb(){
        if(this.diem!=null)
            return DoubleStream.of(this.diem).average().getAsDouble();
        return 0;
    }

    public boolean isHocBong(){
        if(this.diem != null){
            for(var x: this.diem)
                if(x < 5)
                    return false;
            return this.diemTb() > 8;
        }
        return false;
    }
    
    public boolean isDuoi18(){
        return this.ngaySinh.plusYears(18).compareTo(LocalDate.now()) > 0;
    }
    
    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        HocVien.dem = dem;
    }

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

    public String getTenHV() {
        return tenHV;
    }

    public void setTenHV(String tenHV) {
        this.tenHV = tenHV;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double[] getDiem() {
        return diem;
    }

    public void setDiem(double[] diem) {
        this.diem = diem;
    }

   
}
    
        
        
        

  