package com.example.myapplication;

public class Course {
    private String courseName;
    private String courseCode;
    private String courseGrade;
    private String courseLevel;

    public Course(String courseName, String courseCode, String courseGrade, String courseLevel) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseGrade = courseGrade;
        this.courseLevel = courseLevel;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }
}
