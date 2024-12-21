/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson6;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class KhachHangVip extends KhachHang{
    private LocalDate ngayHetHan;

    public KhachHangVip(String hoTen, String ngaySinh, BigDecimal soSu, String ngayHetHan) {
        super(hoTen, ngaySinh, soSu);
        this.ngayHetHan = LocalDate.parse(ngayHetHan,KhachHang.FORMATTER);
    }

    @Override
    public String toString() {
        return String.format("===============\nKhach Hang Vip\n%sNgay het han: %s\n", super.toString(),this.ngayHetHan.format(FORMATTER));
    }
    
    
}
