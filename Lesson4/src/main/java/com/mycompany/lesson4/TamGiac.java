/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson4;

/**
 *
 * @author ADMIN
 */
public class TamGiac {
    private double a,b,c;
    protected String name ="Tam Giac";

    public TamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double tinhDienTich(){
        double p =(a+b+c)/2;
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }
    
    public double tinhChuVi(){
        return (a+b+c);
    }

    @Override
    public String toString() {
        return String.format("%s\nDienTich: %.1f\nChuVi: %.1f\n",this.name,tinhDienTich(),tinhChuVi());
    }
    
    
    
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
}
