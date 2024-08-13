import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("E:/Java and DSA/Java/File IO Stream files/Test2.txt")){
             byte [] b = new byte[fis.available()];

//             fis.read(b);
//             String str = new String(b);
//             System.out.println(str);
             int x ;
             while((x = fis.read()) != -1){
                 System.out.print((char)x);
             }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
