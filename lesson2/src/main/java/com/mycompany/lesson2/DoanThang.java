/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson2;

/**
 *
 * @author ADMIN
 */
public class DoanThang {

    private Diem diemDau;
    private Diem diemCuoi;

    public DoanThang() {
    }

    public DoanThang(Diem diemDau, Diem diemCuoi) {
        this.diemDau = diemDau;
        this.diemCuoi = diemCuoi;
    }

    public Diem getDiemDau() {
        return diemDau;
    }

    public void setDiemDau(Diem diemDau) {
        this.diemDau = diemDau;
    }

    public Diem getDiemCuoi() {
        return diemCuoi;
    }

    public void setDiemCuoi(Diem diemCuoi) {
        this.diemCuoi = diemCuoi;
    }

    public void hienThi() {
        System.out.printf("[(%.1f,%.1f),(%.1f,%.1f)]\n", this.diemDau.getHoangDo(), this.diemDau.getTungDo(), this.diemCuoi.getHoangDo(), this.diemCuoi.getTungDo());
    }

    public double tinhDoDai() {
        return this.diemDau.tinhKhoangCach(this.diemCuoi);
    }

    public Diem timTrungDiem() {
        return new Diem(((diemDau.getHoangDo() + diemCuoi.getHoangDo()) / 2), ((diemDau.getTungDo() + diemCuoi.getTungDo()) / 2));
    }

    public boolean isSongSong(DoanThang a) {
        double v1 = (this.diemDau.getHoangDo() - this.diemCuoi.getHoangDo()) * (a.diemDau.getHoangDo() - a.diemCuoi.getHoangDo());
        double v2 = (this.diemDau.getTungDo() - this.diemCuoi.getTungDo()) * (a.diemDau.getTungDo() - a.diemCuoi.getTungDo());
        return v1 >= v2 - 0.0000001 && v1 <= v2 + 0.0000001;
    }
}
