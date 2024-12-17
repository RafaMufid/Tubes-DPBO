/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.userclass;

import com.courseclass.Assessment;
import com.courseclass.Course;
import com.courseclass.Quiz;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class Teacher extends User implements IManage{
    private ArrayList<Course> classes = new ArrayList<>();

    public Teacher(String name, String email) {
        super(name, email);
    }

    @Override
    public void login() {
        System.out.println("Teacher " + name + " has logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Teacher " + name + " has logged out.");
    }

    @Override
    public void viewForum() {
        System.out.println("Viewing forum as a teacher.");
    }

    // CourseOperations implementations
    @Override
    public void createClass(String name, String description) {
        Course Course = new Course(name, description, this);
        classes.add(Course);
        System.out.println("Class " + name + " created by Teacher " + this.name);
    }

    @Override
    public void addMateri(String materi) {
        System.out.println("Material added: " + materi);
    }

    @Override
    public void addQuiz(String quizName, HashMap<String, String> questions) {
        System.out.println("Quiz added: " + quizName);
    }

    @Override
    public void addAssessment(String assessmentName, HashMap<String, String> questions) {
        System.out.println("Assessment added: " + assessmentName);
    }

    @Override
    public void postToForum(String post) {
        System.out.println("Forum post by Teacher: " + post);
    }

    public void gradeQuiz(String quizName, Quiz Course) {
        Course.gradeQuiz(this, quizName);
    }

    public void gradeAssessment(String assessmentName, Assessment Course) {
        Course.gradeAssessment(this, assessmentName);
    }
}
