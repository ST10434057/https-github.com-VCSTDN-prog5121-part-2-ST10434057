/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.st10434057_project_part_1.*;
import org.junit.jupiter.api.Test;
/**
 *
 * @author Vivi
 */
import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.*;

public class JUnitTaskDetails {

    @Test
    public void testTaskDescriptionLength_Success() {
        TaskArray taskArray = new TaskArray("Login Feature", 1, "Create Login to authenticate users", "Robyn Harrison", 8, "AD:1:BYN", "To Do");
        TaskArray.addNewTask(taskArray);
        assertEquals("Create Login to authenticate users", TaskArray.taskarray[0]._taskDescription);
    }

    @Test
    public void testTaskDescriptionLength_Failure() {
        String longDescription = "This description is definitely longer than fifty characters, so it should fail";
        assertTrue(longDescription.length() > 50);
    }

    @Test
    public void testTaskID_Correctness() {
        TaskArray taskArray = new TaskArray("Login Feature", 1, "Create Login to authenticate users", "Robyn Harrison", 8, "AD:1:BYN", "To Do");
        TaskArray.addNewTask(taskArray);
        assertEquals("Login Feature:1:Robyn Harrison", TaskArray.taskarray[0]._taskId);
    }

    @Test
    public void testTotalHoursAccumulated() {
        TaskArray.addNewTask(new TaskArray("Login Feature", 1, "Create Login to authenticate users", "Robyn Harrison", 8, "AD:1:BYN", "To Do"));
        TaskArray.addNewTask(new TaskArray("Add Task Feature", 2, "Create Add Task feature to add task users", "Mike Smith", 10, "CR:0:IKE", "Doing"));

        double totalHours = 0;
        for (int i = 0; i < TaskArray.taskArrayCount; i++) {
            totalHours += TaskArray.taskarray[i]._taskDuration;
        }
        assertEquals(18, totalHours);
    }

    @Test
    public void testAdditionalDataTotalHours() {
        TaskArray.addNewTask(new TaskArray("Task 1", 1, "Description 1", "Dev One", 10, "CR:0:IKE", "To Do"));
        TaskArray.addNewTask(new TaskArray("Task 2", 2, "Description 2", "Dev Two", 12, "CR:1:ARD", "To Do"));
        TaskArray.addNewTask(new TaskArray("Task 3", 3, "Description 3", "Dev Three", 55, "CR:2:THA", "To Do"));
        TaskArray.addNewTask(new TaskArray("Task 4", 4, "Description 4", "Dev Four", 11, "CR:3:ND", "To Do"));
        TaskArray.addNewTask(new TaskArray("Task 5", 5, "Description 5", "Dev Five", 1, "CR:4:KLE", "To Do"));

        double totalHours = 0;
        for (int i = 0; i < TaskArray.taskArrayCount; i++) {
            totalHours += TaskArray.taskarray[i]._taskDuration;
        }
        assertEquals(89, totalHours);
    }
}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

