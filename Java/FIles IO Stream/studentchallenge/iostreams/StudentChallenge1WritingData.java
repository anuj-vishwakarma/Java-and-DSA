
package studentchallenge.iostreams;

import java.io.*;

public class StudentChallenge1WritingData {
    public static void main(String[] args) {
        float [] list = {10.4f, 43.33f, 67.8f ,5f, 23.5f};
        try {
            FileOutputStream fos = new FileOutputStream("E:\\Java and DSA\\Java\\FIles IO Stream\\studentchallenge\\iostreams\\write.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.write(list.length);

            for(float element : list){
                dos.writeFloat(element);
            }


            fos.close();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}
