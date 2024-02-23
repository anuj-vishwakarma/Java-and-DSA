import java.util.Scanner;
public class _12_PythagoreanTriplet {
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
    static boolean checkPythagorean(int a, int b, int c){
        if( a*a == b*b + c*c )
            return true;
        else if ( a*a + b*b == c*c )
            return true;
        else if ( b*b == c*c + a*a)
            return true;
        else
            return false;
    }
}
