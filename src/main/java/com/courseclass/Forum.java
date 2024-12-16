/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.courseclass;

/**
 *
 * @author Arrayan
 */
public class Forum extends Course {
    private String isi;

    public Forum(String isi, String mapel, String courseID) {
        super(mapel, courseID);
        this.isi = isi;
    }

    @Override
    public void learn() {
        super.learn();
    }
    public void mengirimPesan(){
        System.out.println("Sedang mengirim pesan");
    }
    public void menerimaPesan(){
        System.out.println("Pesan diterima");
    }
}
