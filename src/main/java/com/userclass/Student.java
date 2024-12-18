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
public class Student implements IUser{
    private String name;
    private String password;
    private ArrayList<Course> enrolledClasses = new ArrayList<>();
    private static HashMap<String, Student> map = new HashMap<>(); // Shared student registry

    // Constructor
    public Student(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // Method to initialize sample data
    public static void init_Student() {
        map.put("adrianp@gmail.com", new Student("Adrian", "123"));
    }

    // Check if email exists in the map
    public static boolean emailExists(String email) {
        return map.containsKey(email);
    }

    // Validate password for a given email
    public static boolean validatePassword(String email, String password) {
        if (map.containsKey(email)) {
            return map.get(email).password.equals(password);
        }
        return false;
    }

    // Register a new student
    public static boolean register(String email, String name, String password) {
        if (map.containsKey(email)) {
            System.out.println("Registration Error: Email already exists.");
            return false;
        }

        Student newStudent = new Student(name, password);
        map.put(email, newStudent);
        System.out.println("Registration successful for " + name);
        return true;
    }

    // Enroll in a class
    public void enrollClass(Course course) {
        enrolledClasses.add(course);
        course.addStudent(this);
        System.out.println(name + " has enrolled in class: " + course.getName());
    }

    // IUser interface methods
    public void login() {
        System.out.println("Student " + name + " has logged in.");
    }

    public void logout() {
        System.out.println("Student " + name + " has logged out.");
    }

    public void viewForum() {
        System.out.println("View forum as a student.");
    }
    
    // Getters
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }    
    
}
