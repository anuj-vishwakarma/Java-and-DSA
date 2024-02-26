public class LeetCodeEvenNoOfDigits {

//    https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

    public static void main(String[] args) {
        int [] arr = {1, 44, 11, -2313, 242211};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int [] nums ) {
        int count = 0;
        for(int num: nums){
            if(even(num))
                count++;
        }
        return count;
    }
    // checks if number of digits in num is even or not
    private static boolean even ( int num){
        int noOfDigits= digits(num);
        return noOfDigits % 2 == 0;
    }
    // counts the number of digits in number

    // Shorcut to find number of digits

    private static int digits2 (int num) {
        if(num < 0)
            num *= -1;
        return (int)(Math.log10(num) + 1);
    }
    private static int digits(int num) {
        if(num < 0)
            num *= -1;

        if(num == 0)
            return 1;

        int count = 0;
        while(num >0) {
            num /=10;
            count++;
        }
        return count;
    }
}
