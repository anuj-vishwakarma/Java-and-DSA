public class NoOfZeroesInNumber {
    public static void main(String[] args) {
        System.out.println(zeroes(13421));
    }
    static int count = 0;
    static int zeroes (int n) {
        int rem = n % 10;
        if(n == 0)
            return count;
        if( rem == 0)
            count++;
        return zeroes(n/10);
    }
}
