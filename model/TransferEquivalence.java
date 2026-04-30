package model;

public class TransferEquivalence {
    private Course course;
    private boolean accepted;
    private int creditHrsAwarded;
    private String equivalentCourse;

    public TransferEquivalence(Course course, boolean accepted, int creditHrsAwarded, String equivalentCourse) {
        this.course = course;
        this.accepted = accepted;
        this.creditHrsAwarded = creditHrsAwarded;
        this.equivalentCourse = equivalentCourse;
    }

    public Course getCourse() {
        return course;
    }
    public boolean isAccepted() {
        return accepted;
    }
    public int getcreditHrsAwarded() {
        return creditHrsAwarded;
    }
    public String getEquivalentCourse() {
        return equivalentCourse;
    }
}