/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sanpham.lesson4;

/**
 *
 * @author ADMIN
 */
public class SanPham {

    private static int cnt = 1;
    private String mSP;
    private String tenSP, moTaSP, nhaSX;
    private double giaBan;
    protected String name = "San Pham";

    {
        this.mSP = "MS-" + cnt++;
    }

    public SanPham() {
    }

    public SanPham(String tenSP, String moTaSP, String nhaSX, double giaBan) {
        this.tenSP = tenSP;
        this.moTaSP = moTaSP;
        this.nhaSX = nhaSX;
        this.giaBan = giaBan;
    }

    public int soSanh(SanPham a) {
        if (this.getGiaBan() > a.getGiaBan()) {
            return 1;
        } else if (this.getGiaBan() < a.getGiaBan()) {
            return -1;
        } else {
            return 0;
        }
    }

    public void hienThi() {
        System.out.println("===========");
        System.out.printf("%s\nMaSP: %s\nTenSP: %s\nMoTaSP: %s\nNhaSX: %s\nGia: %.1f\n",
                 this.name, this.mSP, this.tenSP, this.moTaSP, this.nhaSX, this.giaBan);
    }

    @Override
    public String toString() {
        return String.format("%s\nMaSP: %s\nTenSP: %s\nMoTaSP: %s\nNhaSX: %s\nGia: %.1f\n",
                this.name, this.mSP, this.tenSP, this.moTaSP, this.nhaSX, this.giaBan); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        SanPham.cnt = cnt;
    }

    public String getmSP() {
        return mSP;
    }

    public void setmSP(String mSP) {
        this.mSP = mSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMoTaSP() {
        return moTaSP;
    }

    public void setMoTaSP(String moTaSP) {
        this.moTaSP = moTaSP;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

}
