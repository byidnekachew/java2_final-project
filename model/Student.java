package model;

import java.util.ArrayList;

public class Student {
    private ArrayList<Course> coursesTaken = new ArrayList<>();
    private int university;

    public void addCourse(Course course) {
        coursesTaken.add(course);
    }

    public void setUniversity(int university){
        this.university = university;
    }

    public int getUniversity(){
        return university;
    }

    public ArrayList<Course> getCoursesTaken() {
        return coursesTaken;
    }
}