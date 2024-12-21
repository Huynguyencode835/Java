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
public class CauHoi2 extends Question{
    private Choise[] answers;

    public CauHoi2(String content, Choise[] answers) {
        super(content);
        this.answers = answers;
    }

    @Override
    public int checkAnswer(Choise[] ans) {
        return Arrays.equals(ans, answers) ? 1 : 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nAnswers:\n");
        for (Choise answer : answers) {
            sb.append(answer.toString()).append("\n");
        }
        return sb.toString();
    }
}
