package SerializationProblemSolution2;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class ReadingDataFromFile {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("E:\\Java and DSA\\Java\\FIles IO Stream\\SerializationProblemSolution2\\My.txt");
        DataInputStream d = new DataInputStream(fis);

        Student student = new Student();
        student.id = d.readInt();
        student.name = d.readUTF();
        student.dept = d.readUTF();
        System.out.println("Id : " + student.id);
        System.out.println("Name : "+ student.name);
        System.out.println("Department: " + student.dept);

        d.close();
        fis.close();
    }
}
