/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tracnghiem.Lesson5;

import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Choise {
    private String content; 
    private String explanation; 
    
    public Choise(String content, String explanation) { 
        this.content = content; 
        this.explanation = explanation; 
    } 
    public String getContent() {
        return content; 
    } 
    public String getExplanation() {
        return explanation; 
    } 
    
    @Override 
    public boolean equals(Object o) {
        if (this == o) 
            return true; 
        if (o == null || getClass() != o.getClass()) 
            return false; 
        Choise choice = (Choise) o;
        return content.equals(choice.content) && explanation.equals(choice.explanation); 
    } 
    @Override 
    public int hashCode() {
        return Objects.hash(content, explanation); 
    }
    
    @Override 
    public String toString() {
        return content + ": " + explanation; 
    }
}
