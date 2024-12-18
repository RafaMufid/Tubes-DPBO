/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.GUIPackage;

import com.userclass.Student;
import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        Student.init_Student();
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); //center window
    }
}
