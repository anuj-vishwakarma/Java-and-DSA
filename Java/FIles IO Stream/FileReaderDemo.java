import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("E:/Java and DSA/Java/Files IO Stream/Files/FileOutputStreamDemo.txt");
            int x ;
            while((x = fr.read() )!= -1){
                System.out.print((char) x);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
