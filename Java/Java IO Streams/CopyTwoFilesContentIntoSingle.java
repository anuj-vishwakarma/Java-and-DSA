import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyTwoFilesContentIntoSingle {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:/Java and DSA/Java/File IO Stream Files/source1.txt");
            FileInputStream fis2 = new FileInputStream("E:/Java and DSA/Java/File IO Stream Files/Test2.txt");
            byte [] b = new byte[fis.available()];
            byte [] b2 = new byte[fis2.available()];
            fis.read(b);
            fis2.read(b2);
            String str = new String(b);
            String str2 = new String(b2);
            String concatenated = str.concat(str2);
            Scanner input = new Scanner(System.in);
            String location = input.nextLine();
            FileOutputStream fos = new FileOutputStream(location);
            fos.write(concatenated.getBytes());
            fos.close();
            fis.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
