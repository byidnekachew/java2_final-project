package controller;

// Dependencies imported
import java.util.Scanner; // For user input

import data.UniversityData; // Transfer course data
import model.Course; 
import model.Student; 
import model.TransferCourse; 
import view.ConsoleView;

public class TransferController{
    Scanner keyboard = new Scanner(System.in); // Creates scanner object
    private Student user = new Student(); // Creates student object for user run
    private ConsoleView output = new ConsoleView(); // Creates view object to output to users
    
    // Declares class variables
    String programArea; // User's WECIB program area of study
    Boolean netPlusStatus; // Whether or not a user has passed CompTIA Network+ exam
    String additionalWTCC; // User's input on additional WTCC classes
    String apExams; // User's input on AP Exams
    String university; // User's input on 4-year institution

    public void run(){
        output.welcome(); // Displays welcome message

        output.programAreaPrompt(); // Prompts for program area
        programArea = keyboard.next(); // Collects program area data
        // Students in IT who passed the CompTIA Net+ took an alternate, additional class
        if (programArea.equals("2") || programArea.equals("3")){
            output.netPlusPrompt();
            String netPlusResponse = keyboard.next();
            if (netPlusResponse.equals("1")){
                netPlusStatus = true;
            } else {
                netPlusStatus = false;
            }
        }
        loadProgramCourses(); // Adds program area courses to coursesTaken

        output.additionalWTCCPrompt(); // Prompts for 5th period & summer classes
        additionalWTCC = keyboard.next();
        loadAdditionalWTCC(); // Adds additional WTCC to coursesTaken

        output.apExamsPrompt(); // Prompts for AP Exams
        apExams = keyboard.next();
        loadAPExams(); // Adds APs to coursesTaken

        output.universityPrompt(); // Prompts for user's future university
        university = keyboard.next();
        user.setUniversity((Integer.parseInt(university)-1)); // Assigns id based on position in UniversityData ArrayList

        loadCreditReport(); // Displays credit awarded for the user's work
    }


    /**
     * Adds courses to coursesTaken based on program area.
     *
     * @author Biruk Yidnekachew
     * @version 1.0
    */
    private void loadProgramCourses() {
        switch(programArea) {
            case "1":
                user.addCourse(new Course("BIO-111", "General Biology I", "Dual Enrollment", getWTCCGrade("BIO-111")));
                user.addCourse(new Course("BTC-181", "Basic Laboratory Techniques", "Dual Enrollment", getWTCCGrade("BTC-181")));
                user.addCourse(new Course("BIO-112", "General Biology II", "Dual Enrollment", getWTCCGrade("BIO-112")));
                user.addCourse(new Course("BTC-275", "Industrial Microbiology", "Dual Enrollment", getWTCCGrade("BTC-275")));
                user.addCourse(new Course("BTC-281", "Bioprocess Techniques", "Dual Enrollment", getWTCCGrade("BTC-281")));
                user.addCourse(new Course("ISC-121", "Environmental Health & Safety", "Dual Enrollment", getWTCCGrade("ISC-121")));
                user.addCourse(new Course("BIO-250", "Genetics", "Dual Enrollment", getWTCCGrade("BIO-250")));
                user.addCourse(new Course("BTC-150", "Bioethics", "Dual Enrollment", getWTCCGrade("BTC-150")));
                break;

            case "2":
                user.addCourse(new Course("CTI-110", "Web Pgm & Db Foundation", "Dual Enrollment", getWTCCGrade("CTI-110")));
                user.addCourse(new Course("NOS-110", "Operating Systems Concepts", "Dual Enrollment", getWTCCGrade("NOS-110")));
                user.addCourse(new Course("WEB-115", "Web Markup and Scripting", "Dual Enrollment", getWTCCGrade("WEB-115")));
                if (netPlusStatus) {
                    user.addCourse(new Course("CTS-115", "Info Sys Business Concepts", "Dual Enrollment", getWTCCGrade("CTS-115")));
                } else {
                    user.addCourse(new Course("CTI-120", "Network & Sec Foundation", "Dual Enrollment", getWTCCGrade("CTI-120")));
                }
                user.addCourse(new Course("CSC-151", "JAVA Programming", "Dual Enrollment", getWTCCGrade("CSC-151")));
                user.addCourse(new Course("DBA-120", "Database Programming I", "Dual Enrollment", getWTCCGrade("DBA-120")));
                user.addCourse(new Course("CSC-251", "Advanced JAVA Programming", "Dual Enrollment", getWTCCGrade("CSC-251")));
                user.addCourse(new Course("CSC-256", "Software Quality Assurance", "Dual Enrollment", getWTCCGrade("CSC-256")));
                break;

            case "3":
                user.addCourse(new Course("CTI-110", "Web Pgm & Db Foundation", "Dual Enrollment", getWTCCGrade("CTI-110")));
                user.addCourse(new Course("NOS-110", "Operating Systems Concepts", "Dual Enrollment", getWTCCGrade("NOS-110")));
                user.addCourse(new Course("SEC-110", "Security Concepts", "Dual Enrollment", getWTCCGrade("SEC-110")));
                if (netPlusStatus) {
                    user.addCourse(new Course("NOS-130", "Windows Single User", "Dual Enrollment", getWTCCGrade("NOS-130")));
                } else {
                    user.addCourse(new Course("CTI-120", "Network & Sec Foundation", "Dual Enrollment", getWTCCGrade("CTI-120")));
                }
                user.addCourse(new Course("NET-125", "Introduction to Networks", "Dual Enrollment", getWTCCGrade("NET-125")));
                user.addCourse(new Course("NOS-120", "Linux/UNIX Single User", "Dual Enrollment", getWTCCGrade("NOS-120")));
                user.addCourse(new Course("NET-126", "Routing Basics", "Dual Enrollment", getWTCCGrade("NET-126")));
                user.addCourse(new Course("SEC-160", "Security Administration", "Dual Enrollment", getWTCCGrade("SEC-160")));
                break;
        }
    }

    
    /**
     * Adds courses to coursesTaken based on 5th period & summer work.
     *
     * @author Biruk Yidnekachew
     * @version 1.0
    */
    private void loadAdditionalWTCC(){
        for (int i = 0; i < additionalWTCC.length(); i++) {
            String j = String.valueOf(additionalWTCC.charAt(i));
            switch(j){
                case "1":
                    user.addCourse(new Course("COM-120", "Introduction to Interpersonal Communication", "Dual Enrollment", getWTCCGrade("COM-120")));
                    break;
                case "2":
                    user.addCourse(new Course("CSC-120", "Computing Fundamentals I", "Dual Enrollment", getWTCCGrade("CSC-120")));
                    break;
                case "3":
                    user.addCourse(new Course("ENG-111", "Writing and Inquiry", "Dual Enrollment", getWTCCGrade("ENG-111")));
                    break;
                case "4":
                    user.addCourse(new Course("HUM-110", "Technology and Society", "Dual Enrollment", getWTCCGrade("HUM-110")));
                    break;
                case "5":
                    user.addCourse(new Course("PSY-150", "General Psychology", "Dual Enrollment", getWTCCGrade("PSY-150")));
                    break;
            }
        }
    }

    /**
     * Helper method to assign a score to WTCC courses taken.
     *
     * @author Biruk Yidnekachew
     * @version 1.0
     * @param String courseName
     * @return User's grade input
    */
    private int getWTCCGrade(String courseName){
        output.wtccGradePrompt(courseName); // Calls prompt for grade
        return keyboard.nextInt();
    }


    /**
     * Adds courses to coursesTaken based on AP exams taken.
     *
     * @author Biruk Yidnekachew
     * @version 1.0
    */
    private void loadAPExams(){
        for (int i = 0; i < apExams.length(); i += 2) {
            String j = apExams.substring(i, i + 2);
            switch(j) {
                case "01":
                    user.addCourse(new Course("AP-Bio", "AP Biology", "AP", getAPScore("AP Biology")));
                    break;
                case "02":
                    user.addCourse(new Course("AP-Calc AB", "AP Calculus AB", "AP", getAPScore("AP Calculus AB")));
                    break;
                case "03":
                    user.addCourse(new Course("AP-Calc BC", "AP Calculus BC", "AP", getAPScore("AP Calculus BC")));
                    break;
                case "04":
                    user.addCourse(new Course("AP-CSA", "AP Computer Science A", "AP", getAPScore("AP Computer Science A")));
                    break;
                case "05":
                    user.addCourse(new Course("AP-CSP", "AP Computer Science Principles", "AP", getAPScore("AP Computer Science Principles")));
                    break;
                case "06":
                    user.addCourse(new Course("AP-Lang", "AP English Language & Composition", "AP", getAPScore("AP English Language & Composition")));
                    break;
                case "07":
                    user.addCourse(new Course("AP-Lit", "AP English Literature & Composition", "AP", getAPScore("AP English Literature & Composition")));
                    break;
                case "08":
                    user.addCourse(new Course("AP-HUG", "AP Human Geography", "AP", getAPScore("AP Human Geography")));
                    break;
                case "09":
                    user.addCourse(new Course("AP-Phys", "AP Physics 1: Algebra-Based", "AP", getAPScore("AP Physics 1: Algebra-Based")));
                    break;
                case "10":
                    user.addCourse(new Course("AP-Precalc", "AP Precalculus", "AP", getAPScore("AP Precalculus")));
                    break;
                case "11":
                    user.addCourse(new Course("AP-Stats", "AP Statistics", "AP", getAPScore("AP Statistics")));
                    break;
                case "12":
                    user.addCourse(new Course("AP-Gov", "AP United States Government and Politics", "AP", getAPScore("AP United States Government and Politics")));
                    break;
                case "13":
                    user.addCourse(new Course("AP-USH", "AP United States History", "AP", getAPScore("AP United States History")));
                    break;
                case "14":
                    user.addCourse(new Course("AP-WH", "AP World History: Modern", "AP", getAPScore("AP World History: Modern")));
                    break;
            }
        }
    }

    /**
     * Helper method to assign a score to AP Exams taken.
     *
     * @author Biruk Yidnekachew
     * @version 1.0
     * @param String examName
     * @return User's score input
    */
    private int getAPScore(String examName){
        output.apScorePrompt(examName);
        return keyboard.nextInt();
    }


    /**
     * Iterates through coursesTaken to display the final credit report.
     *
     * @author Biruk Yidnekachew
     * @version 1.0
    */
    private void loadCreditReport() {
        // Iterates through coursesTaken
        for(Course c : user.getCoursesTaken()){
            // If a given course has an equivalent at the university
            if(UniversityData.universityEquivalences.get(user.getUniversity()).containsKey(c.getCourseCode())){
                // Iterates through list of possible equivalencies
                for(TransferCourse tc : UniversityData.universityEquivalences.get(user.getUniversity()).get(c.getCourseCode())){
                    // If user score is at or better than required score
                    if(c.getScore() >= tc.getScoreRequired()){
                        // Adds a line to the final credit report
                        output.displayTransferEquivalence(c.getCourseName(), tc.getCourseCode(), tc.getCourseName(), tc.getCreditHrs());
                    }
                }
            }
        }
    }
}