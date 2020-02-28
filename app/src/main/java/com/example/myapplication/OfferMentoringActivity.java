package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
//import firebase from 'react-native-firebase';
//import FirebaseCore

public class OfferMentoringActivity extends AppCompatActivity {
    private EditText EDT_code_course;
    private  EditText EDT_course_grade;
    private  EditText EDT_course_level;
    private  EditText EDT_course_name;
    private Button BTN_add;

    private String course_code;
    private String course_grade;
    private String course_level;
    private String course_name;

    private boolean b=true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_mentoring);

        EDT_code_course=findViewById(R.id.EDT_code_course);
        EDT_course_grade=findViewById(R.id.EDT_course_grade);
        EDT_course_level=findViewById(R.id.EDT_course_level);
        EDT_course_name=findViewById(R.id.EDT_course_name);

        BTN_add=findViewById(R.id.BTNadd);

        final EditText [] editArr={EDT_code_course,EDT_course_grade,EDT_course_level,EDT_course_name};






        //FirebaseUser userg
        BTN_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for(EditText ed : editArr){
                    if(isEDempty(ed))
                        b=false;
                }
                if (b){

                    course_code= EDT_code_course.getText().toString();
                    course_grade = EDT_course_grade.getText().toString();
                    course_level =EDT_course_level.getText().toString();
                    course_name =EDT_course_name.getText().toString();

                    User user1= new User("hadar","312323232","9756453232","emailgmailcom","12345","12345","12345");
                    MyFireBase.setUser(user1);
                }


  //              MyFireBase.getUsers(new CallBack_UsersReady() {
  //                  @Override
  //                  public void usersReady(ArrayList<User> users) {
 //                       for(User user : users) {
////                            if (user.getIdentity_number())
////                      }
//                  }
//
////                  @Override
//                  public void error() {

//                  }
//              });


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
