public class Pattern19Striver {
    public static void main(String[] args) {
        print(2);
    }
    static void print (int n) {
        int spaces = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print('*');
            }
            System.out.println();
            spaces+=2;
        }
        spaces = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            for (int j = 1; j <= 2*(n-(i+1)); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
