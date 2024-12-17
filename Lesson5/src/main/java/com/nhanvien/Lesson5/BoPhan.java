/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.nhanvien.Lesson5;

/**
 *
 * @author ADMIN
 */
public enum BoPhan {
    Bo_Phan_A {
        @Override
        public double heSo() {
            return 1.2;
        }
    } ,
    Bo_Phan_B {
        @Override
        public double heSo() {
            return 1.5;
        }
    },
    Bo_Phan_C {
        @Override
        public double heSo() {
            return 2.5;
        }
    };
    
    
    public abstract double heSo();
}
