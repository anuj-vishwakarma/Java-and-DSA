import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
try {
    byte[] b = {'a', 'b', 'c', 'd'};
    ByteArrayInputStream bas = new ByteArrayInputStream(b);
//        OR
    String str = new String(bas.readAllBytes());
    System.out.println(str);
    int x;
//        while((x = bas.read()) != -1){
//            System.out.print((char) x);
//        }
//        OR
    for (byte elem : bas.readAllBytes()) {
        System.out.print((char) elem);
    }
    bas.close();
}
catch (IOException e){
    System.out.println("An error occurred, " + e.getLocalizedMessage());
}
    }
}
