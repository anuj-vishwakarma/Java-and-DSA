
public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseBits(321));
    }
    static long sum = 0;
    public static long reverseBits(long n) {
        // Write your code here
        if(n == 0)
            return sum;
        sum = sum*10 + n%10;
        return reverseBits(n/10);



    }
}
