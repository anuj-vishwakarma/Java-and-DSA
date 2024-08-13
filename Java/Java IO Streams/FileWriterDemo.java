import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
    try(FileWriter fw = new FileWriter("E:/Java and DSA/Java/File IO Stream files/Test3.txt")){
         String str = "Using FileWriter";
         fw.write(str);
         fw.close();
    }
    catch (IOException e){
        System.out.println(e);
    }
    }
}
