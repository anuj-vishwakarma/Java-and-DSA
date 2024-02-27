public class Floor  {
    public static void main(String[] args) {
        int [] nums = {2, 4, 5,6,8,64};
        int target = 15;
        System.out.println(floorOfNum(nums, target));
    }
    // return greatest number <= target
    static int floorOfNum(int []arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end - start ) / 2;
// but what if the target element is greater than the greatest element in array
            if(target > arr[arr.length-1])
                return -1;
//            if(arr[mid] == target)
//                return arr[mid];
//
//            if(target > arr[mid]) {
//                start = mid + 1;
//            }
//            else {
//                end = mid - 1;
//            }


            if(target > arr[mid])
                start = mid + 1;
            else if (target<arr[mid])
                end = mid - 1;
            else
                return arr[mid];

        }
        return arr[end];
//        return -1;
    }

}
