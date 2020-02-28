package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class UserSignUpActivity extends AppCompatActivity {
    private EditText EDT_full_nameET;
    private  EditText EDT_identity_numberET;
    private  EditText EDT_phone_numberET;
    private  EditText EDT_email;
    private  EditText EDT_academy;
    private  EditText EDT_start_year;
    private  EditText EDT_engineering;
    private Button BTNsign_up;

    private boolean b=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up);

        EDT_full_nameET=findViewById(R.id.EDT_full_nameET);
        EDT_identity_numberET=findViewById(R.id.EDT_identity_numberET);
        EDT_phone_numberET=findViewById(R.id.EDT_phone_numberET);
        EDT_email=findViewById(R.id.EDT_email);
        EDT_academy=findViewById(R.id.EDT_academy);
        EDT_start_year=findViewById(R.id.EDT_start_year);
        EDT_engineering=findViewById(R.id.EDT_engineering);

        BTNsign_up=findViewById(R.id.BTNsign_up);


        final EditText [] editArr={EDT_full_nameET,EDT_identity_numberET,EDT_phone_numberET,EDT_email,EDT_academy,EDT_start_year,EDT_engineering};



        BTNsign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(EditText ed : editArr){
                    if(isEDempty(ed))
                        b=false;
                }
                if (b){
                     User user1= new User("hadar","312323232","9756453232","emailgmailcom","12345","12345","12345");
                     MyFireBase.setUser(user1);
                }



            }
        });
    }
    private boolean isEDempty(EditText etText) {
        if(etText.getText().toString().trim().length() == 0) {
            etText.setError("this box is empty");
            return true;
        }
        return false;
    }







}
