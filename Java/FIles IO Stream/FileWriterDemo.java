import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("E:/Java and DSA/Java/Files IO Stream/Files/FileWriter.txt");
            String str = "Anuj";
            fw.write(str);
            fw.close(); // it is mandatory, it's a good practice
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
