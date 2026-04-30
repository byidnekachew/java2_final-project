package model;

import java.util.ArrayList;

public class Student {
    private ArrayList<Course> coursesTaken = new ArrayList<>();

    public void addCourse(Course course) {
        coursesTaken.add(course);
    }

    public ArrayList<Course> getCoursesTaken() {
        return coursesTaken;
    }
}