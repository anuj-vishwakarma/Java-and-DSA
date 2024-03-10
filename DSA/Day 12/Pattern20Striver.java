public class Pattern20Striver {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern( int n ) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        int space = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n-i+1; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < n-i+1; j++) {
                System.out.print('*');
            }
            System.out.println();
            space+=2;
        }
    }
}
