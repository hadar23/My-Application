package com.example.myapplication;

public class User {

    private String fullName;
    private String identity_number;
    private String phone;
    private String email;
    private String academy;
    private String year;
    private String engineering;
    private Course courseArr;
    private Massage massageArr;

//    private String password;
//    private String verify;

    public User() {

    }

    public User(String fullName, String identity_number, String phone, String email, String academy, String year, String engineering) {
        this.fullName = fullName;
        this.identity_number = identity_number;
        this.phone = phone;
        this.email = email;
        this.academy = academy;
        this.year = year;
        this.engineering = engineering;
    }

    public Course getCourseArr() { return courseArr;    }

    public void setCourseArr(Course courseArr) { this.courseArr = courseArr;    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdentity_number() {
        return identity_number;
    }

    public void setIdentity_number(String identity_number) {
        this.identity_number = identity_number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEngineering() {
        return engineering;
    }

    public void setEngineering(String engineering) {
        this.engineering = engineering;
    }
}
