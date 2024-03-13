public class CountingNumberOfZeroes {
    public static void main(String[] args) {
        System.out.println(zeroes(1200090301));
    }
    static int counter = 0;
    static int count(int n, int counter) {
        if(n == 0)
            return counter;
        if(n%10 == 0)
            return count(n/10, ++counter);
        return count(n/10, counter);
    }

    // using helper function

    static int zeroes (int n ) {
        return helper(n, 0);
    }

    //special pattern, how to pass a value to above calls
    private static int helper(int n, int c) {
        if(n == 0)
            return c;
        if(n%10 == 0)
            return helper(n/10, ++c);
        return helper(n/10, c);
    }
}
