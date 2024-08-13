package serializationdemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadingTheDataFromFileKeepingTransient {
    public static void main(String[] args) throws Exception{

        FileInputStream fis = new FileInputStream("E:\\Java and DSA\\Java\\FIles IO Stream\\serializationdemo\\fileKeepingTransient.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Student1 s = (Student1) ois.readObject();

        System.out.println(s);

        ois.close();
        fis.close();

    }
}
