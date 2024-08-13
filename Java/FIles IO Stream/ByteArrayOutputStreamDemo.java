import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream(10);
            bos.write('a');
            bos.write('n');
            bos.write('u');
            bos.write('j');

            byte b [] = bos.toByteArray();
            for(byte elem:b){
                System.out.print((char)elem);
            }
            bos.close();

            bos.writeTo(new FileOutputStream("Path/To/File"));
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
