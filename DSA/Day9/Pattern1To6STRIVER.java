/*
Pattern to print
    ******
    ******
    ******
*/
import java.util.*;
public class Pattern1To6STRIVER {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);

    }
    static void pattern1(int n ) {
        for(int i = 0; i<n; i++) {
            for(int j = 1; j<=n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void pattern2(int n ) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void pattern3(int n ) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n ) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n ) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n-i+1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void pattern6(int n ) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
