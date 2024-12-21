/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tracnghiem.Lesson5;

import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class CauHoi1 extends Question{
    private Choise[] choices;
    private Choise answer;

    public CauHoi1(String content, Choise[] choices, Choise answer) {
        super(content);
        this.choices = choices;
        this.answer = answer;
    }

    @Override
    public int checkAnswer(Choise[] ans) {
        return Arrays.equals(ans, new Choise[]{answer}) ? 1 : 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nChoices:\n");
        for (Choise choice : choices) {
            sb.append(choice.toString()).append("\n");
        }
        return sb.toString();
    }
}
