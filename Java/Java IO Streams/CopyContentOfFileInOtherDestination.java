import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyContentOfFileInOtherDestination {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("E:/Java and DSA/Java/File IO Stream Files/source1.txt")){
            byte [] b = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            Scanner input = new Scanner(System.in);
            String location = input.nextLine();
            FileOutputStream fos = new FileOutputStream(location);
            fos.write(str.getBytes());
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
