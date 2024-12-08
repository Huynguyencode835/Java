/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sanpham.lesson4;

/**
 *
 * @author ADMIN
 */
public class BangDia extends SanPham {

    private float thoiGian;
    protected String name = "Bang Dia";

    public BangDia(float thoiGian, String tenSP, String moTaSP, String nhaSX, double giaBan) {
        super(tenSP, moTaSP, nhaSX, giaBan);
        super.name = this.name;
        this.thoiGian = thoiGian;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Thoi Gian Chieu: " + this.thoiGian);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Thoi Gian Chieu: %d", this.thoiGian);
    }
    
            
            
}
