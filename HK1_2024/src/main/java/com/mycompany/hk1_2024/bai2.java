/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hk1_2024;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap bậc đa thức ");
        int n = sc.nextInt();
        int[] a= new int[n+1];
        //1 3 2
        for(int i = 0;i<=n;i++){
            System.out.printf("Mời nhập số hạng thứ %(d+1) ",i);
            a[i]=sc.nextInt();
        }
        System.out.print("Moi nhập x ");
        int x = sc.nextInt();
        int res = 0;
        for(int i = n;i>=0;i--){
            res+=a[n-i]*Math.pow(x, i);
        }
        System.out.println(res);
    }
}
