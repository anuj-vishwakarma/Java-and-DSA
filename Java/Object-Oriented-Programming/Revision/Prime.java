import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int gcd = 0;
        for (int i = 1; i <= n ; i++) {
            if(n % i == 0)
                gcd++;
        }
        if(n == 1)
            System.out.println("false");
        else if(gcd > 2)
            System.out.println("Not prime");
        else
            System.out.println("Prime");
    }
}
