import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class CopyContentFromOneFileToAnother {
    public static void main(String[] args) {
        //Copying data from file */Files/FileOutputStreamDemo.txt to new file */File/CopiedContentInNewFile.txt
        try{
            FileInputStream fis = new FileInputStream("E:/Java and DSA/Java/FIles IO Stream/Files/FileOutputStreamDemo.txt");

//            int [] b = new int[fis.available()]; // not able to do this because stream takes only int, float, and double array as input. I know I can do it by copying the byte array to an int array and then print it, it will work as far as I know. I'll try it out later.

//            Arrays.stream(b).forEach(x -> System.out.print((char) x));
            byte [] b = new byte[fis.available()];
            fis.read(b);
            FileOutputStream fos = new FileOutputStream("E:/Java and DSA/Java/FIles IO Stream/Files/CopiedContentInNewFile.txt");

            for(byte elem:b){
//                System.out.print((char) elem);
                    fos.write((String.valueOf((char)elem)).toLowerCase().getBytes());
            }
//            String s = "";
//            for(byte elem : b){
//                s += ((char)elem+"").toLowerCase();
//            }
//            fos.write(s.getBytes());
//            System.out.println(s);
            fis.close();
            fos.close();
        }
        catch (IOException e){
            System.out.println("An error occured, " + e.getMessage());
        }
    }
}
