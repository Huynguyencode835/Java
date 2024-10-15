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
public class bai3 {

    public static void case1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap ten ");
        String name = sc.nextLine();
        System.out.println(name.substring(0, name.indexOf("@")));
    }

    public static void case2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap chuoi ");
        String name = sc.nextLine();
        int cnt=0;
       for(int i=0;i<name.length();i++){
           if(Character.isUpperCase(name.charAt(i)))
               cnt++;
       }
       System.out.println("so tu viet hoa là "+cnt);
    }

    public static void main(String[] args) {
        case2();
    }
}
