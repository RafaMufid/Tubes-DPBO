/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.GUIPackage;

import com.courseclass.Course;
import com.userclass.Student;
import com.userclass.Teacher;
import java.util.*;


/**
 *
 * @author ASUS
 */
public class LoginAndSignup {

    public static void main(String[] args) {
        Course.init_Course();
        Student.init_Student();
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); //center window
    }
}
