public class Pattern22Strivers {
    public static void main(String[] args) {
            pattern21(4);
    }
    static void pattern21(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int bottom = j;
                int left = 2*n-1-1-j;
                int right = 2*n-1-1-i;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");

            }
            System.out.println();
        }
    }
}
