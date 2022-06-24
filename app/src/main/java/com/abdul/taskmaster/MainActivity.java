package com.abdul.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TASK_TITLE = "task title";
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize shared preference
        preferences = PreferenceManager.getDefaultSharedPreferences(this);

        // reroutes to other activities
        goToAddTaskBtn();
        goToAllTaskBtn();
        goToUSerSettingBtn();

        // tasks hard coded in task that re-route to task details activity
        taskClean();
        taskGym();
        taskStudy();



    }

    @Override
    protected void onResume(){
        super.onResume();

        updateUsername();

    }


    public void goToAddTaskBtn(){
        // get button element by id
        Button addTaskButton = MainActivity.this.findViewById(R.id.addTaskButton);

        // set the event listener
        addTaskButton.setOnClickListener(v -> {
            Intent goToAddTaskFromIntent = new Intent(MainActivity.this, AddTask.class);
            startActivity(goToAddTaskFromIntent);
        });
    }


    public void goToAllTaskBtn(){
        // get button element by id
        Button allTaskButton = MainActivity.this.findViewById(R.id.allTaskButton);

        // set the event listener
        allTaskButton.setOnClickListener(v -> {
            Intent goToAllTaskFromIntent = new Intent(MainActivity.this, AllTasks.class);
            startActivity(goToAllTaskFromIntent);
        });
    }

    public void goToUSerSettingBtn() {
        // get button element by id
        ImageButton userSettingsButton = MainActivity.this.findViewById(R.id.goToUserSettingButton);

        // set the event listener
        userSettingsButton.setOnClickListener(v -> {
            Intent goToUserSetting = new Intent(MainActivity.this, UserSetting.class);
            startActivity(goToUserSetting);
        });
    }


    public void taskClean(){
        Button cleanTaskBtn = findViewById(R.id.cleanTaskButton);

        cleanTaskBtn.setOnClickListener(v -> {
            Intent goToTaskDetails = new Intent(MainActivity.this, TaskDetails.class);
            // include an extra with the event
            goToTaskDetails.putExtra(TASK_TITLE,cleanTaskBtn.getText().toString());
            // start the activity
            startActivity(goToTaskDetails);

        });
    }

    public void taskGym(){
        Button gymTaskBtn = findViewById(R.id.gymTaskButton);

        gymTaskBtn.setOnClickListener(v -> {
            Intent goToTaskDetails = new Intent(MainActivity.this, TaskDetails.class);
            // include an extra with the event
            goToTaskDetails.putExtra(TASK_TITLE,gymTaskBtn.getText().toString());
            // start the activity
            startActivity(goToTaskDetails);

        });
    }

    public void taskStudy(){
        Button studyTaskBtn = findViewById(R.id.studyTaskButton);

        studyTaskBtn.setOnClickListener(v -> {
            Intent goToTaskDetails = new Intent(MainActivity.this, TaskDetails.class);
            // include an extra with the event
            goToTaskDetails.putExtra(TASK_TITLE,studyTaskBtn.getText().toString());
            // start the activity
            startActivity(goToTaskDetails);

        });
    }

    public void updateUsername(){
        // get userName
        String userName = preferences.getString(UserSetting.USER_NAME_TAG,"No UserName");
        // formated the title
        String formatedUserNameTitle = String.format("%s's Tasks",userName);
        // set UserName to view
        TextView userNameText = findViewById(R.id.homeTaskTitle);
        userNameText.setText(formatedUserNameTitle);
    }




}