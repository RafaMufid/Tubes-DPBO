/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.userclass;

/**
 *
 * @author ASUS
 */
public abstract class User {
    protected int id;
    protected String name;
    protected String password;

    public User(String name, String password){
        this.id = id+1;
        this.name = name;
        this.password = password;
    }
    
    
    public String getName(){
        return name;
    }

    public String getPassword() {
        return password;
    }
    
    
    public abstract void login();
    public abstract void logout();
    public abstract void viewForum();
}
