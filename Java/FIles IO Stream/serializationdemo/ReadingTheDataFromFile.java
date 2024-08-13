package serializationdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class ReadingTheDataFromFile{

    public static void main(String[] args) throws Exception{

        FileInputStream fis = new FileInputStream("E:\\Java and DSA\\Java\\FIles IO Stream\\serializationdemo\\file.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student) ois.readObject();

        System.out.println(s);

        ois.close();
        fis.close();

    }
}

