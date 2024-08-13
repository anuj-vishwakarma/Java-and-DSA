import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("E:/Java and DSA/Java/File IO Stream files/Test.txt");
//          This can be converted into try with resources because in try with resources we don't need to explicitly close the resources and the chances of programming utilizing a resources decreases.

            String str = "Learn Java Programming";

//            fos.write(str.getBytes());

//                OR

            byte [] b = str.getBytes();
//
//            for(byte x : b)
//                fos.write(x);

            fos.write(b, 6, str.length()-6);

            fos.close();

        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
