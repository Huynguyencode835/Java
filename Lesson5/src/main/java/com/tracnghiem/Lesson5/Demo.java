/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tracnghiem.Lesson5;

/**
 *
 * @author ADMIN
 */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        // Tạo các lựa chọn
        Choise c1 = new Choise("Option A", "Explanation A");
        Choise c2 = new Choise("Option B", "Explanation B");
        Choise c3 = new Choise("Option C", "Explanation C");

        // Tạo câu hỏi trắc nghiệm
        CauHoi1 mcq = new CauHoi1(
    "What is the capital of France?", 
    new Choise[]{new Choise("Paris", "Explanation A"), new Choise("London", "Explanation B")},
    new Choise("Paris", "Explanation A")
);


        // Tạo câu hỏi chưa hoàn chỉnh
        CauHoi2 icq = new CauHoi2(
            "Fill in the blanks", 
            new Choise[]{c1, c3}
        );
        CauHoi1 mcq1 = new CauHoi1(
            "What is the capital of France? sdfasdf", 
            new Choise[]{c1, c2, c3}, 
            c2
        );

        // Tạo câu hỏi chưa hoàn chỉnh
        CauHoi2 icq1 = new CauHoi2(
            "Fill in the blanks sdfsf", 
            new Choise[]{c1, c3}
        );
        // Quản lý danh sách câu hỏi
        QuestionList ql = new QuestionList();
        ql.addQuestion(mcq);
        ql.addQuestion(icq);
        ql.addQuestion(mcq1);
        ql.addQuestion(icq1);
        // Liệt kê câu hỏi trắc nghiệm
        System.out.println("Multiple Choice Questions:");
        ql.list("MultipleChoiceQuestion");

        // Thực hành với câu hỏi trắc nghiệm
        System.out.println("\nPracticing:");
        ql.practice("com.tracnghiem.Lesson5.CauHoi2", 2);
        
        Choise[] userAnswer = {new Choise("Paris", "Explanation A")};
        int result = mcq.checkAnswer(userAnswer);
        System.out.println(result); // Kết quả sẽ là 1 nếu câu trả lời đúng

    }
}
