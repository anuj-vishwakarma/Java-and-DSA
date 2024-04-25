class Subject {
    private String subjectID;
    private String name;
    private int maxMarks;
    private int marksObtained;
    Subject (String s, String n, int mm) {
        subjectID = s;
        name = n;
        maxMarks = mm;
    }
    Subject () {
        subjectID = "CSUCT23";
        name = "NOBITA";
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public String getName() {
        return name;
    }

    public void setMaxMarks(int mMarks) {
        maxMarks = mMarks;
    }

    public void setMarksObtained(int marks) {
        marksObtained = marks;
    }
    public  String getDetails() {
        return
                "Name: " + getName() + "\n" +
                "Subject ID: " + getSubjectID() + "\n" +
                "Maximum Marks: " + getMaxMarks() + "\n" +
                "Marks Obtained: " + getMarksObtained();
    }
    public String toString () {
            return
                    "Name: " + getName() + "\n" +
                            "Subject ID: " + getSubjectID() + "\n" +
                            "Maximum Marks: " + getMaxMarks() + "\n" +
                            "Marks Obtained: " + getMarksObtained();
        }
}
class Students{
    private int rollNumber;
    private String name;
    private String department;
    private String subject;
    Students (int rollNo, String n, String d) {
        this.name = n;
        this.department = d;
        this.rollNumber = rollNo;
    }
    public String toString() {
        return
                "Name: " + getName() + "\n" +
                "Roll Number: " + getRollNumber() + "\n" +
                "Department: " + getDepartment();
    }
    public void setSubjects(String subject) {
        this.subject = subject;
    }

    public String getSubjects() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getDepartment() {
        return department;
    }

}
public class Arrays_of_Object_Challenge {
    public static void main(String[] args) {

        Subject [] subs = new Subject[3];
        subs[0] = new Subject("s101", "DS", 100);
        subs[1] = new Subject("s102", "Algorithms", 100);
        subs[2] = new Subject("s103", "Operating Systems", 100);
        subs[0].setMarksObtained(99);
        subs[1].setMarksObtained(98);
        subs[2].setMarksObtained(99);

        for(Subject s: subs)
            System.out.println(s + "\n");

        Students [] students = new Students[3];
        students[0] = new Students(220121, "DS", "100");
        students[1] = new Students(32432, "Algorithms", "fafd");
        students[2] = new Students(32433, "Operating Systems", "fad");

        students[0].setSubjects("OS");
        students[1].setSubjects("DSA");
        students[2].setSubjects("Algorithms");

        for(Students s: students)
            System.out.println(s + "\n");
    }
}
