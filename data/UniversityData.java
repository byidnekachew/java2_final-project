package data;


// Dependencies imported
import java.util.ArrayList; // For when a WECIB course has multiple equivalencies
import java.util.HashMap; // Holds both WECIB course & transfer course
import model.TransferCourse; // To create TransferCourse objects

/**
 * Hosts all data for which courses at WECIB transfer to which courses at a given university.
 *
 * @author Biruk Yidnekachew
 * @version 1.0
*/
public class UniversityData{
    /* Creates ArrayList to host HashMaps for each university. HashMaps have string for WECIB course 
     * code and ArrayLists for each transfer equivalency */
    public static ArrayList<HashMap<String, ArrayList<TransferCourse>>> universityEquivalences = new ArrayList<>();

    static {
        // Johns Hopkins University equivalencies 
        HashMap<String, ArrayList<TransferCourse>> johnsHopkins = new HashMap<>(); // Creates HashMap
        // Adds course equivalencies to HashMap

        universityEquivalences.add(johnsHopkins); // Adds university to ArrayList

        // NC A&T
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

        // NC State
        HashMap<String, ArrayList<TransferCourse>> ncState = new HashMap<>();
        ncState.put("BIO-111", new ArrayList<>() {{ add(new TransferCourse("BIO 183", "Introductory Biology: Cellular and Molecular Biology", 4, 3)); }});
        ncState.put("BIO-112", new ArrayList<>() {{ add(new TransferCourse("BIO 181", "Introductory Biology: Ecology, Evolution, and Biodiversity", 4, 3)); }});
        ncState.put("CSC-120", new ArrayList<>() {{ add(new TransferCourse("CSC 1XX", "Introduction to Computing and Data Science", 3, 3)); }});
        ncState.put("CSC-151", new ArrayList<>() {{ add(new TransferCourse("CSC 1XX", "Introduction to Computing and Data Science", 3, 3)); }});
        ncState.put("COM-120", new ArrayList<>() {{ add(new TransferCourse("COM 112", "Interpersonal Communication", 3, 3)); }});
        ncState.put("ENG-111", new ArrayList<>() {{ add(new TransferCourse("ENG 101", "Academic Writing and Research", 3, 3)); }});
        ncState.put("HUM-110", new ArrayList<>() {{ add(new TransferCourse("ANT 261", "Technology in Society and Culture", 3, 3)); }});
        ncState.put("PSY-150", new ArrayList<>() {{ add(new TransferCourse("PSY 200", "Introduction to Psychology", 3, 3)); }});
        ncState.put("AP-Bio", new ArrayList<>() {{ add(new TransferCourse("BIO 105", "Biology in the Modern World", 3, 3)); add(new TransferCourse("BIO 106", "Biology in the Modern World Laboratory", 1, 3)); }});
        ncState.put("AP-Calc AB", new ArrayList<>() {{ add(new TransferCourse("MA 121", "Elements of Calculus", 3, 3)); add(new TransferCourse("MA 141", "Calculus I", 4, 4)); }});
        ncState.put("AP-Calc BC", new ArrayList<>() {{ add(new TransferCourse("MA 141", "Calculus I", 4, 3)); add(new TransferCourse("MA 241", "Calculus II", 4, 4)); }});
        ncState.put("AP-CSA", new ArrayList<>() {{ add(new TransferCourse("CSC 116", "Introduction to Computing - Java", 3, 4)); add(new TransferCourse("CSC 110", "Computer Science Principles - The Beauty and Joy of Computing", 3, 3)); }});
        ncState.put("AP-CSP", new ArrayList<>() {{ add(new TransferCourse("CSC 110", "Computer Science Principles - The Beauty and Joy of Computing", 3, 3)); }});
        ncState.put("AP-Lang", new ArrayList<>() {{ add(new TransferCourse("ENG 100", "Reading and Writing Rhetorically", 4, 3)); add(new TransferCourse("ENG 101", "Academic Writing and Research", 4, 5)); }});
        ncState.put("AP-Lit", new ArrayList<>() {{ add(new TransferCourse("ENG 208", "Studies in Fiction", 3, 3)); }});
        ncState.put("AP-HUG", new ArrayList<>() {{ add(new TransferCourse("SS 2XX", "Social Sciences 200-level GEP", 3, 3)); }});
        ncState.put("AP-Phys", new ArrayList<>() {{ add(new TransferCourse("PY 131", "Conceptual Physics", 4, 3)); add(new TransferCourse("PY 211", "College Physics I", 4, 4)); }});
        ncState.put("AP-Precalc", new ArrayList<>() {{ add(new TransferCourse("MA 111", "Precalculus Algebra and Trigonometry", 3, 3)); }});
        ncState.put("AP-Stats", new ArrayList<>() {{ add(new TransferCourse("ST 311", "Introduction to Statistics", 3, 3)); }});
        ncState.put("AP-Gov", new ArrayList<>() {{ add(new TransferCourse("GENR 2XX", "General Elective", 3, 3)); add(new TransferCourse("PS 201", "American Politics and Government", 3, 4)); }});
        ncState.put("AP-USH", new ArrayList<>() {{ add(new TransferCourse("HI 253", "Early U.S. History", 3, 3)); add(new TransferCourse("HI 254", "Modern U.S. History", 3, 5)); }});
        ncState.put("AP-WH", new ArrayList<>() {{ add(new TransferCourse("HI 233", "The World Since 1750", 3, 3)); add(new TransferCourse("HI 232", "The World from 1200 to 1750", 3, 5)); }});
        universityEquivalences.add(ncState);

        // Northeastern
        HashMap<String, ArrayList<TransferCourse>> northeastern = new HashMap<>();
        universityEquivalences.add(northeastern);

        // Penn State
        HashMap<String, ArrayList<TransferCourse>> pennState = new HashMap<>();
        universityEquivalences.add(pennState);

        // UNC Chapel Hill
        HashMap<String, ArrayList<TransferCourse>> uncChapelHill = new HashMap<>();
        uncChapelHill.put("BIO-111", new ArrayList<>() {{ add(new TransferCourse("BIOL 101", "Principles of Biology", 3, 3)); add(new TransferCourse("BIOL 101L", "Introductory Biology Laboratory", 1, 3)); add(new TransferCourse("BIOL 103", "How Cells Function", 3, 3));}});
        uncChapelHill.put("BIO-112", new ArrayList<>() {{ add(new TransferCourse("BIOL 104", "Biodiversity", 3, 3)); add(new TransferCourse("BIOL 190L", "Laboratory in Special Topics in Biology at an Introductory Level", 1, 3));  }});
        uncChapelHill.put("BIO-250", new ArrayList<>() {{ add(new TransferCourse("BIOL 202", "Molecular Biology and Genetics", 4, 3)); add(new TransferCourse("BIOL 220", "Molecular Genetics", 3, 3)); }});
        uncChapelHill.put("CTI-110", new ArrayList<>() {{ add(new TransferCourse("COMP 126", "Practical Web Design and Development for Everyone", 3, 3)); }});
        uncChapelHill.put("CTS-115", new ArrayList<>() {{ add(new TransferCourse("COMP XXX", "General Elective", 3, 3)); }});  
        uncChapelHill.put("WEB-115", new ArrayList<>() {{ add(new TransferCourse("INLS 572", "Web Development I", 3, 3)); }});
        uncChapelHill.put("CSC-120", new ArrayList<>() {{ add(new TransferCourse("COMP XXX", "General Elective", 3, 3)); }});  
        uncChapelHill.put("CSC-151", new ArrayList<>() {{ add(new TransferCourse("COMP 110", "Introduction to Programming and Data Science", 3, 3)); }});
        uncChapelHill.put("CSC-251", new ArrayList<>() {{ add(new TransferCourse("COMP 110", "Introduction to Programming and Data Science", 3, 3)); }});
        uncChapelHill.put("COM-120", new ArrayList<>() {{ add(new TransferCourse("COMM 120", "Introduction to Interpersonal and Organizational Communication", 3, 3)); }});
        uncChapelHill.put("ENG-111", new ArrayList<>() {{ add(new TransferCourse("ENGL 100", "Basic Writing", 3, 3)); }});
        uncChapelHill.put("HUM-110", new ArrayList<>() {{ add(new TransferCourse("GENR XXX", "General Elective", 3, 3)); }});  
        uncChapelHill.put("PSY-150", new ArrayList<>() {{ add(new TransferCourse("PSYC 101", "General Psychology", 3, 3)); }});  
        uncChapelHill.put("AP-Bio", new ArrayList<>() {{ add(new TransferCourse("BIOL 101", "Principles of Biology", 3, 3)); add(new TransferCourse("BIOL 101L", "Introductory Biology Laboratory", 1, 3)); }});
        uncChapelHill.put("AP-Calc AB", new ArrayList<>() {{ add(new TransferCourse("MATH 231", "Calculus of Functions of One Variable I", 4, 3)); }});
        uncChapelHill.put("AP-Calc BC", new ArrayList<>() {{ add(new TransferCourse("MATH 231", "Calculus of Functions of One Variable I", 4, 3)); add(new TransferCourse("MATH 232", "Calculus of Functions of One Variable II", 4, 3)); }});
        uncChapelHill.put("AP-CSA", new ArrayList<>() {{ add(new TransferCourse("COMP XXX", "General Elective", 3, 3)); add(new TransferCourse("COMP 110", "Introduction to Programming and Data Science", 3, 5)); }});
        uncChapelHill.put("AP-Lang", new ArrayList<>() {{ add(new TransferCourse("ENGL XXX", "General Elective", 3, 3)); }});
        uncChapelHill.put("AP-Lit", new ArrayList<>() {{ add(new TransferCourse("ENGL XXX", "General Elective", 3, 3)); add(new TransferCourse("ENGL 190", "Exploring Topics in English Studies", 3, 5)); }});
        uncChapelHill.put("AP-HUG", new ArrayList<>() {{ add(new TransferCourse("GEOG 120", "World Regional Geography", 3, 3)); }});
        uncChapelHill.put("AP-Phys", new ArrayList<>() {{ add(new TransferCourse("PHYS XXX", "General Elective", 3, 3)); add(new TransferCourse("PHYS 114", "General Physics I: For Students of the Life Sciences", 4, 4)); }});
        uncChapelHill.put("AP-Stats", new ArrayList<>() {{ add(new TransferCourse("STOR 151", "Introduction to Data Analysis", 3, 3)); add(new TransferCourse("STOR 155", "Introduction to Data Models and Inference", 3, 4)); }});
        uncChapelHill.put("AP-Gov", new ArrayList<>() {{ add(new TransferCourse("POLI XXX", "General Elective", 3, 3)); add(new TransferCourse("POLI 100", "American Democracy in Changing Times", 3, 4)); }});
        uncChapelHill.put("AP-USH", new ArrayList<>() {{ add(new TransferCourse("HIST 102", "Introduction to Major Problems in U.S History", 3, 3)); }});
        uncChapelHill.put("AP-WH", new ArrayList<>() {{ add(new TransferCourse("HIST 103", "Introduction to Major Problems in Modern World History", 3, 3)); }});
        uncChapelHill.put("AP-Precalc", new ArrayList<>() {{ add(new TransferCourse("MATH 110P", "Precalculus Mathematics", 0, 3)); }});
        universityEquivalences.add(uncChapelHill);

        // UNC Charlotte
        HashMap<String, ArrayList<TransferCourse>> uncCharlotte = new HashMap<>();
        universityEquivalences.add(uncCharlotte);

        // UNC Greensboro
        HashMap<String, ArrayList<TransferCourse>> uncGreensboro = new HashMap<>();
        universityEquivalences.add(uncGreensboro);

        // Virginia Tech
        HashMap<String, ArrayList<TransferCourse>> virginiaTech = new HashMap<>();
        universityEquivalences.add(virginiaTech);
    }

}