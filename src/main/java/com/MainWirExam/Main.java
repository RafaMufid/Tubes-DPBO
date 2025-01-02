/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.MainWirExam;

import com.userclass.Teacher;
import com.userclass.User;

/**
 *
 * @author Rendy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teacher.init_Teacher();
        System.out.println(Teacher.emailExists("akurafamufid@gmail.com"));
        Teacher.register("ahmaddillan@gmail.com", "Dillan", "123");
        System.out.println(Teacher.validatePassword("ahmaddillan@gmail.com", "123"));
    }
    
    public void menu1(){
        System.out.println("======================");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("0. Exit");
        System.out.println("======================");
        System.out.println("Masukkan  Pilihan : ");
    }
    
    public void menuTeacher(){
        System.out.println("======================");
        System.out.println("1. Tambah Kelas");
        System.out.println("2. Tambah Materi");
        System.out.println("3. Tambah Quiz");
        System.out.println("4. Tambah Assesment");
        System.out.println("5. Tambah Forum");
        System.out.println("6. Grade Quiz");
        System.out.println("7. Grade Assesment");
        System.out.println("0. Logout");
        System.out.println("======================");
        System.out.println("Masukkan  Pilihan : ");
    }
}
