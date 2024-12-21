/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tracnghiem.Lesson5;


/**
 *
 * @author ADMIN
 */
public abstract class Question {
    private int questionId;
    private String content;
    private static int idCounter = 1;

    public Question(String content) {
        this.content = content;
        this.questionId = idCounter++;
    }

    public abstract int checkAnswer(Choise[] ans);

    @Override
    public String toString() {
        return "Question ID: " + questionId + "\nContent: " + content;
    }
}
