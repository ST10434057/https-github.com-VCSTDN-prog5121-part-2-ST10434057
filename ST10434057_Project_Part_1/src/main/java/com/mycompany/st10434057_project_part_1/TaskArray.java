/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10434057_project_part_1;
import javax.swing.JOptionPane;
/**
 *
 * @author Vivi
 */
public class TaskArray {
    public static int taskArrayCount = 0;
    public static int taskNumberCounter = 1; 
    public static TaskArray[] taskarray = new TaskArray[225];

    public String _taskName;
    public int _taskNumber;
    public String _taskDescription;
    public String _developerDetails;
    public double _taskDuration;
    public String _taskId;
    public String _taskStatus;

    public TaskArray(String taskName, int taskNumber, String taskDescription, String developerDetails, double taskDuration, String taskId, String taskStatus) {
        this._taskName = taskName;
        this._taskNumber = taskNumber;
        this._taskDescription = taskDescription;
        this._developerDetails = developerDetails;
        this._taskDuration = taskDuration;
        this._taskId = taskId;
        this._taskStatus = taskStatus;
    }

    public static void addNewTask(TaskArray task) {
        if (taskArrayCount < taskarray.length) {
            taskarray[taskArrayCount] = task;
            taskArrayCount++;
        } else {
            JOptionPane.showMessageDialog(null, "Task array is full!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
