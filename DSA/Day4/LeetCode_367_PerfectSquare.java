
//                    https://leetcode.com/problems/valid-perfect-square/
public class LeetCode_367_PerfectSquare {
    public static void main(String[] args) {
        int x = 32;
        System.out.println(isPerfectSquare(x));
    }
    static boolean isPerfectSquare(int num) {
        double x = Math.sqrt(num);
        return (x%1 == 0);
    }
}
// NOT ABLE TO DO WITH BINARY SEARCH, NEED SOME PRACTICE ON
//BINARY SEARCH

// we can calculate the same with use of binary search too!
// in the binary search we need to calculate the square root
// using BS, we'll take the left = 1; and right = number
// now