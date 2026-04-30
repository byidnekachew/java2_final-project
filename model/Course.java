package model;

public class Course {
    private String courseCode;
    private String courseName;
    private String courseType;
    private int score;

    public Course(String courseCode, String courseName, String courseType, int score) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseType = courseType;
        this.score = score;
    }

    public String getCourseCode() {
        return courseCode;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getCourseType() {
        return courseType;
    }
    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return courseName + " (" + courseType + ", Score: " + score + ")";
    }
}