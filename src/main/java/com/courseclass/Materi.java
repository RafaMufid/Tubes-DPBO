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
public class Materi extends Course{
    private ArrayList<String> listMateri = new ArrayList<>();
    
    public Materi(String name, String description, Teacher homeroom){
        super(name, description, homeroom);
    }
    
    public void addMateri(String materi){
        listMateri.add(materi);
        System.out.println("Materi '"+materi+"' ditambahkan ke dalam kelas "+super.getName());
    }
    
    public void viewMaterials() {
        System.out.println("Materi yang ada di class " + super.getName() + ": " + listMateri);
    }
}
