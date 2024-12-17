/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhanvien.Lesson5;

/**
 *
 * @author ADMIN
 */
public class NhanVienBP extends NhanVien{
    private BoPhan boPhan;

    public NhanVienBP(BoPhan boPhan, String ten, String queQuan) {
        super(ten, queQuan);
        this.boPhan = boPhan;
    }

    public double tinhLuong(int ngayCong) {
        return this.boPhan.heSo()*super.tinhLuong(ngayCong);
    }

    @Override
    public String toString() {
        return super.toString()+String.format("Bo Phan: %s\n", this.boPhan);
        
    }
    
    
}
