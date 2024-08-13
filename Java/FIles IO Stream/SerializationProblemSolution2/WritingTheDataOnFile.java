package SerializationProblemSolution2;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    String name;
    int id;
    String dept;
}
public class WritingTheDataOnFile {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("E:\\Java and DSA\\Java\\FIles IO Stream\\SerializationProblemSolution2\\My.txt");
        DataOutputStream d = new DataOutputStream(fos);

        Student student = new Student();
        student.id = 32;
        student.name = "John";
        student.dept = "CSE";

        d.writeInt(student.id);
        d.writeUTF(student.name);
        d.writeUTF(student.dept);

        d.close();
        fos.close();
    }
}
