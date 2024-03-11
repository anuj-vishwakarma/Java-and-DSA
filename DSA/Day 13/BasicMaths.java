import java.util.Scanner;

import static java.lang.Math.log10;

public class BasicMaths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        while(a > 0 && b > 0){
            if(a>b) a = a%b;
            else b = b % a;
        }
        if(a == 0)
            System.out.println(b);
        else
            System.out.println(a);
    }

}
