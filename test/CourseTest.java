import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import model.Course;

public class CourseTest {
    @Test
    public void testGetCode() {
        Course c = new Course("GENR-000", "General Course", "Dual Enrollment", 4);

        assertEquals("GENR-000", c.getCourseCode());
    }


    @Test
    public void testGetName() {
        Course c = new Course("GENR-000", "General Course", "Dual Enrollment", 4);

        assertEquals("General Course", c.getCourseName());
    }


    @Test
    public void testGetType() {
        Course c = new Course("GENR-000", "General Course", "Dual Enrollment", 4);

        assertEquals("Dual Enrollment", c.getCourseType());
    }


    @Test
    public void testGetScore() {
        Course c = new Course("GENR-000", "General Course", "Dual Enrollment", 4);

        assertEquals(4, c.getScore());
    }

}
