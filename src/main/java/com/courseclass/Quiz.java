/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.courseclass;

import com.userclass.Student;
import com.userclass.Teacher;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class Quiz extends Course{
    private HashMap<String, HashMap<String, String>> quizzes = new HashMap<>();
    private HashMap<String, HashMap<Student, Integer>> quizSubmissions = new HashMap<>();

    public Quiz(String name, String description, Teacher teacher) {
        super(name, description, teacher);
    }

    public void addQuiz(String quizName, HashMap<String, String> questions) {
        quizzes.put(quizName, questions);
        quizSubmissions.put(quizName, new HashMap<>());
        System.out.println("Quiz '"+quizName+"' ditambahkan pada kelas " + super.getName());
    }

    public void submitQuiz(Student student, String quizName, HashMap<String, String> answers) {
        HashMap<String, String> jawabanBenar = quizzes.get(quizName);
        int score = 0;
        for (String question : jawabanBenar.keySet()) {
            if (jawabanBenar.get(question).equalsIgnoreCase(answers.get(question))) {
                score++;
            }
        }
        quizSubmissions.get(quizName).put(student, score);
        System.out.println(student.getName()+" telah mengumpulkan quiz '"+quizName+"'");
    }

    public void gradeQuiz(Teacher teacher, String quizName) {
        System.out.println("Hasil nilai quiz: " + quizName);
        HashMap<Student, Integer> submissions = quizSubmissions.get(quizName);
        for (Student student : submissions.keySet()) {
            int score = submissions.get(student);
            System.out.println(student.getName() + " mendapat nilai: " + score + "/3");
        }
    } 
}
