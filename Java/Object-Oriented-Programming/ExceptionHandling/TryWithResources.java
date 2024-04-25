import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class TryWithResources {
    static void Divide()throws Exception{

           try(FileInputStream fi = new FileInputStream("C:\\Users\\anuja\\OneDrive\\Documents\\Pictures\\Desktop\\Hi.txt"); Scanner sc = new Scanner(fi);) {

//               sc = new Scanner(fi);
               int a = sc.nextInt();
               int b = sc.nextInt();
               int c = sc.nextInt();
               System.out.println(a / c);
           }

    }
    public static void main(String[] args) throws Exception {
        try {
            Divide();
        }
        catch (Exception e){
            System.out.println(e);
        }
//        int x = sc.nextInt();
//        System.out.println(x);
    }
}
