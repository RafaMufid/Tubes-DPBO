/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.courseclass;

/**
 *
 * @author ASUS
 */
public class Quiz extends Course implements IEvaluasi{
    private String tipe;

    public Quiz(String tipe, String mapel, String courseID) {
        super(mapel, courseID);
        this.tipe = tipe;
    }
    
    @Override
    public boolean status() {
        return true;
    }

    @Override
    public int nilai() {
        return 0;
    }
    
    
}
