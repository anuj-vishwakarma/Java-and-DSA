class Student{
    public int rollNo;
    public String name;
    public String course;
    public String its_height;
    public int marks1, marks2, marks3;
    public int total() {
        return marks1+marks2+marks3;
    }
    public double average (){
        return (marks1+marks2+marks3)/3.0;
    }
    public char grade() {
        if (total() >= 91)
            return 'A';
        else if (total() >= 80 && total() <= 90)
            return 'B';
        else return 'C';
    }
    public String details() {
        return "Name " + name + "\n" +  "Roll No " + rollNo + "\n" +   "Course " + course;
    }
    public String toString () {
        return its_height;
    }
}

public class Student_Challenge_OOPs {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rohan";
        s.course = "CSE";
        s.marks1 = 90;
        s.marks2 = 95;
        s.marks3 = 98;
        s.rollNo = 22027115;
        s.its_height  = "5";
        System.out.println(s.total());
        System.out.println(s.average());
        System.out.println(s.grade());
        System.out.println(s.details());
        System.out.println(s);
    }
}
