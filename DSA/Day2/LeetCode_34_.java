import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode_34_ {
    public static void main(String[] args) {
        int [] nums = {2, 3, 3, 3, 4, 9};
        int target = 3;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }


    static int[] searchRange(int[] nums, int target) {
        int [] ans = {-1, -1};
        int start = returnIndex(nums, target, true);
        int end = returnIndex(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    // this function will just return the index value of target
    static int returnIndex(int [] nums, int target, boolean findStartIndex) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid])
                start = mid + 1;
            else if (target < nums[mid])
                end = mid - 1;
            else
            {
                ans = mid;
                if(findStartIndex)
                    end = mid - 1;
                else
                    start = mid + 1;
            }

        }
        return ans;
    }
}
