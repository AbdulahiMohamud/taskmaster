package com.abdul.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserSetting extends AppCompatActivity {
    // setup shared preferences
    SharedPreferences preferences;
    // preference tag
    public static final  String USER_NAME_TAG = "userName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_setting);
        saveAndSetUsername();
        saveButton();

    }


    public void saveAndSetUsername(){
        // create the shared preferrence instant
        preferences = PreferenceManager.getDefaultSharedPreferences(this);

        String userName = preferences.getString(USER_NAME_TAG,"");
        if(!userName.isEmpty()){
            EditText userNameEdited = findViewById(R.id.userNameInput);
            userNameEdited.setText(userName);
        }
    }


    public void saveButton(){
        // get the button
        Button userSaveButton = findViewById(R.id.saveUserNameButton);
        // set an on click event
        userSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting up the editor
                SharedPreferences.Editor preferenceEditor = preferences.edit();
                // grab the edit text for the username
                EditText userNameText = findViewById(R.id.userNameInput);
                // change it into a string
                String userNameString = userNameText.getText().toString();
                // update the USER_NAME_TAG to the string got from the user.
                preferenceEditor.putString(USER_NAME_TAG,userNameString);
                // NOTHINGS SAVES UNLESS apply the changes!!!!!
                preferenceEditor.apply();

                // make a notification to know the button works
                Toast.makeText(UserSetting.this,"Setting Saved",Toast.LENGTH_SHORT).show();

            }
        });
    }
}