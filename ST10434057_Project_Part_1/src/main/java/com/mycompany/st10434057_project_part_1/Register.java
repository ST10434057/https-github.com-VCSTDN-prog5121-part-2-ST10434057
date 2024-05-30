/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10434057_project_part_1;

/**
 *
 * @author Vivi
 */
import javax.swing.JOptionPane;


public class Register {
    
    
    public static void promptRegister() {
        int option = JOptionPane.showConfirmDialog(null, "Register:", "Register", JOptionPane.OK_CANCEL_OPTION);
        
        // If user clicks cancel button or closes the dialog using "x" button
        if (option == JOptionPane.CANCEL_OPTION || option == JOptionPane.CLOSED_OPTION) {
            // Return to the first JOptionPane
            MainPage.displayOptions();
            return;
        }
        
        System.out.println("Register: \n");
        JOptionPane.showMessageDialog(null, "Register:");
        
        String name = JOptionPane.showInputDialog("Enter name: ");
        if (name == null) {
            MainPage.displayOptions(); // Return to MainPage if cancelled
            return;
        }
        
        String surname = JOptionPane.showInputDialog("Enter Surname: ");
        if (surname == null) {
            MainPage.displayOptions();// Return to MainPage if cancelled
            return;
        }
        
        String registerUser = null;
        while (registerUser == null) {
            registerUser = JOptionPane.showInputDialog("Enter Username: ");
            if (registerUser == null) {
                MainPage.displayOptions(); // Return to MainPage if cancelled
                return;
            }
            if (!checkUserName(registerUser)) {
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length .");
                registerUser = null; // Reset registerUser to repeat the input
            }
        }
        
        String password = null;
        while (password == null) {
            password = JOptionPane.showInputDialog("Enter Password: ");
            if (password == null) {
                MainPage.displayOptions();// Return to MainPage if cancelled
                return;
            }
            if (!checkPasswordComplexity(password)) {
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
                password = null; // Reset password to repeat the input
            }
        }
        
        
       User user = new User(registerUser, password, name, surname);
       User.addNewUser(user);
        
        
        
        
        Login.promptLogin();
    }
    
    
    static boolean checkUserName(String registerUser){ // made this boolean function to check if the user Name is correctly formatted.
        String userName1 = registerUser; 
        
        if(userName1.length() < 6){
            for(int i = 0;i < userName1.length(); i++){
                if(registerUser.charAt(i) == '_'){
                    return true;
                }
            } 
        }
      return false;
    }
    
   
     static boolean checkPasswordComplexity(String password) { // Made this function to check if the password is correctly formatted.
    if (password.length() >= 9 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*[^a-zA-Z0-9].*")) {
        return true;
    } else {
        return false;
    }
}
    
    
}
