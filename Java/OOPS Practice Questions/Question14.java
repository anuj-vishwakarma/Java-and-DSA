import java.util.ArrayList;
import java.util.Arrays;

/* 14. Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes.*/
 class School1{
    ArrayList<String> students = new ArrayList<>();
    ArrayList<String> teachers = new ArrayList<>();
    public static ArrayList<Class1> classes = new ArrayList<>();


    public void addStudents(String...student) {
        students.addAll(Arrays.asList(student));
    }
    public ArrayList<String> getStudents(){
        return students;
    }
    public void addTeachers(String...teacher){
        teachers.addAll(Arrays.asList(teacher));
    }
    public ArrayList<String> getTeachers(){
        return teachers;
    }
    public int getNumberOfStudents(){
        return students.size();
    }
    public int getNumberOfTeachers(){
        return teachers.size();
    }

    public void addClasses(Class1 c){
        classes.add(c);
    }
    public void removeClasses(Class1 c) {
        classes.remove(c);
    }
    public ArrayList<Class1> getClassess(){
        return classes;
    }
    public String schoolInformation(){
        return "School Information: \n"+
                "Number of students: " + getNumberOfStudents() + "\n" +
                "Number of teachers: " + getNumberOfTeachers() + "\n" +
                "Number of classes: " + classes.size() + "\n";
    }


}
class Class1 extends School1 {

    ArrayList<String> students = new ArrayList<>();
    ArrayList<Class1> classes = new ArrayList<>();
    private int period;
    private String classTeacher;
    public String subject;
    Class1(String subject, int period, String clasTeacher, String... studentName){
        this.subject = subject;
        this.period = period;
        this.classTeacher = clasTeacher;
        this.students.addAll(Arrays.asList(studentName));
    }

    @Override
    public ArrayList<String> getTeachers() {
        return super.getTeachers();
    }

    public ArrayList<Class1> getClasses() {
        return classes;
    }

    @Override
    public ArrayList<String> getStudents() {
        return students;
    }

    public int getPeriod() {
        return period;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public String getSubject() {
        return subject;
    }
}

public class Question14 {
    public static void main(String[] args) {
        School1 s= new School1();
        s.addStudents("Harsh","Ayush","Ashutosh","Kirandweep","Anuj");
        s.addTeachers("Dr. Amar Pandey", "Dr. Dheeraj Aggarwal","Dr. Vaibhav Kant Singh", "Dr. Princy Matlani");



        Class1 c1 = new Class1("Mathematics", 1,"Amar Pandey","Anuj","Kirandweep","Harsh","Ayush","Ashutosh");
        s.addClasses(c1);

        Class1 c2 = new Class1("Computer Networks",2,"Mr. Dheeraj Sir", "Anuj","Ankit","Ankush","Kirandweeep","Harsh","Ashutosh","Ayush");
        s.addClasses(c2);
        s.addClasses(c1);
        s.addClasses(c2);
        System.out.println(s.schoolInformation());
        for(Class1 x: School1.classes){
            System.out.print("Subject: " + x.getSubject() + "\n" +
                    "Period: " + x.getPeriod() + "\n" +
                    "Class Teacher: " + x.getClassTeacher() + "\n" +
                    "Student Names: " + x.getStudents() + "\n");
        }
        s.removeClasses(c1);
        System.out.println(c1.getSubject() +  " class has been removed, the updated list of classes are : ");
        for(Class1 x: School1.classes){
            System.out.print("Subject: " + x.getSubject() + "\n" +
                    "Period: " + x.getPeriod() + "\n" +
                    "Class Teacher: " + x.getClassTeacher() + "\n" +
                    "Student Names: " + x.getStudents() + "\n");
        }

    }

}
