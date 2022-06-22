package com.abdul.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_tasks);

        // get button element by id
        Button addTaskButton =AddTask.this.findViewById(R.id.addTaskOnAddTaskPageButton);

        // set the event listener
        addTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView headerChange = AddTask.this.findViewById(R.id.submittedText);
                headerChange.setText("Submitted!");

            }
        });
    }
}