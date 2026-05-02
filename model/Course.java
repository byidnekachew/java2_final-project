package model;

/**
 * Model class to hold information about a given WECIB course.
 *
 * @author Biruk Yidnekachew
 * @version 1.0
*/
public class Course {
    private String courseCode; // WTCC Course Code or shortened AP name
    private String courseName;
    private String courseType; // Dual Enrollment or AP
    private int score; // 5-1 scale for both. WTCC 5 represents A, 1 represents F.

    // Constructor
    public Course(String courseCode, String courseName, String courseType, int score) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseType = courseType;
        this.score = score;
    }

    // Getters for each data field
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
}