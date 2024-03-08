
//          https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
class LeetCode_2529 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,-1,-4};
        System.out.println(maximumCount(nums));
    }
    static int maximumCount(int[] nums) {
        int countPositive = 0, countNegative = 0;


        for(int j = 0; j<nums.length; j++) {
            if(nums[j] < 0)
                countNegative++;
            else if(nums[j] > 0)
                countPositive++;
        }

        return (Math.max(countPositive, countNegative));
    }
}
