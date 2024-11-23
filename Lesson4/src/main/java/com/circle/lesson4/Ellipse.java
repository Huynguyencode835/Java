/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.circle.lesson4;

/**
 *
 * @author ADMIN
 */
public class Ellipse {
    private double bkTrucLon;
    private double bkTrucNho;
    protected String name ="Ellipse";

    public Ellipse(double bkTrucLon, double bkTrucNho) {
        this.bkTrucLon = bkTrucLon;
        this.bkTrucNho = bkTrucNho;
    }
    
    public double tinhDienTich(){
        return Math.PI*this.bkTrucLon*this.bkTrucNho;
    }
    
    public double tinhChuVi(){
        return Math.PI*2*Math.sqrt((Math.pow(bkTrucLon, 2)+Math.pow(bkTrucNho, 2))/2);
    }

    public double getBkTrucLon() {
        return bkTrucLon;
    }

    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }

    public double getBkTrucNho() {
        return bkTrucNho;
    }

    public void setBkTrucNho(double bkTrucNho) {
        this.bkTrucNho = bkTrucNho;
    }

    @Override
    public String toString() {
        return String.format("%s\nDien tich: %.1f\nChu vi: %.1f\n", this.name,tinhDienTich(),tinhChuVi());
    }
}
