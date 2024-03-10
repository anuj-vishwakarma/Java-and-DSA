public class Pattern17Striver {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            ch = 'A';
            for (int j = 1; j <=i ; j++) {
                System.out.print(ch++);
            }
            ch = 'A';
            for (char j = (char)('A'+i-2); j>='A'; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
123456789
1    A
2   ABA
3  ABCBA
4 ABCDCBA
5ABCDEDCBA


                    space       letter       space
                    n-i-1      n-i to n+i    n-i-1

   */