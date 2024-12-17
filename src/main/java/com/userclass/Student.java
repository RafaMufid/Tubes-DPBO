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
    private HashMap<String, Student> map = new HashMap<String,Student>();
    
    public Student(String name, String password){
        super(name, password);
    }

    public void init_Student() {
        map.put("1030232131231", new Student("wahyu","123"));
    }
    
    public boolean getEmail(String text) {
        for (Student s : map.values()) {
            if(s.getName().equals(text)){
                return true;
            }
        }
        return false; 
    }
    
    public boolean getPass(String text) {
        for (Student s : map.values()) {
            if(s.getPassword().equals(text)){
                return true;
            }
        }
        return false; 
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
