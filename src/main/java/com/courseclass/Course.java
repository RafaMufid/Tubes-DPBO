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
    protected static Teacher homeroom;
    private Materi materi;
    private Quiz quiz;
    protected ArrayList<Student> students = new ArrayList<>();
    private static HashMap<String,Course> course = new HashMap<String,Course>();
    private static ArrayList<Course> arrCourse = new ArrayList<>();
    
    public Course(){
        this.name = null;
        this.description = null;
        this.homeroom = null;
    };
    
    public Course(String name, String description, Teacher homeroom){
        this.name = name;
        this.description = description;
        this.homeroom = homeroom;
    }
    
    public void setMateri(Materi materi) {
        this.materi = materi;
    }

    public Materi getMateri() {
        return materi;
    }
    
    public void setQuiz(Quiz quiz){
        this.quiz = quiz;
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

    public ArrayList<Course> getArrCourse() {
        return arrCourse;
    }
    
    public void showCourse(){
        for (int i = 0; i < arrCourse.size(); i++) {
            Course get = arrCourse.get(i);
            System.out.println(get.getCourse().keySet() + " " + get.name + " " + get.description);
        }
    }
   
    public HashMap<String, Course> getCourse() {
        return course;
    }
    
    public Course getKey(String kode){
        for (int i = 0; i < arrCourse.size(); i++) {
            Course get = arrCourse.get(i);
            if(get.getCourse().containsKey(kode)){
                return get.getCourse().get(kode);
            }
        }
        return null;
    }
    
    
    public String getName(){
        return this.name;
    }

    public static Teacher getHomeroom() {
        return homeroom;
    }
    
    public static void addMatkul(String kode, String name, String description, Teacher guru){
        Course newMapel = new Course(name,description,guru);
        course.put(kode,newMapel);
        arrCourse.add(newMapel);
    }
    
    public void addStudent(Student student){
        students.add(student);
        System.out.println(student+" ditambahkan ke dalam kelas "+name);
    }
    
}
