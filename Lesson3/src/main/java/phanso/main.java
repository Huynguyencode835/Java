/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phanso;

/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String[] args) {
        PhanSo a1 = new PhanSo(2, 4);
        PhanSo a2 = new PhanSo(5, 4);
        PhanSo a3 = new PhanSo(3, 4);
        
        DsPhanSo ds = new DsPhanSo();
        ds.them(a1,a2,a3);

        ds.xoaPhanSo(5, 4);
        ds.hienThi();
        System.out.println("Tong ps");
        ds.tinhTongPs().hienThi();
        ds.timMax().hienThi();
    }        
}
