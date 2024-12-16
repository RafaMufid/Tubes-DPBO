/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.courseclass;

/**
 *
 * @author ASUS
 */
public class Materi extends Course{
    private String isi;

    public Materi(String isi, String courseID) {
        super(courseID);
        this.isi = isi;
    }

    public void learn(){
        System.out.println("Membuka materi");
    }
    
    public void document(){
        System.out.println("Mengakses materi: \n"+isi);
    }
    
    public void video(){
        System.out.println("Membuka video...");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("Video selesai");
    }
    
}
