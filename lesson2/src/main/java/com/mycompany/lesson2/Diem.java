/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson2;

/**
 *
 * @author ADMIN
 */
public class Diem {

    private double hoangDo;
    private double tungDo;

    public Diem() {
    }

    public Diem(double hoangDo, double tungDo) {
        this.hoangDo = hoangDo;
        this.tungDo = tungDo;
    }

    public double getHoangDo() {
        return hoangDo;
    }

    public void setHoangDo(double hoangDo) {
        this.hoangDo = hoangDo;
    }

    public double getTungDo() {
        return tungDo;
    }

    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }

    public void hienThi() {
        System.out.printf("(%.1f,%.1f)\n", hoangDo, tungDo);
    }

    public double tinhKhoangCach(Diem a) {
        return Math.sqrt(Math.pow(this.hoangDo - a.hoangDo, 2) + Math.pow(this.tungDo - a.tungDo, 2));
    }
}
