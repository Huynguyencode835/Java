/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hk1_2024;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author ADMIN
 */
public class bai4 {

    public static int[] importArr(int n) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Moi nhap phan tu thu %d :", i);
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void exportArr(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = " + a[i], i);
            System.out.println("");
        }
    }

    public static boolean Isprime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] a = importArr(5);
        exportArr(a);

        System.out.println("So duong lon nhat la: " + IntStream.of(a).max());
    
    }
};
