/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.userclass;

import java.util.*;
/**
 *
 * @author ASUS
 */
public interface IManage {
    public void createClass(String kode, String name, String description, Teacher homeroom);
    public void addMateri(String kodeKelas, String materi);
    public void addQuiz(String quizName, HashMap<String, String> questions);
    public void addAssessment(String assessmentName, HashMap <String, String> questions);
    public void postToForum(String post);
}