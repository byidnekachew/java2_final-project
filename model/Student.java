package model;

import java.util.ArrayList;

public class Student {
    private ArrayList<Course> coursesTaken = new ArrayList<>();
    private String university;

    public void addCourse(Course course) {
        coursesTaken.add(course);
    }

    public void setUniversity(String university){
        this.university = university;
    }

    public String getUniversity(){
        return university;
    }

    public ArrayList<Course> getCoursesTaken() {
        return coursesTaken;
    }
}