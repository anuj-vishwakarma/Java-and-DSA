import java.util.Scanner;
public class HCF {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter two numbers: ");
        int m = input.nextInt();
        int n = input.nextInt();

        int large, small;
        if( m > n)
        {
            large = m;
            small = n;
        }
        else {
            large = n;
            small = m;
        }
        int i = small;
        if( small == 0 && large != 0) {
            System.out.println("The HCF is " + large );
        }
        else if(large == 0 && small != 0)
            System.out.println("The HCF is " + small);
        else {
            while (i > 0) {
                if (large % i == 0 && small % i == 0)
                    break;
                i--;
            }
            System.out.println(i);
        }

//        System.out.println("The HCF is " + i);
    }
}
