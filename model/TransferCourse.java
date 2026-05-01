package model;

public class TransferCourse{
    private String courseCode;
    private String courseName;
    private int creditHrs;
    private int scoreRequired;

    public TransferCourse(String courseCode, String courseName, int creditHrs, int scoreRequired) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHrs = creditHrs;
        this.scoreRequired = scoreRequired;
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
    
    public int getScoreRequired(){
        return scoreRequired;
    }
}