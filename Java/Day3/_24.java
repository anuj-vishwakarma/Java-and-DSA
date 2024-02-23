import java.util.Scanner;
public class _24 {
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
        int n;
        int sum = 0;
        do {
            n = input.nextInt();
            sum = sum + n;
        }
        while(n!=0);
        System.out.println(sum);
        input.close();

    }
}
