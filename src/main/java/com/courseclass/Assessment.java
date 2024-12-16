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
public class Assessment extends Course{
    private HashMap<String, HashMap<String, String>> listAssessment = new HashMap<>();
    private HashMap<String, HashMap<Student, Integer>> assessmentSubmissions = new HashMap<>();

    public Assessment(String name, String description, Teacher teacher) {
        super(name, description, teacher);
    }

    public void addAssessment(String assessmentName, HashMap<String, String> questions) {
        listAssessment.put(assessmentName, questions);
        assessmentSubmissions.put(assessmentName, new HashMap<>());
        System.out.println("Assessment '"+assessmentName+"' ditambahkan pada kelas " + super.getName());
    }

    public void submitAssessment(Student student, String assessmentName, HashMap<String, String> answers) {
        HashMap<String, String> correctAnswers = listAssessment.get(assessmentName);
        int score = 0;
        for (String question : correctAnswers.keySet()) {
            if (correctAnswers.get(question).equalsIgnoreCase(answers.get(question))) {
                score++;
            }
        }
        assessmentSubmissions.get(assessmentName).put(student, score);
        System.out.println(student.getName()+" telah mengumpulkan assessment '"+assessmentName);
    }

    public void gradeAssessment(Teacher teacher, String assessmentName) {
        System.out.println("Hasil nilai assessment: "+assessmentName);
        HashMap<Student, Integer> submissions = assessmentSubmissions.get(assessmentName);
        for (Student student : submissions.keySet()) {
            int score = submissions.get(student);
            System.out.println(student.getName() + " mendapat nilai: " + score + "/5");
        }
    }
}
