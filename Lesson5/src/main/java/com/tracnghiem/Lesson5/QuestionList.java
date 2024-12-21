/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tracnghiem.Lesson5;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionList {
    private List<Question> questions = new ArrayList<>();

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public void removeQuestion(Question q) {
        questions.remove(q);
    }

    public void list(String type) {
        questions.stream().forEach(x->System.out.println(x));
    }

    public void practice(String type, int n) throws ClassNotFoundException {
        Class c = Class.forName(type);
        List<Question> res = new ArrayList<>();
        this.questions.forEach(x->{
            if(c.isInstance(x))
                res.add(x);
        });
        if (n > res.size()) {
            throw new IllegalArgumentException("Số lượng phần tử cần chọn lớn hơn kích thước của danh sách");
        }
        
        Random random = new Random();
        List<Integer> selectedIndices = new ArrayList<>();
        List<Question> result = new ArrayList<>();

        while (result.size() < n) {
            int index = random.nextInt(res.size());
            if (!selectedIndices.contains(index)) {
                selectedIndices.add(index);
                result.add(res.get(index));
            }
        }
        
        result.stream().forEach(x->System.out.println(x));
    }
}
