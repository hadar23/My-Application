package com.example.myapplication;
import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
public class MyFireBase {

        public static void setUser(User user) {
            final FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference("Users");
            myRef.child(user.getIdentity_number()).setValue(user);
        }
        //get all users
    //

        public static void getUsers(final CallBack_UsersReady callBack_usersReady) {
            final ArrayList<User> users2 = new ArrayList<>();
            final FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference("Users");
//ref inside database
            myRef.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    if (dataSnapshot == null)
                        callBack_usersReady.error();

                    for (DataSnapshot ds : dataSnapshot.getChildren()) {
                        User user = ds.getValue(User.class);
                        users2.add(user);
                    }

                    callBack_usersReady.usersReady(users2);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                    callBack_usersReady.error();
                }
            });
        }
    }

