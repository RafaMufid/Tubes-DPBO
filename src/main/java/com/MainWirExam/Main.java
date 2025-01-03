/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.MainWirExam;

import com.userclass.Teacher;
import com.userclass.User;
import com.courseclass.*;
import java.util.*;

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
        Teacher a = new Teacher("Azriel", "bisaDipercepat");
        
        a.createClass("MTK1", "MTK", "Matematika", a);
        a.showClass();
        
        HashMap<String, String> q = new HashMap<>();
        q.put("1", "1 + 1 = ?");
        
        a.addQuiz("Matematika", q, "MTK1");
        Scanner input = new Scanner(System.in);

        int choice = -1;
        do {
            try {
                menu1(); // Menampilkan menu utama
                choice = input.nextInt(); // Menerima input pilihan
                input.nextLine(); // Membersihkan newline karakter
                
                switch (choice) {
                    case 1:
                        System.out.println("Login dipilih.");
                        // Tambahkan logika untuk login
                        break;
                    case 2:
                        System.out.println("Register dipilih.");
                        // Tambahkan logika untuk register
                        break;
                    case 0:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid. Masukkan angka!");
                input.nextLine(); // Membersihkan input yang tidak valid
            }
        } while (choice != 0); // Program akan berhenti jika pengguna memilih 0

        input.close(); // Menutup scanner

        
    }
    
    public static void menu1(){
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
