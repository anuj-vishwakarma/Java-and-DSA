public class Pattern14Striver {
    public static void main(String[] args) {
        pattern(5);
    }
    static  void pattern (int n) {
        char val = 'A';
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch<='A'+i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
