package model;

/**
 * Model class to hold information about a given course at a 4-year institution.
 *
 * @author Biruk Yidnekachew
 * @version 1.0
*/
public class TransferCourse{
    private String courseCode; // University course code
    private String courseName;
    private int creditHrs;
    private int scoreRequired; // For credit for the course

    // Constructor
    public TransferCourse(String courseCode, String courseName, int creditHrs, int scoreRequired) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHrs = creditHrs;
        this.scoreRequired = scoreRequired;
    }

    // Getters for each data field
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