public class Pattern12Striver {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern (int n ){
        int space = 2*(n-1);
        for (int i = 1; i <= n; i++) {
            //number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= space ;  j++) {
                System.out.print(" ");
            }
            for (int j = i; j>=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -=2;
        }
    }
}
/*
   0 1 2 3 4 5 6 7            num      space        num
0  1             1            j<=i     n-i-1       j<=i
1  1 2         2 1
2  1 2 3     3 2 1
3  1 2 3 4 4 3 2 1 */

