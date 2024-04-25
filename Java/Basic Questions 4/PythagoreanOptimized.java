import java.util.Arrays;
import java.util.Scanner;

public class PythagoreanOptimized {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        if(checkPythagorean(a, b, c))
            System.out.println("The numbers " + a + ", " + b + " and " + c + " are Pythagorean Triplet");
        else
            System.out.println("The numbers " + a + ", " + b + " and " + c + " are not Pythagorean Triplet");
    }

static boolean checkPythagorean(int a, int b, int c) {
        int [] sorted = {a, b, c};
    Arrays.sort(sorted);
    return sorted [0] * sorted[0] + sorted[1] * sorted[1] == sorted[2] * sorted[2];
}

}
