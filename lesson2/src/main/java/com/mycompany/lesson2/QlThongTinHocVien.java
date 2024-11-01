/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson2;

/**
 *
 * @author ADMIN
 */
public class QlThongTinHocVien extends DsHocVien {

    static int cnt = 0;
    private int maHocVien;
    {
        maHocVien = ++cnt;
    }
    private String hoTen;
    private String ngaySinh;
    private String queQuan;
    private double toan, li, hoa;

    public QlThongTinHocVien() {
    }

    public QlThongTinHocVien(int maHocVien, String hoTen, String ngaySinh, String queQuan, double toan, double li, double hoa) {
        this.maHocVien = maHocVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
    }

    public QlThongTinHocVien(int maHocVien, String hoTen, String ngaySinh, String queQuan) {
        this.maHocVien = maHocVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.toan = 0;
        this.li = 0;
        this.hoa = 0;
    }
    
    public int getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(int maHocVien) {
        this.maHocVien = maHocVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLi() {
        return li;
    }

    public void setLi(double li) {
        this.li = li;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    @Override
    public String toString() {
        return "QlThongTinHocVien{" + "maHocVien=" + maHocVien + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", queQuan=" + queQuan + ", toan=" + toan + ", li=" + li + ", hoa=" + hoa + "}\n";
    }
    
    

}
