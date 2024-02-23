import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Program for finding whether a number is prime or not:
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int c = 2;

        while(c*c < n) {
            if(n%c == 0) {
                System.out.println("Not prime");
                c =c + 1;
            }break;
        }
        System.out.println("Prime");
    }
}

/*
    Start
    input n
    c = 2
    while (c*c < n)
    {
        if( n%c == 0)
            print("not Prime")
            break;
        else
            print("Prime")
    }

*/