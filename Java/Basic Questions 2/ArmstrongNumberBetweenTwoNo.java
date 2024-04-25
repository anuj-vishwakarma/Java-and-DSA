import java.util.Scanner;
public class ArmstrongNumberBetweenTwoNo {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = 0;
        for(int i=a; i<=b; i++){

            while(a>0){
                sum = sum + (a%10)*(a%10)*(a%10);
                a = a / 10;
            }

        }
        System.out.println(sum);
    }
}
