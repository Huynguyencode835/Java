/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giaovien.Lesson5;

/**
 *
 * @author ADMIN
 */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        GiangVien gv1 = new GvCoHuu(50, 1.5f, "Huy", "08/05/2005", "Thacsi", "Tiensi", "26/07/2005");
        GiangVien gv2 = new GvThinhGiang("Ha noi", "Thuy", "01/05/2004", "Thac si", "Sinh Vien", "04/02/2015");
        GiangVien gv3 = new GvCoHuu(40, 1.3f, "Huy Quoc", "08/05/2005", "Thacsi", "Tiensi", "26/07/2005");
        GiangVien gv4 = new GvThinhGiang("HCM", "Thui", "06/05/2004", "Thac si", "Sinh Vien", "09/02/2015");
        
        QlGiangVien ds = new QlGiangVien();
        
        ds.them(gv1, gv2, gv3, gv4);
       
        ds.tim("com.giaovien.Lesson5.GvThinhGiang").forEach(x->System.out.println(x));
    }
}
