import java.io.CharArrayReader;
import java.io.CharArrayWriter;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter caw = new CharArrayWriter();
        caw.write('a');
        caw.write('n');
        caw.write('u');
        caw.write('j');
        for (char elem : (caw.toCharArray())) {
            System.out.print(elem);
        }
    }
}
