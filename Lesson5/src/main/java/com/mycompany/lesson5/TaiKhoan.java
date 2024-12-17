/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson5;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author ADMIN
 */
public class TaiKhoan {
    protected static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private static int cnt = 1;
    private String stk;
    private String tenTk;
    protected BigDecimal tien;
    private Calendar ngayTao;

    public TaiKhoan(String tenTk, BigDecimal tien) {
        this.stk = String.format("%06d", cnt++);
        this.ngayTao = new GregorianCalendar();
        this.tenTk = tenTk;
        this.tien = tien;
    }

    public void rutTien(BigDecimal t) {
        if (this.is_ngay() && this.tien.compareTo(t) == 1) {
            this.setTien(this.tien.subtract(t));
            System.out.printf("so tien trong tai khoan con %.1f: \n",this.tien);
        }else
            System.out.println("so tien khong du");
    }

    public void guiTien(BigDecimal t) {
        if (this.is_ngay()) {
            this.setTien(this.tien.add(t));
        }
    }

    public boolean is_ngay() {
        return true;
    }

    public BigDecimal tinhLai() {
        return this.tien.multiply(new BigDecimal(1.0E-4)).divide(new BigDecimal(12));
    }

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        TaiKhoan.cnt = cnt;
    }

    public String getStk() {
        return this.stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public String getTenTk() {
        return this.tenTk;
    }

    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }

    public BigDecimal getTien() {
        return this.tien;
    }

    public void setTien(BigDecimal tien) {
        this.tien = tien;
    }

    public Calendar getNgayTao() {
        return this.ngayTao;
    }

    public void setNgayTao(Calendar ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String toString() {
        return String.format("\n===========\nSTK: %s\nTenTK: %s\nSoTien: %.1f\nNgayTao: %s\n", this.stk, this.tenTk, this.tien, df.format(this.ngayTao.getTime()));
    }
}
