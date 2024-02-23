import java.util.Scanner;
public class checkPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not: ");
        int n = input.nextInt();

        if(checkPrime(n))
            System.out.println("Prime!");
        else
            System.out.println("Not Prime!");
    }
    static boolean checkPrime(int n ) {
        int c = 2;
        boolean isPrime = true;
        if(n <= 1)
            isPrime = false;
        else {
            while (c < n) {
                if (n % c == 0) {
                    isPrime = false;
                    c += 1;
                } else
                    c += 1;
            }
        }
        return isPrime;
    }
}
