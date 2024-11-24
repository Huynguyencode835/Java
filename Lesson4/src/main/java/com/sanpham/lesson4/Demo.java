/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sanpham.lesson4;

/**
 *
 * @author ADMIN
 */
public class Demo {
    public static void main(String[] args) {
        QlSanPham ds = new QlSanPham();
        SanPham sp1 = new Sach(5,"Dac Nhan Tam","sach doc","Kim Dong",100);
        SanPham sp2 = new Sach(45,"kinh te","sach kinh te","tuoi tre",670);
        SanPham sp3 = new BangDia(12,"sieu nhan","sach doc","japan",10011);
        SanPham sp4 = new Sach(7,"trie","sach triet","Kim Dong",30);
        SanPham sp5 = new Sach(3,"cntt","sach doc","tuoi gia",150);       
        SanPham sp6 = new BangDia(5,"nha ba nu","gia dinh","tran thanh",1020);
        SanPham sp7 = new BangDia(123,"doremon","hoat hinh","Kim Dong",100);
        SanPham sp8 = new BangDia(5,"vemon","hanh dong","ly chong gai",1040);
        ds.them(sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8);
        ds.sapXep();
        ds.capNhat("MS-5", "LAP TRINH HUONG DOI TUONG");
        ds.hienThi();
    }      
}
   