public class Pattern18Striver {
    public static void main(String[] args) {
        print(5);
    }
    static void print (int n) {
        char ch = (char)('A'+n-1);
        for (int i = 0; i < n; i++) {
            for (char x = (char)(ch-i); x<=ch; x++ ){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
