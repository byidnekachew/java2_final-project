package view;

public class ConsoleView{
    public void welcome(){
        System.out.println("Welcome to the WECIB College Transfer Tool!");
        System.out.println("This tool will help you understand what AP Classes and WTCC courses will transfer to the 4-year institution you plan to attend.");
        System.out.println("It may help if you have your College Board AP Exam Scores and WTCC transcript handy.");
    }

    public void programAreaPrompt(){
        System.out.println("What is your program area?");
        System.out.println("1 - Biotechnology");
        System.out.println("2 - Computer Programming");
        System.out.println("3 - Cybersecurity");
        System.out.println("Enter the number corresponding with your answer.");
    }

    public void netPlusPrompt(){
        System.out.println("Did you earn credit for the CompTIA Network+ Certification?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        System.out.println("Enter the number corresponding with your answer.");
    }

    public void additionalWTCCPrompt(){
        System.out.println("Did you take any 5th Period or Summer Courses?");
        System.out.println("1 - COM-120 Introduction to Interpersonal Communication");
        System.out.println("2 - CSC-120 Computing Fundamentals I");
        System.out.println("3 - ENG-111 Writing and Inquiry");
        System.out.println("4 - HUM-110 Technology and Society");
        System.out.println("5 - PSY-150 General Psychology");
        System.out.println("Enter ALL the numbers corresponding with your answer. Only enter numbers, no spaces or other characters.");
    }

    public void apExamsPrompt(){
        System.out.println("Which AP Exams did you take?");
        System.out.println("1 - AP Biology");
        System.out.println("2 - AP Calculus AB");
        System.out.println("3 - AP Calculus BC");
        System.out.println("4 - AP Computer Science A");
        System.out.println("5 - AP Computer Science Principles");
        System.out.println("6 - AP English Language & Composition");
        System.out.println("7 - AP English Literature & Composition");
        System.out.println("8 - AP Human Geography");
        System.out.println("9 - AP Physics 1: Algebra-Based");
        System.out.println("10 - AP Precalculus");
        System.out.println("11 - AP Statistics");
        System.out.println("12 - AP United States Government and Politics");
        System.out.println("13 - AP United States History");
        System.out.println("14 - AP World History: Modern");
        System.out.println("Enter ALL the numbers corresponding with your answer (regardless of your score). Only enter numbers, no spaces or other characters.");
    }

    public void apScorePrompt(String exam){
        System.out.println("Enter your score for " + exam + " Only enter a number between 1 and 5.");
    }

    public void universityPrompt(){
        System.out.println("Which university are you planning to attend?");
        System.out.println("1 - Johns Hopkins University");
        System.out.println("2 - NC A&T University");
        System.out.println("3 - NC State University");
        System.out.println("4 - Northeastern University");
        System.out.println("5 - Penn State");
        System.out.println("6 - UNC Chapel Hill");
        System.out.println("7 - UNC Charlotte");
        System.out.println("8 - UNC Greensboro");
        System.out.println("9 - Virginia Tech");
        System.out.println("Enter the number corresponding with your answer.");
    }

    public void errMessage(String inputConstraints){
        System.out.println("You made a mistake! The last question only takes " + inputConstraints + ". Please try again.");
    }
}