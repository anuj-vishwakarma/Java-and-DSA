import java.util.ArrayList;

class School{
    /**
     * Number of teachers
     * Number of Students
     * Number of classes
     */
    private String schoolName;
    private ArrayList<Students> students = new ArrayList<>();
    private ArrayList<Teachers> teachers = new ArrayList<>();
    private ArrayList<Class> classes = new ArrayList<>();
    public void removeStudent(Students student){
        this.students.remove(student);
    }
    School(String schoolName){
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void addTeacher(Teachers teacher){
        this.teachers.add(teacher);
    }

    public void addStudent(Students student) {
        this.students.add(student);
    }
    public void addClass(Class c){
        this.classes.add(c);
    }
    public String getSchoolInformation(){
        return
                "School Name: " + getSchoolName() + "\n" +
                "Number of Students: " + students.size() + "\n" +
                "Number of Teachers: " + teachers.size() + "\n" +
                "Number of Classes: " + classes.size() + "\n";
    }

}
class Students{
    private int age;
    private String name;

    Students(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getStudentName() {
        return name;
    }

    public int getStudentAge() {
        return age;
    }
    public String getStudentsInformation(){
        return
                        "Name: " + getStudentName() + "\n" +
                        "Age: " + getStudentAge() + "\n";
    }
}
class Teachers{
    private String name;
    private String subject;


    Teachers(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getSubjectName() {
        return subject;
    }

    public String getTeacherName() {
        return name;
    }
}
class Class {
    private int period;
    private String subject;
    private Teachers teacher;
    private ArrayList<Students> students = new ArrayList<>();
    public String getTeacherName(){
        return teacher.getTeacherName();
    }
    public int getNumberOfStudents(){
        return students.size();
    }

    public void addStudentsInClass(Students student) {
        this.students.add(student);
    }
    Class(String subject, int period, Teachers teacher){
        this.subject = subject;
        this.period = period;
        this.teacher = teacher;
    }
    public String getSubjectName() {
        return subject;
    }

    public int getPeriodNumber() {
        return period;
    }
    public String getClassInformation(){
        return
                        "Name: " + getSubjectName() + "\n" +
                        "Age: " + getPeriodNumber() + "\n";
    }
}

public class Question14_EfficientWay {
    public static void main(String[] args) {
        School school = new School("St. Mary's School");

        Students student1 = new Students("Shizuka", 8);
        Students student2 = new Students("Nobita", 8);
        Students student3 = new Students("Gian",9);
        Students student4 = new Students("Sunio",7);

            school.addStudent(student1);
            school.addStudent(student2);
            school.addStudent(student3);
            school.addStudent(student4);

        Teachers teacher1 = new Teachers("Jackie Chan","Martial Arts");
        Teachers teacher2 = new Teachers("Angela Moss","Law");
        Teachers teacher3 = new Teachers("Eddie Moon","Dance");

            school.addTeacher(teacher1);
            school.addTeacher(teacher2);
            school.addTeacher(teacher3);

        Class danceClass = new Class("Dance",1,teacher3);

            danceClass.addStudentsInClass(student1);
            danceClass.addStudentsInClass(student2);
            danceClass.addStudentsInClass(student3);
            danceClass.addStudentsInClass(student4);

        Class lawClass = new Class("Law", 3,teacher3);
            lawClass.addStudentsInClass(student1);
            lawClass.addStudentsInClass(student2);
            lawClass.addStudentsInClass(student3);
            lawClass.addStudentsInClass(student4);

        Class martialArtsClass= new Class("Martial Arts", 2,teacher1);
            martialArtsClass.addStudentsInClass(student1);
            martialArtsClass.addStudentsInClass(student2);
            martialArtsClass.addStudentsInClass(student3);
//            martialArtsClass.addStudentsInClass(student4);

        school.addClass(danceClass);
        school.addClass(lawClass);
        school.addClass(martialArtsClass);

        System.out.println("Dance class Information: ");
        System.out.println("Class Name: " + danceClass.getSubjectName());
        System.out.println("Teacher: " + danceClass.getTeacherName());
        System.out.println("Number of Students: " + danceClass.getNumberOfStudents());
        System.out.println();

        System.out.println("Martial Arts class Information: ");
        System.out.println("Class Name: " + martialArtsClass.getSubjectName());
        System.out.println("Teacher: " + martialArtsClass.getTeacherName());
        System.out.println("Number of Students: " + martialArtsClass.getNumberOfStudents());
        System.out.println();

        System.out.println();

        System.out.println("Law class Information: ");
        System.out.println("Class Name: " + lawClass.getSubjectName());
        System.out.println("Teacher: " + lawClass.getTeacherName());
        System.out.println("Number of Students: " + lawClass.getNumberOfStudents());
        System.out.println();
        System.out.println();

        school.removeStudent(student1);
        school.removeStudent(student2);

        System.out.println(school.getSchoolInformation());
    }
}
