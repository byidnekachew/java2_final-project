import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import model.Student;
import model.Course;

public class StudentTest{
    @Test
    public void testAddCourse(){
        Student user = new Student();
        Course c = new Course("GENR-000", "General Course", "Dual Enrollment", 4);
        user.addCourse(c);

        assertTrue(user.getCoursesTaken().contains(c));
    }

    @Test
    public void testSetUniversity(){
        Student user = new Student();
        user.setUniversity(2);

        assertEquals(2, user.getUniversity());
    }

}