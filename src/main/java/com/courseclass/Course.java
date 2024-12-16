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
public class Course {
    private String name;
    private String description;
    protected Teacher homeroom;
    protected ArrayList<Student> students = new ArrayList<>();
    
    public Course(String name, String description, Teacher homeroom){
        this.name = name;
        this.description = description;
        this.homeroom = homeroom;
    }
    
    public String getName(){
        return name;
    }
    
    public void addStudent(Student student){
        students.add(student);
        System.out.println(student+" ditambahkan ke dalam kelas "+name);
    }
}
