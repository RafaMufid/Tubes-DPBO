/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.userclass;

import com.courseclass.Assessment;
import com.courseclass.Course;
import com.courseclass.Materi;
import com.courseclass.Quiz;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class Teacher implements IUser, IManage{
    private String name;
    private String password;
    private Course Course;
    private Materi materi;
    private static HashMap<String, Teacher> map = new HashMap<>();

    public Teacher(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    // Method to initialize sample data
    public static void init_Teacher() {
        map.put("akurafamufid@gmail.com", new Teacher("Rafa", "123"));
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

        Teacher newTeacher = new Teacher(name, password);
        map.put(email, newTeacher);
        System.out.println("Registration successful for " + name);
        return true;
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
    public void createClass(String kode, String name, String description, Teacher homeroom) {
        Course.addMatkul(kode, name, description, homeroom);
    }
    
    public void showClass(){
        Course.showCourse();
    }
    
    public void showMateri(String kodeKelas) {
        Course course = Course.getCourse().get(kodeKelas); // Retrieve the course
        if (course != null && course.getMateri() != null) {
            course.getMateri().viewMaterials(); // Use the viewMaterials method in Materi
        } else if (course == null) {
            System.out.println("Course with code " + kodeKelas + " not found.");
        } else {
            System.out.println("No materials have been added to the class " + course.getName());
        }
    }

    @Override
    public void addMateri(String kodeKelas, String materi) {
        Course course = Course.getCourse().get(kodeKelas); // Retrieve the course using its code
        if (course != null) {
            if (course.getMateri() == null) {
                // Initialize Materi for the course if it doesn't exist
                Materi m = new Materi(course.getName(), course.getDescription(), course.getHomeroom());
                course.setMateri(m);
            }
            // Add the materi to the course's Materi object
            course.getMateri().addMateri(materi);
        } else {
            System.out.println("Course with code " + kodeKelas + " not found.");
        }
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

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
