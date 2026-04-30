package controller;

import java.util.Scanner;
import model.Course;
import model.Student;
import view.ConsoleView;

public class TransferController{
    Scanner keyboard = new Scanner(System.in);
    private Student user = new Student();
    private ConsoleView output = new ConsoleView();
    
    String programArea;
    Boolean netPlusStatus; 
    String additionalWTCC;
    String apExams;
    String university;

    public void run(){
        output.welcome();

        output.programAreaPrompt();
        programArea = keyboard.next();
        if (programArea.equals("2") || programArea.equals("3")){
            output.netPlusPrompt();
            String netPlusResponse = keyboard.next();
            if (netPlusResponse.equals("1")){
                netPlusStatus = true;
            } else {
                netPlusStatus = false;
            }
        }

        output.additionalWTCCPrompt();
        additionalWTCC = keyboard.next();

        output.apExamsPrompt();
        apExams = keyboard.next();

        output.universityPrompt();
        university = keyboard.next();
    }

    private void loadCoreCourses() {
        switch (programArea)) {
            case "1":
                user.addCourse(new Course("BIO-111", "General Biology I", "Dual Enrollment", 5));
                user.addCourse(new Course("BTC-181", "Basic Laboratory Techniques", "Dual Enrollment", 5));
                user.addCourse(new Course("BIO-112", "General Biology II", "Dual Enrollment", 5));
                user.addCourse(new Course("BTC-275", "Industrial Microbiology", "Dual Enrollment", 5));
                user.addCourse(new Course("BTC-281", "Bioprocess Techniques", "Dual Enrollment", 5));
                user.addCourse(new Course("ISC-121", "Environmental Health & Safety", "Dual Enrollment", 5));
                user.addCourse(new Course("BIO-250", "Genetics", "Dual Enrollment", 5));
                user.addCourse(new Course("BTC-150", "Bioethics", "Dual Enrollment", 5));
                break;

            case "2":
                user.addCourse(new Course("CTI-110", "Web Pgm & Db Foundation", "Dual Enrollment", 5));
                user.addCourse(new Course("NOS-110", "Operating Systems Concepts", "Dual Enrollment", 5));
                user.addCourse(new Course("WEB-115", "Web Markup and Scripting", "Dual Enrollment", 5));
                if (netPlusStatus) {
                    user.addCourse(new Course("CTS-115", "Info Sys Business Concepts", "Dual Enrollment", 5));
                } else {
                    user.addCourse(new Course("CTI-120", "Network & Sec Foundation", "Dual Enrollment", 5));
                }
                user.addCourse(new Course("CSC-151", "JAVA Programming", "Dual Enrollment", 5));
                user.addCourse(new Course("DBA-120", "Database Programming I", "Dual Enrollment", 5));
                user.addCourse(new Course("CSC-251", "Advanced JAVA Programming", "Dual Enrollment", 5));
                user.addCourse(new Course("CSC-256", "Software Quality Assurance", "Dual Enrollment", 5));
                break;

            case "3":
                user.addCourse(new Course("CTI-110", "Web Pgm & Db Foundation", "Dual Enrollment", 5));
                user.addCourse(new Course("NOS-110", "Operating Systems Concepts", "Dual Enrollment", 5));
                user.addCourse(new Course("SEC-110", "Security Concepts", "Dual Enrollment", 5));
                if (netPlusStatus) {
                    user.addCourse(new Course("NOS-130", "Windows Single User", "Dual Enrollment", 5));
                } else {
                    user.addCourse(new Course("CTI-120", "Network & Sec Foundation", "Dual Enrollment", 5));
                }
                user.addCourse(new Course("NET-125", "Introduction to Networks", "Dual Enrollment", 5));
                user.addCourse(new Course("NOS-120", "Linux/UNIX Single User", "Dual Enrollment", 5));
                user.addCourse(new Course("NET-126", "Routing Basics", "Dual Enrollment", 5));
                user.addCourse(new Course("SEC-160", "Security Administration", "Dual Enrollment", 5));
                break;
        }
    }
}