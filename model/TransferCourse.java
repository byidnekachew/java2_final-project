package model;

public class TransferCourse{
    private String courseCode;
    private String courseName;
    private int creditHrs;

    public TransferCourse(String courseCode, String courseName, int creditHrs) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHrs = creditHrs;
    }

    public String getCourseCode() {
        return courseCode;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getCreditHrs() {
        return creditHrs;
    }
}