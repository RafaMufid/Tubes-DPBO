/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.userclass;

import com.courseclass.Course;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class Student extends User{
    private ArrayList<Course> enrolledClasses = new ArrayList<>();
    
    public Student(int id, String name, String password){
        super(id, name, password);
    }

    @Override
    public void login() {
        System.out.println("Student "+name+" has logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Student "+name+" has logged out.");
    }

    @Override
    public void viewForum() {
        System.out.println("View forum as a student");
    }
    
    public void enrollClass(Course course){
        enrolledClasses.add(course);
        course.addStudent(this);
        System.out.println(name+" has enrolled in class: "+course.getName());
    }
    
    
}
