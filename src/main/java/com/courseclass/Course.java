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
public class Course{
    private String name;
    private String description;
    protected Teacher homeroom;
    protected ArrayList<Student> students = new ArrayList<>();
    private static HashMap<String,Course> course = new HashMap<String,Course>();
    private static ArrayList<Course> arrCourse = new ArrayList<>();
    
    public Course(String name, String description, Teacher homeroom){
        this.name = name;
        this.description = description;
        this.homeroom = homeroom;
    }
    
    public static void init_Course(){
         // Create courses and add them to the map
        Course mathCourse = new Course("Matematika", "Pelajaran MTK", new Teacher("Budi", "budigila"));
        Course chemistryCourse = new Course("KIMIA", "Pelajaran Kimia", new Teacher("Wahyu", "samsularip"));
        Course englishCourse = new Course("BING", "Pelajaran Bahasa Inggris", new Teacher("Lukman", "mamatsalto"));

        course.put("MTK1412", mathCourse);
        course.put("KMA599", chemistryCourse);
        course.put("BIG789", englishCourse);

        // Add courses to the array list
        arrCourse.add(mathCourse);
        arrCourse.add(chemistryCourse);
        arrCourse.add(englishCourse);
    }

    public String getDescription() {
        return description;
    }

    public static ArrayList<Course> getArrCourse() {
        return arrCourse;
    }
    
    public HashMap<String, Course> getCourse() {
        return course;
    }
    
    public String getName(){
        return this.name;
    }
    
//    public static String getName1(){
//      StringBuilder courseNames = new StringBuilder();
//
//    // Iterate through each course and append its name
//    for (int i = 0; i < arrCourse.size(); i++) {
//        courseNames.append(arrCourse.get(i).name);
//
//        // Add a line break between course names
//        if (i < arrCourse.size() - 1) {
//            courseNames.append("\n");  // Add a new line after each course name
//        }
//    }
//
//    // Return all course names as a single string
//    return courseNames.toString();
//    }
    
    public void addStudent(Student student){
        students.add(student);
        System.out.println(student+" ditambahkan ke dalam kelas "+name);
    }
}
