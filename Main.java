/*
 * Name: WECIB College Transfer Tool
 * Purpose: To help WECIB students identify what college-level classes they
   took in high school will transfer to their 4-year institution of choice.
 * Programmer: Biruk Yidnekachew
 * Date: 01 May 2026
*/


// Imports controller
import controller.TransferController;
/*  javac model/Course.java model/Student.java model/TransferCourse.java data/UniversityData.java view/ConsoleView.java controller/TransferController.java Main.java
    clear
    java Main
*/

/**
 * Main class to create controller object and run the program.
 *
 * @author Biruk Yidnekachew
 * @version 1.0
*/
public class Main {
    public static void main(String[] args) {
        TransferController controller = new TransferController();
        controller.run();
    }
}