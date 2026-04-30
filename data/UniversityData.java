package data;

import java.util.ArrayList;
import java.util.HashMap;
import model.TransferCourse;

public class UniversityData{
    public static ArrayList<HashMap<String, TransferCourse>> universityEquivalences = new ArrayList<>();

    static {
        HashMap<String, TransferCourse> johnsHopkins = new HashMap<>();
        universityEquivalences.add(johnsHopkins);

        HashMap<String, TransferCourse> ncAT = new HashMap<>();
        universityEquivalences.add(ncAT);

        HashMap<String, TransferCourse> ncState = new HashMap<>();
        universityEquivalences.add(ncState);

        HashMap<String, TransferCourse> northeastern = new HashMap<>();
        universityEquivalences.add(northeastern);

        HashMap<String, TransferCourse> pennState = new HashMap<>();
        universityEquivalences.add(pennState);

        HashMap<String, TransferCourse> uncChapelHill = new HashMap<>();
        universityEquivalences.add(uncChapelHill);

        HashMap<String, TransferCourse> uncCharlotte = new HashMap<>();
        universityEquivalences.add(uncCharlotte);

        HashMap<String, TransferCourse> uncGreensboro = new HashMap<>();
        universityEquivalences.add(uncGreensboro);

        HashMap<String, TransferCourse> virginiaTech = new HashMap<>();
        universityEquivalences.add(virginiaTech);

        // Fake University (placeholder)
    HashMap<String, TransferCourse> fakeUniversity = new HashMap<>();
    fakeUniversity.put("BIO-111", new TransferCourse("BIO-101", "Intro to Biology", 4));
    fakeUniversity.put("BTC-181", new TransferCourse("BTC-101", "Lab Techniques", 3));
    fakeUniversity.put("BIO-112", new TransferCourse("BIO-102", "Biology II", 4));
    fakeUniversity.put("BTC-275", new TransferCourse("BTC-201", "Microbiology", 3));
    fakeUniversity.put("BTC-281", new TransferCourse("BTC-202", "Bioprocess", 3));
    fakeUniversity.put("ISC-121", new TransferCourse("ISC-101", "Environmental Health", 3));
    fakeUniversity.put("BIO-250", new TransferCourse("BIO-301", "Genetics", 3));
    fakeUniversity.put("BTC-150", new TransferCourse("BTC-101", "Bioethics", 3));
    fakeUniversity.put("CTI-110", new TransferCourse("CTI-101", "Web Foundations", 3));
    fakeUniversity.put("NOS-110", new TransferCourse("NOS-101", "Operating Systems", 3));
    fakeUniversity.put("WEB-115", new TransferCourse("WEB-101", "Web Scripting", 3));
    fakeUniversity.put("CTI-120", new TransferCourse("CTI-102", "Networking", 3));
    fakeUniversity.put("CTS-115", new TransferCourse("CTS-101", "Business Concepts", 3));
    fakeUniversity.put("CSC-151", new TransferCourse("CSC-101", "Java Programming", 3));
    fakeUniversity.put("DBA-120", new TransferCourse("DBA-101", "Database Programming", 3));
    fakeUniversity.put("CSC-251", new TransferCourse("CSC-201", "Advanced Java", 3));
    fakeUniversity.put("CSC-256", new TransferCourse("CSC-202", "Software QA", 3));
    fakeUniversity.put("SEC-110", new TransferCourse("SEC-101", "Security Concepts", 3));
    fakeUniversity.put("NOS-130", new TransferCourse("NOS-102", "Windows", 3));
    fakeUniversity.put("NET-125", new TransferCourse("NET-101", "Intro to Networks", 3));
    fakeUniversity.put("NOS-120", new TransferCourse("NOS-103", "Linux", 3));
    fakeUniversity.put("NET-126", new TransferCourse("NET-102", "Routing", 3));
    fakeUniversity.put("SEC-160", new TransferCourse("SEC-102", "Security Admin", 3));
    fakeUniversity.put("COM-120", new TransferCourse("COM-101", "Interpersonal Comm", 3));
    fakeUniversity.put("CSC-120", new TransferCourse("CSC-100", "Computing Fundamentals", 3));
    fakeUniversity.put("ENG-111", new TransferCourse("ENG-101", "Writing and Inquiry", 3));
    fakeUniversity.put("HUM-110", new TransferCourse("HUM-101", "Technology and Society", 3));
    fakeUniversity.put("PSY-150", new TransferCourse("PSY-101", "General Psychology", 3));
    fakeUniversity.put("AP-Bio", new TransferCourse("BIO-110", "AP Biology", 4));
    fakeUniversity.put("AP-Calc AB", new TransferCourse("MAT-111", "Calculus AB", 4));
    fakeUniversity.put("AP-Calc BC", new TransferCourse("MAT-112", "Calculus BC", 4));
    fakeUniversity.put("AP-CSA", new TransferCourse("CSC-110", "AP CS A", 3));
    fakeUniversity.put("AP-CSP", new TransferCourse("CSC-111", "AP CS Principles", 3));
    fakeUniversity.put("AP-Lang", new TransferCourse("ENG-110", "AP English Lang", 3));
    fakeUniversity.put("AP-Lit", new TransferCourse("ENG-111", "AP English Lit", 3));
    fakeUniversity.put("AP-HUG", new TransferCourse("GEO-101", "Human Geography", 3));
    fakeUniversity.put("AP-Phys", new TransferCourse("PHY-101", "AP Physics", 4));
    fakeUniversity.put("AP-Precalc", new TransferCourse("MAT-110", "Precalculus", 3));
    fakeUniversity.put("AP-Stats", new TransferCourse("MAT-152", "Statistics", 3));
    fakeUniversity.put("AP-Gov", new TransferCourse("POL-101", "US Government", 3));
    fakeUniversity.put("AP-USH", new TransferCourse("HIS-111", "US History", 3));
    fakeUniversity.put("AP-WH", new TransferCourse("HIS-112", "World History", 3));
    universityEquivalences.add(fakeUniversity);
    }
}