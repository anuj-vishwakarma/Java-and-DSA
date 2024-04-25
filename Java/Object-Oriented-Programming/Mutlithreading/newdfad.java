import java.util.Scanner;

public class newdfad {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your code here.
        int i = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();

        double d = scan.nextDouble();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}