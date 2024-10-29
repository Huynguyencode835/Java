/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.hk1_2024;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap so: ");
        int c = (int) (Math.random() * 100);
        int n;
        do {
            n = sc.nextInt();
            if(n > c)
                System.out.println("so can tim nho hon: ");
            else if(n<c)
                System.out.println("so can tim lon hon");
            else
                System.out.println("bang");
        } while (n != c);
    }
}
