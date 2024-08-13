package studentchallenge.iostreams;

import java.io.*;

public class StudentChallenge1ReadingData {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\Java and DSA\\Java\\FIles IO Stream\\studentchallenge\\iostreams\\write.txt");
            DataInputStream dis = new DataInputStream(fis);
            int x = dis.read();
            while(x!= 0){
                System.out.println(dis.readFloat());
                x--;
            }
            fis.close();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
