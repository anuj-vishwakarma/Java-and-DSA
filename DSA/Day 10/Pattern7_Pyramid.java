public class Pattern7_Pyramid {
    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern6(int n){
        for(int i = 0; i<n; i++) {
            //space
            for(int j = 0; j <= n-1-i; j++){
                System.out.print(" ");
            }

            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }

            for (int l = 0; l <= n-i-1; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*
         // approach:
         we know we'll need a for loop for changing rows
        now next step is to build relation between index i (especially) and columns
        based on the relation use the conditions and get the pattern printed!

we have to print space star space
  0 1 2 3 4 5 6 7 8           space         star         space
0        *                      4             1            4
1       * *                     3             3            3
2     * * * * *                 2             5            2
3   * * * * * * *               1             7            1
4 * * * * * * * * *             0             9            0
                           0 to n-i-1    i to 2*i+1    0 to n-i-1


 */