/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.courseclass;

import java.util.*;

/**
 *
 * @author ASUS
 */
public class Course {
    private String[] mapel = new String[3];
    private String courseID;
    
    public Course(String[] mapel, String courseID) {
        this.mapel[0] = "Matematika";
        this.mapel[1] = "Fisia";
        this.mapel[2] = "Kimia";
        this.courseID = courseID;
    }
    public void learn(){
        System.out.println("Mulai belajar");
    }
}
