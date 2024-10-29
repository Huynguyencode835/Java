/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson2;

/**
 *
 * @author ADMIN
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public static int Ucln(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public PhanSo rutGon() {
        int ucln = Ucln(this.tuSo, this.mauSo);
        this.tuSo = this.tuSo / ucln;
        this.mauSo = this.mauSo / ucln;
        return new PhanSo(this.tuSo, this.mauSo);
    }

    public void hienThi() {
        System.out.println(this.tuSo + "/" + this.mauSo);
    }

    public PhanSo congPhanSo(PhanSo a) {
        return new PhanSo(this.tuSo * a.mauSo + this.mauSo * a.tuSo, this.mauSo * a.mauSo).rutGon();
    }

    public PhanSo truPhanSo(PhanSo a) {
        return new PhanSo(this.tuSo * a.mauSo - this.mauSo * a.tuSo, this.mauSo * a.mauSo).rutGon();
    }

    public PhanSo nhanPhanSo(PhanSo a) {
        return new PhanSo(this.tuSo * a.tuSo, this.mauSo * a.mauSo).rutGon();
    }

    public PhanSo chiaPhanSo(PhanSo a) {
        return new PhanSo(this.tuSo * a.mauSo, this.mauSo * a.tuSo).rutGon();
    }

    public int soSanh(PhanSo a){
        if(this.tuSo*a.mauSo - this.mauSo*a.tuSo > 0)
            return 1;
        else if(this.tuSo*a.mauSo - this.mauSo*a.tuSo < 0)
            return -1;
        else
            return 0;
    } 
}
