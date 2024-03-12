public class ReverseOfNumber {
    public static void main(String[] args) {
        System.out.println(reverse3(12345));
    }
    static void reverse1(int n) {
        if(n == 0)
            return;
        System.out.print(n%10);
        reverse1(n/10);
    }
    static int sum = 0;
    static void reverse2(int n) {
        int rem = n%10;
        sum = sum*10 + rem /* or n%10 just no need to use extra variable rem*/;
        if(n%10 == n)
            return;
        reverse2(n/10);
    }
    static int reverse3(int n){
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int)Math.log10(n) + 1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n) {
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }
}
