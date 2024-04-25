import java.util.Scanner;

public class AreaOfCircle {
    public static void main (String [] args) {
        int radius = 2;
        System.out.println("The area of circle is " + (3.1415 * radius * radius));
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("The factors of " + n + " are ");
        for(int i=1; i<=n; i++) {
            if(n%i == 0)
                System.out.print(i+" ");
        }
    }
}
