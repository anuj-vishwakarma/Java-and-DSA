//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
import java.util.Arrays;
class DuplicateNumbers {
    public static void main(String[] args) {
        int [] nums = {1,3,3,6,9};
        System.out.println(findDuplicate(nums));
    }
    static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i++){
            if(nums[i]==nums[i-1])
                return nums[i];
        }
        return 0;
    }
}