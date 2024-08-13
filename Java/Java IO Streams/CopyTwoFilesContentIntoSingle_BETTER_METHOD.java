import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Scanner;

public class CopyTwoFilesContentIntoSingle_BETTER_METHOD {
    public static void main(String[] args) {
        try{
            // without try with resources so, we'll need to clos the resources explicitly.
            FileInputStream fis = new FileInputStream("E:/Java and DSA/Java/File IO Stream Files/hoi.txt");
            FileInputStream fis2 = new FileInputStream("E:/Java and DSA/Java/File IO Stream Files/Test.txt");
            byte [] b = new byte[fis.available()];
            fis.read(b);

            String str = new String(b);
//            System.out.println(str);
            b = str.getBytes();
            Scanner input = new Scanner(System.in);
            String destination = input.nextLine();

            FileOutputStream fos = new FileOutputStream(destination);
            SequenceInputStream sequenceInputStream = new SequenceInputStream(fis, fis2);
            byte [] sb = new byte[sequenceInputStream.available()];

            fos.write(sb);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
