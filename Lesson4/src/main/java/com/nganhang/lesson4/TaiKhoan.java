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
public abstract class TaiKhoan {

    private static int cnt = 1;
    protected String name = "";
    private String sTK;

    {
        this.sTK = String.format("%06d", cnt++);
    }
    private String tenTk;
    private String sDT;
    private String email;
    private double soTien;
    private LocalDate ngayTao;
    private String trangThai;

    public abstract void tienGui(double amount);

    public abstract void tienRut(double amount);

    public abstract double tienLai();

    public TaiKhoan(String tenTK, String sDT, String email, double soTien, String ngayTao, String trangThai) {
        this.tenTk = tenTK;
        this.sDT = sDT;
        this.email = email;
        this.soTien = soTien;
        this.ngayTao = LocalDate.parse(ngayTao, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.trangThai = trangThai;
    }

    public void hienThi() {
        System.out.println("=======================");
        System.out.printf("-%s\nSTK Ngan Hang: %s\nTen TK: %s\nSDT: %s\nEmail: %s\nTien: %.1f\nNgay Tao Tk: %s\nTrang Thai: %s\n",
                this.name, this.sTK, this.tenTk, this.sDT, this.email, this.soTien, this.ngayTao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), this.trangThai);
    }

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        TaiKhoan.cnt = cnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsTK() {
        return sTK;
    }

    public void setsTK(String sTK) {
        this.sTK = sTK;
    }

    public String getTenTk() {
        return tenTk;
    }

    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
