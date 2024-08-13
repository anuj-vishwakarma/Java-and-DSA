import javax.swing.*;
import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("E:/Java and DSA/Java/File IO Stream files/Test2.txt")){

            int x ;



//            System.out.println(x);
            while((x = fr.read()) != -1){
                System.out.print((char)x);

            }

        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
