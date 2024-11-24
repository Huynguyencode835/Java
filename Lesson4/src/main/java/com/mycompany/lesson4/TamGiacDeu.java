/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson4;

/**
 *
 * @author ADMIN
 */
public class TamGiacDeu extends TamGiac{
    protected String name="Tam Giac Deu";

    public TamGiacDeu(double abc) {
        super(abc, abc, abc);
    }

    @Override
    public String toString() {
        super.name =this.name;
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
