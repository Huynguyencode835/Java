/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson2;

/**
 *
 * @author ADMIN
 */
public class HinhChuNhat {

    private Diem left;
    private Diem right;

    public HinhChuNhat() {
    }

    public HinhChuNhat(Diem left, Diem right) {
        this.left = left;
        this.right = right;
    }

    public Diem getLeft() {
        return left;
    }

    public void setLeft(Diem left) {
        this.left = left;
    }

    public Diem getRight() {
        return right;
    }

    public void setRight(Diem right) {
        this.right = right;
    }

    public static Diem diemPhu(double a, double b) {
        return new Diem(a, b);
    }

    public double tinhDienTich() {
        return this.left.tinhKhoangCach(diemPhu(this.left.getHoangDo(), this.right.getTungDo())) * diemPhu(this.left.getHoangDo(), this.right.getTungDo()).tinhKhoangCach(this.right);
    }

    public double tinhChuVi() {
        return (this.left.tinhKhoangCach(diemPhu(this.left.getHoangDo(), this.right.getTungDo())) + diemPhu(this.left.getHoangDo(), this.right.getTungDo()).tinhKhoangCach(this.right)) * 2;
    }

    public void hienThi() {
        System.out.printf("Dien tich la: %.1f _ Chu vi la: %.1f \n", tinhDienTich(), tinhChuVi());
    }
}
