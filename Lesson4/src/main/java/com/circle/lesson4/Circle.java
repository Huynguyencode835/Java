/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.circle.lesson4;

/**
 *
 * @author ADMIN
 */
public class Circle extends Ellipse{
    protected String name = "Circle";
    private double bk;
    
    public Circle(double bk) {
        super(bk, bk);
    }

    @Override
    public String toString() {
        super.name = this.name;
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
