import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyContentFromOneFileToAnother {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("E:/Java and DSA/Java/File IO Stream Files/source1.txt")) {

            byte[] b = new byte[fis.available()];
            fis.read(b);
            String str = new String(b).toLowerCase();

            FileOutputStream fos = new FileOutputStream("E:/Java and DSA/Java/File IO Stream Files/source2.txt");
            fos.write(str.getBytes());
            fos.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
