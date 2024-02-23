import java.util.Scanner;
public class _2Even_or_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it's even or odd: ");
        int n = input.nextInt();
        if(checkEven(n))
            System.out.println("Even!");
        else
            System.out.println("Odd!");
    }
    static boolean checkEven(int n)
    {
        return (n % 2 == 0);
    }
}
