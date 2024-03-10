public class Pattern21Striver {
    public static void main(String[] args) {
        pattern(8);
    }
    static void pattern(int n){
        int space = 0;
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < n/2-i; j++) {
                System.out.print('*');
            }
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n/2-i; j++) {
                System.out.print('*');
            }
            System.out.println();
            space+=2;
        }
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < space-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
            space-=2;
        }
    }
}
