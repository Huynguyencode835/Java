/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nganhang.lesson4;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class TaiKhoanKKH extends TaiKhoan {

    protected String name = "Tai Khoan Khong Ky Han";

    public void tienGui(double amount) {
        this.setSoTien(this.getSoTien() + amount);
    }

    public void tienRut(double amount) {
        this.setSoTien(this.getSoTien() - amount);
    }

    public double tienLai() {
        return 0.01 * this.getSoTien();
    }

    public TaiKhoanKKH(String tenTK, String sDT, String email, double soTien, String ngayTao, String trangThai) {
        super(tenTK, sDT, email, soTien, ngayTao, trangThai);
    }

    @Override
    public void hienThi() {
        super.name = this.name;
        super.hienThi();
    }
}
