import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class FileHandlingDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("E:/Java and DSA/Java/Files IO Stream/");
        File file2 = new File("E:/Java and DSA/Java/Files IO Stream/BufferedDemo.java");

//        Arrays.stream(file.list()).forEach(System.out::println );
        String [] list = file.list();
        for(String element: list){
            System.out.print(file.getAbsoluteFile() + "\t\t" + element + "\n");
        }
//        file2.setReadOnly();
//        file.setWritable(true);
//        FileOutputStream fos = new FileOutputStream("E:/Java and DSA/Java/Files IO Stream/BufferedDemo.java");
        File file3 = new File("C:");
        Arrays.stream(file3.list()).forEach(System.out::println);
    }

}
