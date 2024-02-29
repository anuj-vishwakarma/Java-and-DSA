
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;
class LeetCode_167_TwoSum_II {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int [] ans = new int [2];
        int start = 0;
        int end = numbers.length-1;
        while(start <= end) {
            if(numbers[start] + numbers[end]  == target){
                ans[0] = start+1;
                ans[1] = end+1;
                break;
            }
            else if(numbers[start] + numbers[end] < target)
                start++;
            else
                end--;

        }
        return ans;
    }
}