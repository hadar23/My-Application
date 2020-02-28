package com.example.myapplication;

public class UserType {
    private boolean manager=false;
    private boolean student=false;

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public boolean is_student() {
        return student;
    }

    public void set_student(boolean student) {
        this.student = student;
    }
}
