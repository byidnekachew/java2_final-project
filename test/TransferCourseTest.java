import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import model.TransferCourse;

public class TransferCourseTest{
    @Test
    public void testGetCode(){
        TransferCourse tc = new TransferCourse("GENR-000", "General Course", 3, 4);
        
        assertEquals("GENR-000", tc.getCourseCode());
    }


    @Test
    public void testGetCourseName(){
        TransferCourse tc = new TransferCourse("GENR-000", "General Course", 3, 4);
        
        assertEquals("General Course", tc.getCourseName());
    }


    @Test
    public void testGetCreditHrs(){
        TransferCourse tc = new TransferCourse("GENR-000", "General Course", 3, 4);
        
        assertEquals(3, tc.getCreditHrs());
    }


    @Test
    public void testGetScoreRequired(){
        TransferCourse tc = new TransferCourse("GENR-000", "General Course", 3, 4);
        
        assertEquals(4, tc.getScoreRequired());
    }
}