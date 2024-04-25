import java.util.Scanner;
public class SumUntilPressedX {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int n = 0, sum = 0;
        try {
            for (int i = 0; true; i++)
                if (n != 120) {
                    n = input.nextInt();
                    sum = sum + n;
                } else if (n == 120)
                    break;
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            System.out.println("Sum: " + sum);
        }
    }
}
