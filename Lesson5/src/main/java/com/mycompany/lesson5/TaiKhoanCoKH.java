/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson5;


import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TaiKhoanCoKH extends TaiKhoan{
    private KyHan kyHan;
    private Calendar daoHan;

    public TaiKhoanCoKH(KyHan kyHan, String tenTk, BigDecimal tien) {
        super(tenTk, tien);
        this.kyHan = kyHan;
        this.daoHan = this.kyHan.ngayDaoHan(new GregorianCalendar());
    }  

    public boolean is_ngay() {
        String s1 = df.format(new GregorianCalendar());
        String s2 = df.format(this.daoHan);
        return s1 == s2;
    }

    public BigDecimal tinhLai() {
        return this.kyHan.tinhTien(this.tien);
    }

    public String toString() {
        return String.format("%sNgayDaoHan: %s\nKyHan: %s", super.toString(), df.format(this.daoHan.getTime()), this.kyHan);
    }
}
