/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.courseclass;

import com.userclass.Teacher;
import java.util.*;

/**
 *
 * @author Arrayan
 */
public class Forum extends Course {
    private ArrayList<String> posts = new ArrayList<>();

    public Forum(String name, String description, Teacher teacher) {
        super(name, description, teacher);
    }

    public void postToForum(String post) {
        posts.add(post);
        System.out.println("Forum berhasil di post class " + super.getName() + ": " + post);
    }

    public void viewPosts() {
        System.out.println("Forum pada class " + super.getName() + ": " + posts);
    }
}
