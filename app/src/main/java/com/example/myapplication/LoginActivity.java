package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    private EditText EDT_user_name;
    private EditText EDT_password;
    private Button BTN_sign_up;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EDT_user_name=findViewById(R.id.EDT_user_name);
        EDT_password=findViewById(R.id.EDT_password);
        BTN_sign_up=findViewById(R.id.BTN_sign_up);



        BTN_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                MyFireBase.getUsers(new CallBack_UsersReady() {
                    @Override
                    public void usersReady(ArrayList<User> users) {
                        for(User user : users) {
//                            if (user.getIdentity_number())
                        }
                    }

                    @Override
                    public void error() {

                    }
                });


            }
        });




    }


}
