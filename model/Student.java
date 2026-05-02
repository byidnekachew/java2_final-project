package model;

// Dependencies imported
import java.util.ArrayList; // For courses taken

/**
 * Model class to hold information about a given WECIB student (aka, the user).
 *
 * @author Biruk Yidnekachew
 * @version 1.0
*/
public class Student {
    private ArrayList<Course> coursesTaken = new ArrayList<>(); // An array list of Course objects
    private int university; // An ID number (0-8) which corresponds to the position of that university in the UniversityData ArrayList

    /**
     * Modifies coursesTaken array to add a Course object.
     *
     * @author Biruk Yidnekachew
     * @version 1.0
     * @param Course course
    */
    public void addCourse(Course course) {
        coursesTaken.add(course);
    }

    /**
     * Assigns a university id to the user.
     *
     * @author Biruk Yidnekachew
     * @version 1.0
     * @param int university
    */
    public void setUniversity(int university){
        this.university = university;
    }

    // Getters for each data field
    public int getUniversity(){
        return university;
    }
    public ArrayList<Course> getCoursesTaken() {
        return coursesTaken;
    }
}