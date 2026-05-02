# WECIB College Transfer Tool
## Final Project || CSC-251: Advanced JAVA Programming

---

### Summary
The WECIB College Transfer Tool is a program to help WECIB students find what courses transfer to the 4-year institution they plan to attend after graduation. It houses all the information in one place so that students don't have to spend extensive amounts of time searching the web for this information.   

### How to run
**Method 1:** Github Codespaces
1. Fork this repository
2. Start a GitHub codespace for this project
3. Run the following commands:
`javac model/Course.java model/Student.java model/TransferCourse.java data/UniversityData.java view/ConsoleView.java controller/TransferController.java Main.java`   
`java Main`   

**Method 2:** Locally
1. Download this repository as a zip file
2. Unzip the files
3. Open the files in your Java Compiler of Choice
4. Run the Main.java file

### MVC Structure
Model: Contains a Student, Course, and TransferCourse class   
View: The text that prompts user for choices   
Controller: All business logic employed   

### Design Patterns
**Factory:** Utilized to create objects for each course taken at WECIB as well as their equivalent courses at a 4-year institution.   
**Iterator:** Utilized to iterate through coursesTaken by the user to then produce a credit report.   

### AI Usage Disclosure
AI was used for concept review and to format repetitive data. No AI was used in the core logic or functionality of this program.   

### Known Issues & Limitations
Certain students switched programs between their Junior and Senior years. This program currently does not accomodate for those students and their course irregularities.   
This program does not yet have a JUnit testing suite.
