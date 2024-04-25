import java.util.Scanner;
public class Palindrome {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int org = n ;
        int sum = 0;
        while(n>0){
            sum = sum * 10;
            sum = sum + (n%10);
            n = n / 10;
        }
        System.out.println(sum);
        input.close();
    }
}
