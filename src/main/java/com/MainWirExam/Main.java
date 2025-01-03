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
        Teacher pengguna = new Teacher(null, null);
        
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
                        System.out.print("Masukkan Nama: ");
                        String nama = input.next();
                        System.out.print("Masukkan Password: ");
                        String pass = input.next();
                        a.login();
                        break;
                    case 2:
                        System.out.println("Register dipilih.");
                        System.out.print("Masukkan Nama: ");
                        String name = input.next();
                        System.out.print("Masukkan Password: ");
                        String password = input.next();
                        pengguna = new Teacher(name, password);
                        System.out.println("Register selesai!");
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
        } while (choice != 0 && choice != 2); // Program akan berhenti jika pengguna memilih 0

        do {
            try {
                menuTeacher();
                choice = input.nextInt(); // Menerima input pilihan
                input.nextLine(); // Membersihkan newline karakter
                
                switch (choice) {
                    case 1:
                        System.out.print("Masukkan Kode Kelas: ");
                        String kode = input.next();
                        System.out.print("Masukkan Nama Kelas: ");
                        String name = input.next();
                        System.out.print("Masukkan Deskripsi Kelas: ");
                        String description = input.next();
                        pengguna.createClass(kode, name, description, pengguna);
                        System.out.println("Kelas berhasil ditambahkan!");
                        break;
                    case 2:
                        System.out.print("Masukkan Kode Kelas: ");
                        String kode1 = input.next();
                        System.out.print("Masukkan Nama Materi: ");
                        String name1 = input.next();
                        pengguna.addMateri(kode1, name1);
                        System.out.println("Materi berhasil ditambahkan!");
                        break;
                    case 3:
                        System.out.print("Masukkan Kode Kelas: ");
                        String kode2 = input.next();
                        System.out.print("Masukkan Nama Kuis: ");
                        String name2 = input.next();
                        HashMap<String, String> question = new HashMap<>();
                        question.put("1", "1 + 1 = ?");
                        pengguna.addQuiz(name2, question, kode2);
                        System.out.println("Kuis berhasil ditambahkan!");
                        break;
                    case 4:
                        System.out.print("Masukkan Nama Assesment: ");
                        String name3 = input.next();
                        HashMap<String, String> question1 = new HashMap<>();
                        question1.put("1", "Berapa hasil dari 80 x 213?");
                        pengguna.addAssessment(name3, question1);
                        System.out.println("Assesment berhasil ditambahkan!");
                        break;
                    case 5:
                        System.out.print("Masukkan Pesan Forum: ");
                        String post = input.next();
                        pengguna.postToForum(post);
                        System.out.println("Forum berhasil ditambahkan!");
                        break;
                    case 6:
                        System.out.print("Masukkan Nama Kuis: ");
                        String name4 = input.next();
                        System.out.print("Masukkan Nilai Kuis: ");
                        int nilai = input.nextInt();
                        System.out.println("Kuis " + name4 + " telah dinilai " + nilai + "!");
                        break;
                    case 7:
                        System.out.print("Masukkan Nama Assesment: ");
                        String name5 = input.next();
                        System.out.print("Masukkan Nilai Assesment: ");
                        int nilai2 = input.nextInt();
                        System.out.println("Assesment " + name5 + " telah dinilai " + nilai2 + "!");
                        break;
                    case 8:
                        System.out.println("-------------List Kelas-------------");
                        pengguna.showClass();
                        System.out.println("------------------------------------");
                        break;
                    case 9:
                        System.out.print("Masukkan Kode Kelas: ");
                        String kode4 = input.next();
                        pengguna.showMateri(kode4);
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
        }while (choice != 0);
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
    
    public static void menuTeacher(){
        System.out.println("======================");
        System.out.println("1. Tambah Kelas");
        System.out.println("2. Tambah Materi");
        System.out.println("3. Tambah Quiz");
        System.out.println("4. Tambah Assesment");
        System.out.println("5. Tambah Forum");
        System.out.println("6. Grade Quiz");
        System.out.println("7. Grade Assesment");
        System.out.println("8. Show Kelas");
        System.out.println("9. Show Materi");
        System.out.println("0. Logout");
        System.out.println("======================");
        System.out.println("Masukkan  Pilihan : ");
    }
}
