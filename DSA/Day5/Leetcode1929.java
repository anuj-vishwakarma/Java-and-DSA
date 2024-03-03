import java.util.Arrays;

    //https://leetcode.com/problems/concatenation-of-array/description/
    public class Leetcode1929 {
        public static void main(String[] args) {
            int [] nums ={3,3,4};
            System.out.println(Arrays.toString(getConcatenation(nums)));

        }
        static int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int [] ans = new int [2*n];
            System.arraycopy(nums,0, ans, 0, nums.length);
            System.arraycopy(nums,0,ans, nums.length,nums.length);
            return ans;
        }
    }

