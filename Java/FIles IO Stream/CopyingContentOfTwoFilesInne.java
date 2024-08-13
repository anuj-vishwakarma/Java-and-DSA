import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class CopyingContentOfTwoFilesInne {
    public static void main(String[] args) {
        // two files
        try {
            FileInputStream fis1 = new FileInputStream("E:/Java and DSA/Java/Files IO Stream/Files/FileWriter.txt");
            FileInputStream fis2 = new FileInputStream("E:/Java and DSA/Java/Files IO Stream/Files/FileOutputStreamDemo.txt");
            FileOutputStream destination = new FileOutputStream("E:/Java and DSA/Java/Files IO Stream/Files/Destination.txt");
            SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
//            for ( byte elem : (sis.readAllBytes())){
//                destination.write((char) elem);
//            }
//            OR
            int b ;
            while( ( b = sis.read()) != -1)
                destination.write(b);
            fis1.close();
            fis2.close();
        } catch (IOException e) {
            System.out.println("An error occured, " + e.getMessage());
        }
    }
}
