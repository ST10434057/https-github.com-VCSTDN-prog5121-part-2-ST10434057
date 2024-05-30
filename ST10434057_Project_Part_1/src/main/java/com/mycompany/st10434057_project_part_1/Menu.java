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

public class Menu {

    
    public enum Items {
        Add_Task,
        Show_Report,
        Quit,
//        ManageExistingTask,
//        FinishedTasks,
//        ShowAllTasks,
//        RemoveAllTasks
    }

    public static void promptMenu() {
        
        Object[] options = {Items.Add_Task,Items.Show_Report, Items.Quit,};
//            Items.ManageExistingTask, Items.FinishedTasks,  Items.ShowAllTasks, Items.RemoveAllTasks};

        
        Object selectedItem = JOptionPane.showInputDialog(
                null,
                "Welcome  to EasyKanban!, Select an option:",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        // Process the selected item
        if (selectedItem != null) {
            Items item = (Items) selectedItem;
            switch (item) {
                case Add_Task:
                    AddTask.promptAddTask();
                    break;
                case Show_Report:
                    JOptionPane.showMessageDialog(null,"Coming Soon");
                    Menu.promptMenu();
                    break;
                case Quit:
                   System.exit(0);
                    break;
//                case ManageExistingTask:
//                 
//                    break;
//                case FinishedTasks:
//                
//                    break;
//                
//                case ShowAllTasks:
//          
//                    break;
//                case RemoveAllTasks:
//                  
//                    break;
            }
        } else {
            System.out.println("No item selected.");
            MainPage.displayOptions();
        }
    }
}

//    // Methods for each option
//    public static void addNewTask() {
//        System.out.println("Adding a new task...");
//    }
//
//    public static void addMultipleTask() {
//        System.out.println("Adding multiple tasks...");
//    }
//
//    public static void manageExistingTask() {
//        System.out.println("Managing existing tasks...");
//    }
//
//    public static void showAllTasks() {
//        System.out.println("Showing all tasks...");
//    }
//
//    public static void removeAllTasks() {
//        System.out.println("Removing all tasks...");
//    }
//
//    public static void main(String[] args) {
//        promptMenu();
//    }
//}
