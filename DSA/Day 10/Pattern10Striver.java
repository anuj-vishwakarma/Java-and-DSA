public class Pattern10Striver {
    public static void main(String[] args) {
        pattern(5);
        patternFlipped(5);
    }
    static void pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void patternFlipped(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
