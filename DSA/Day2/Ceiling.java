public class Ceiling {
    public static void main(String[] args) {
        int [] nums = {2, 4, 5,6,8,64};
        int target = 2 ;
        System.out.println(ceilingOfNum(nums, target));
    }
    // return the smallest number >= target
    static int ceilingOfNum(int []arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end - start ) / 2;

            if(target > arr[arr.length-1])
                return -1;

            if(target > arr[mid])
                start = mid + 1;
            else if (target<arr[mid])
                end = mid - 1;
            else
                return arr[mid];

        }
        
        return arr[start];
//        return -1;
    }

}
