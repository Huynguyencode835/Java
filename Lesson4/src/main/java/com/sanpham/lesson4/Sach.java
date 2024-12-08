/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sanpham.lesson4;

/**
 *
 * @author ADMIN
 */
public class Sach extends SanPham {

    private int soTrang;
    protected String name = "Sach";

    public Sach(int soTrang, String tenSP, String moTaSP, String nhaSX, double giaBan) {
        super(tenSP, moTaSP, nhaSX, giaBan);
        super.name = this.name;
        this.soTrang = soTrang;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("So trang: " + this.soTrang);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("So trang: %i", this.soTrang);
    }
}
