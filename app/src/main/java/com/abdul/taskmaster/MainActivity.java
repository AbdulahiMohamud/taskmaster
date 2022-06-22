package com.abdul.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    // get button element by id
        Button addTaskButton = MainActivity.this.findViewById(R.id.addTaskButton);

    // set the event listener
        addTaskButton.setOnClickListener(v -> {
            Intent goToAddTaskFromIntent = new Intent(MainActivity.this, AddTask.class);
            startActivity(goToAddTaskFromIntent);
        });

        // get button element by id
        Button allTaskButton = MainActivity.this.findViewById(R.id.allTaskButton);

        // set the event listener
        allTaskButton.setOnClickListener(v -> {
            Intent goToAllTaskFromIntent = new Intent(MainActivity.this, AllTasks.class);
            startActivity(goToAllTaskFromIntent);
        });






    }
}