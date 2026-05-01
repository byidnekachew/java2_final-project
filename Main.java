import controller.TransferController;
// javac model/Course.java model/Student.java model/TransferCourse.java data/UniversityData.java view/ConsoleView.java controller/TransferController.java Main.java
// clear
// java Main

public class Main {
    public static void main(String[] args) {
        TransferController controller = new TransferController();
        controller.run();
    }
}