package SerializationProblemSolution1;

import java.io.*;
class Student {
    String name;
    int id;
    String dept;
}
public class WritingTheDataOnFile {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("E:/Java and DSA/Java/Files IO Stream/Files/My.txt");
        PrintStream ps = new PrintStream(fos);
        Student student = new Student();
        student.name="John";
        student.id = 3;
        student.dept = "CSE";
        ps.println(student.id);// println with integer argument is called
        ps.println(student.name);
        ps.println(student.dept);
        ps.close();
        fos.close();
    }
}

