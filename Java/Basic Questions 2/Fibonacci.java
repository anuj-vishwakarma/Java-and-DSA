import java.util.*;
public class Fibonacci {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int a,b,sum=0;
    a = 0; b = 1;
    if(n==1)
        System.out.println("0");
    else if(n==2)
        System.out.println("1");
    else {
        System.out.print("0 1 ");
        for(int i=0; i <n-2; i++){
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum+" ");
        }

    }
    }
}
