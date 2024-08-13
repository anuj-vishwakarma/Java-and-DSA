package multipleuser.usingmultithreading;

public class Solution {
    public static void alphaHill(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            char c = 'A';
            for (int j = 0; j < n; j++) {
                if(j<n-i-1){
                    System.out.print("-");
                }
                else
                    System.out.print((c++));
            }
            c = (char) ('A'+i);
            for (int j = 0; j < n-1; j++) {
                if(j<i)
                    System.out.print((--c));
                else
                    System.out.print("-");
            }
            System.out.println();
        }
    }
    public static void nLetterTriangle(int n) {
        // Write your code here

        // to change lines
        for(int i = 0; i<n; i++){
            char c = 'A';
            // to actually print the desired pattern
            for(int j = 0; j<i+1; j++){
                System.out.print(c++);
            }
            System.out.println();
        }
    }
    public static void Pattern16(int n) {
        // Write your code here
        char c = 'A';
        // to change lines
        for(int i = 0; i<n; i++){

            // to actually print the desired pattern
            for(int j = 0; j<i+1; j++) {
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }

    /*
        ******
        **  **
        *    *
        *    *
        **  **
        ******
    */
    public static void Pattern19(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j<n-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if(j<i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j<=i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if(j<n-i-1)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }

            System.out.println();
        }
        
    }
    public static void Pattern15(int n) {
        // Write your code here
        char c;
        // to change lines
        for(int i = 0; i<n; i++){
            c = 'A';
            // to actually print the desired pattern
            for(int j = 0; j<n-i; j++) {
                System.out.print(c++);
            }

            System.out.println();
        }
        // OR This method is also Cool!
        for (int i=0; i<n; i++) {
            for (char cj= 'A'; cj < 'A'+ n-i; cj++) {
                System.out.print(cj+ " ");
            }
            System.out.println();
        }
    }
    public static void Butterfly(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j<=i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int j=0; j<n; j++){
                if(j<n-i-1)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n; j++){
                if(j<n-i-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int j=0; j<n; j++){
                if(j<=i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void numberCrown(int n) {
        // Write your code here.
        for(int i=0;i<n; i++){
            int start = 0;
            for(int j=0; j<n; j++){
                if(j<=i)
                    System.out.print(++start+" ");
                else
                    System.out.print("  ");
            }

            for(int j=0; j<n; j++){
                if(j<n-i-1)
                    System.out.print("  ");
                else
                    System.out.printf("%d ", (n-j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Butterfly(5);
    }
}