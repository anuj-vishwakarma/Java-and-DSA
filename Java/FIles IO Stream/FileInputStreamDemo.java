import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("E:/Java and DSA/Java/Files IO Stream/Files/FileOutputStreamDemo.txt")){
            byte [] b =new byte[fis.available()];
            System.out.println(b.length);
            for(byte elem: b)
                System.out.print(elem);

            fis.read(b);


//            String str = new String(b);
//            System.out.println(str);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
