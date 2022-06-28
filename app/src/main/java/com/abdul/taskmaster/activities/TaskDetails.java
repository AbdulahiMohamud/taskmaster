package com.abdul.taskmaster.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.abdul.taskmaster.R;

public class TaskDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_details);

        setUpTaskTitle();
        setUpTaskDate();
        setUpTaskDescription();
        setUpTaskStatus();
    }

    private void setUpTaskTitle(){

        Intent callingIntent = getIntent();
        String taskTitleString = null;
        if(callingIntent != null){
            taskTitleString = callingIntent.getStringExtra(MainActivity.TASK_TITLE);
        }
        TextView taskTitle = findViewById(R.id.taskTitleText);
        if(taskTitle != null){
            taskTitle.setText(taskTitleString);
        }
        else {
            taskTitle.setText(R.string.no_task_title);
        }


    }
    private void setUpTaskDescription(){

        Intent callingIntent = getIntent();
        String taskDescriptionString = null;
        if(callingIntent != null){
            taskDescriptionString = callingIntent.getStringExtra(MainActivity.TASK_DESCRIPTION);
        }
        TextView taskDescription = findViewById(R.id.tasksDescripOnDetails);
        if(taskDescription != null){
            taskDescription.setText(taskDescriptionString);
        }
        else {

            taskDescription.setText(R.string.no_task_title);

        }


    }

    private void setUpTaskStatus(){

        Intent callingIntent = getIntent();
        String taskStatus = null;
        if(callingIntent != null){
            taskStatus = callingIntent.getStringExtra(MainActivity.TASK_STATUS);
        }
        TextView staus = findViewById(R.id.taskDetailStatus);
        if(staus != null){
            staus.setText(taskStatus);
        }
        else {

            staus.setText(R.string.no_task_title);

        }


    }

    private void setUpTaskDate(){

        Intent callingIntent = getIntent();
        String taskDateString = null;
        if(callingIntent != null){
            taskDateString = callingIntent.getStringExtra(MainActivity.TASK_CREATION);
        }
        TextView taskDate = findViewById(R.id.taskDateMadeOnDeatils);
        if(taskDate != null){
            taskDate.setText(taskDateString);
        }
        else {
            taskDate.setText(R.string.no_task_title);
        }


    }


}