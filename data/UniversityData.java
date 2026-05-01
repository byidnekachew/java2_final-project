package data;

import java.util.ArrayList;
import java.util.HashMap;
import model.TransferCourse;

public class UniversityData{
    public static ArrayList<HashMap<String, ArrayList<TransferCourse>>> universityEquivalences = new ArrayList<>();

    static {
        HashMap<String, ArrayList<TransferCourse>> johnsHopkins = new HashMap<>();
        universityEquivalences.add(johnsHopkins);

        HashMap<String, ArrayList<TransferCourse>> ncAT = new HashMap<>();
        ncAT.put("BIO-111", new ArrayList<>() {{ add(new TransferCourse("BIOL 101", "Concepts in Biology", 4, 3)); }});
        ncAT.put("BIO-112", new ArrayList<>() {{ add(new TransferCourse("BIOL 102", "Concepts of Biology II", 4, 3)); }});
        ncAT.put("BIO-250", new ArrayList<>() {{ add(new TransferCourse("BIOL 1XX", "Genetics in Human Affairs", 3, 3)); add(new TransferCourse("BIOL 466", "Principles of Genetics", 3, 3)); }});
        ncAT.put("ISC-121", new ArrayList<>() {{ add(new TransferCourse("OSH 201", "Introduction to OSH", 3, 3)); }});
        ncAT.put("CTI-110", new ArrayList<>() {{ add(new TransferCourse("CST 231", "Web Systems", 3, 3)); }});
        ncAT.put("CTI-120", new ArrayList<>() {{ add(new TransferCourse("CST 120T", "Network and Sec Foundation", 3, 3)); }});
        ncAT.put("CTS-115", new ArrayList<>() {{ add(new TransferCourse("MGMT 132", "Intro to Manage Informa System", 3, 3)); }});
        ncAT.put("NOS-110", new ArrayList<>() {{ add(new TransferCourse("CST 130", "Introduction to Unix Linux", 3, 3)); }});
        ncAT.put("NOS-130", new ArrayList<>() {{ add(new TransferCourse("CST 101", "Microcomputer Applications", 3, 3)); add(new TransferCourse("BUED 130T", "Windows Single User", 3, 3)); }});
        ncAT.put("WEB-115", new ArrayList<>() {{ add(new TransferCourse("GCS 115T", "Web Markup and Scripting", 3, 3)); }});
        ncAT.put("CSC-120", new ArrayList<>() {{ add(new TransferCourse("COMP 120", "Computers and Their Use", 3, 3)); }});
        ncAT.put("CSC-151", new ArrayList<>() {{ add(new TransferCourse("COMP 163", "Intro Computer Programming", 3, 3)); add(new TransferCourse("CST 240", "Applied Java Programming", 3, 3)); }});
        ncAT.put("CSC-251", new ArrayList<>() {{ add(new TransferCourse("COMP 167", "Computer Prog Design", 3, 3)); }});
        ncAT.put("CSC-256", new ArrayList<>() {{ add(new TransferCourse("CST 313", "AP Hardware and Software Sys 1", 3, 3)); }});
        ncAT.put("DBA-120", new ArrayList<>() {{ add(new TransferCourse("CST 225", "Computer Database Management", 3, 3)); }});
        ncAT.put("SEC-110", new ArrayList<>() {{ add(new TransferCourse("COMP 590", "Spec Topics in Comp Sci", 3, 3)); }});
        ncAT.put("SEC-160", new ArrayList<>() {{ add(new TransferCourse("CST 160T", "Security Administration I", 3, 3)); }});
        ncAT.put("NET-125", new ArrayList<>() {{ add(new TransferCourse("CST 329", "Computer Networking I", 3, 3)); }});
        ncAT.put("NET-126", new ArrayList<>() {{ add(new TransferCourse("CST 126T", "Routing Basics", 3, 3)); }});
        ncAT.put("NOS-120", new ArrayList<>() {{ add(new TransferCourse("CST 130", "Introduction to Unix Linux", 3, 3)); }});
        ncAT.put("COM-120", new ArrayList<>() {{ add(new TransferCourse("SPCH 250", "Speech Fundamentals", 3, 3)); }});
        ncAT.put("ENG-111", new ArrayList<>() {{ add(new TransferCourse("ENGL 100", "Ideas & Their Expressions I", 3, 3)); }});
        ncAT.put("HUM-110", new ArrayList<>() {{ add(new TransferCourse("ENGL 200", "Survey of Humanities I", 3, 3)); }});
        ncAT.put("PSY-150", new ArrayList<>() {{ add(new TransferCourse("PSYC 101", "General Psychology", 3, 3)); }});
        ncAT.put("AP-Bio", new ArrayList<>() {{ add(new TransferCourse("BIOL 100", "Biological Science", 4, 3)); }});
        ncAT.put("AP-Calc AB", new ArrayList<>() {{ add(new TransferCourse("MATH 131", "Calculus 1", 4, 3)); }});
        ncAT.put("AP-Calc BC", new ArrayList<>() {{ add(new TransferCourse("MATH 131", "Calculus 1", 4, 3)); add(new TransferCourse("MATH 132", "Calculus 2", 4, 3)); }});
        ncAT.put("AP-CSA", new ArrayList<>() {{ add(new TransferCourse("COMP 120", "Computers and Their Use", 3, 3)); add(new TransferCourse("COMP 163", "Introduction to Computer Programming", 3, 3)); }});
        ncAT.put("AP-Lang", new ArrayList<>() {{ add(new TransferCourse("ENGL 100", "Ideas & Their Expressions 1", 3, 3)); add(new TransferCourse("ENGL 101", "Ideas & Their Expressions 2", 3, 4)); }});
        ncAT.put("AP-Lit", new ArrayList<>() {{ add(new TransferCourse("ENGL 100", "Ideas & Their Expressions 1", 3, 3)); add(new TransferCourse("ENGL 101", "Ideas & Their Expressions 2", 3, 4)); }});
        ncAT.put("AP-Phys", new ArrayList<>() {{ add(new TransferCourse("PHYS 225", "College Physics 1", 3, 3)); add(new TransferCourse("PHYS 226", "College Physics 2", 3, 3)); }});
        ncAT.put("AP-Stats", new ArrayList<>() {{ add(new TransferCourse("MATH 224", "Introduction to Probability and Statistics", 3, 3)); }});
        ncAT.put("AP-Gov", new ArrayList<>() {{ add(new TransferCourse("POLI 110", "American Government and Politics", 3, 3)); }});
        ncAT.put("AP-USH", new ArrayList<>() {{ add(new TransferCourse("HIST 104", "U.S. History From 1492-1877", 3, 3)); add(new TransferCourse("HIST 105", "U.S. History Since 1877", 3, 3)); }});
        ncAT.put("AP-WH", new ArrayList<>() {{ add(new TransferCourse("HIST 206", "The World to 1400", 3, 3)); add(new TransferCourse("HIST 207", "The World Since 1400", 3, 3)); }});
        universityEquivalences.add(ncAT);

        HashMap<String, ArrayList<TransferCourse>> ncState = new HashMap<>();
        universityEquivalences.add(ncState);

        HashMap<String, ArrayList<TransferCourse>> northeastern = new HashMap<>();
        universityEquivalences.add(northeastern);

        HashMap<String, ArrayList<TransferCourse>> pennState = new HashMap<>();
        universityEquivalences.add(pennState);

        HashMap<String, ArrayList<TransferCourse>> uncChapelHill = new HashMap<>();
        universityEquivalences.add(uncChapelHill);

        HashMap<String, ArrayList<TransferCourse>> uncCharlotte = new HashMap<>();
        universityEquivalences.add(uncCharlotte);

        HashMap<String, ArrayList<TransferCourse>> uncGreensboro = new HashMap<>();
        universityEquivalences.add(uncGreensboro);

        HashMap<String, ArrayList<TransferCourse>> virginiaTech = new HashMap<>();
        universityEquivalences.add(virginiaTech);
    }

}