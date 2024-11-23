/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson4;

/**
 *
 * @author ADMIN
 */
public class TamGiacCan extends TamGiac{
    protected String name="Tam Giac Can";
    private double ab,c;
    
    public TamGiacCan(double ab,double c) {
        super(ab,ab,c);
    }

    @Override
    public String toString() {
        super.name=this.name;
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
