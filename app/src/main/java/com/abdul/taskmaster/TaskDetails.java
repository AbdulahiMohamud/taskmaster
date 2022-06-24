package com.abdul.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TaskDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_details);

        setUpTaskTitle();
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
}