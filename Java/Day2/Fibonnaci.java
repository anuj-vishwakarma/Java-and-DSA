import java.lang.*;
import java.util.Scanner;
class Fibonnaci {
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        if(n == 1)
            System.out.println("0");            
        else if (n==2) 
            System.out.println("1");

        input.close();

    }
}