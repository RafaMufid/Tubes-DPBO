/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.userclass;

/**
 *
 * @author ASUS
 */
public class User {
    private String nama;

    public User(String nama) {
        this.nama = nama;
    }
    
    public void login(){
        System.out.println("Login...");
    }
    
    public void logout(){
        System.out.println("Logout...");
    }
}
