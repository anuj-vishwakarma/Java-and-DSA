import java.util.Scanner;
public class checkPrimeOptimized {
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
        if(n <= 1)
            return false;
        else {
            for(int i = 2; i*i <= n; i++){
                if(n%i == 0 )
                    return false;
            }
        }return true;
    }
}
