/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nganhang.lesson4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ADMIN
 */
public class TaiKhoanKH extends TaiKhoan {
    enum KyHan {
        MOT_TUAN,
        MOT_THANG,
        MOT_NAM
    }

    private KyHan kyHan;
    private LocalDate ngayDH;
    protected String name = "Tai Khoan Co Ky Han";

    public void tienGui(double amount){
        if(LocalDate.now().equals(this.ngayDH)){
            this.setSoTien(this.getSoTien() + amount);
        }else
            System.out.println("Khong hop le");
    }
    
    public void tienRut(double amount){
         if(LocalDate.now().equals(this.ngayDH)){
            this.setSoTien(this.getSoTien() - amount);
        }else
            System.out.println("Khong hop le");
    }
    
    public double tienLai(){
        double res =0.0;
        switch(this.kyHan){
            case MOT_TUAN:
                res =0.05;
                break;
            case MOT_THANG:
                res=0.045;
                break;
            case MOT_NAM:
                res=0.068;
                break;
        }
        return res*this.getSoTien();
    }
    
    public TaiKhoanKH(KyHan kyHan,String ngayDH,String tenTK, String sDT, String email, double soTien, String ngayTao, String trangThai) {
        super(tenTK,sDT, email, soTien, ngayTao, trangThai);
        this.kyHan = kyHan;
        this.ngayDH = LocalDate.parse(ngayDH,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public void hienThi() {
        super.name = this.name;
        super.hienThi();
        System.out.printf("Ky Han: %s\nNgay DH: %s\n",this.kyHan,this.ngayDH.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
