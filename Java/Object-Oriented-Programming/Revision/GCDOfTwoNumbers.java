public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        int a = 90, b = 6;
        int gcd = 0;
        for (int i = 1; i <= a ; i++) {
            if(a % i == 0 && b % i == 0)
                gcd = i;
        }
        System.out.println(gcd);
        System.out.println(FindGCD(8, 16));
    }
    static int FindGCD(int m, int n ) {
        while(m != n)
        {
            if(m > n)
                m = m - n;
            else
                n = n - m;
        }
        return m;
    }
}
