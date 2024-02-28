public class LeetCode_1095_FindInMountainArraysimplified {
    public static void main(String[] args) {
        int [] nums = {1,2,4,8,9, 3,2,1};
        int target = 2;
        System.out.println(search(nums,target));
    }
    static int search(int [] arr, int target) {
        int peak = peakIndex(arr);
        int firstTry = binarySearch(arr, target,0, peak);
        if(firstTry!= -1)
            return firstTry;
        // otherwise try to search in second half of array
        return binarySearchDescending(arr, target,peak+1, arr.length-1);
    }

    static int peakIndex(int [] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) { // then we're in decreasing array so no need to check further just check in the earlier array
                // this may be the answer but check the left too for certainty ie. from start = 0 to end = mid;
                // this is why end != mid-1

                end = mid;
            } else {
                // you're in ascending part of array
                start = mid + 1;
                // because we know mid + 1 element > mid element since we're in ascending array so no need to again check for mid
            }
        }
        // in the end, start == end and pointing to the largest number because of the two checks above
        // start and end are always trying to find maximum elements in the above 2 checks
        //hence when they're pointing to justo one element, that is the max one because that is what the checks say(acc to checks)
        //more elaboration: at every point of time for start and end, they have best possible ans  till that time
        // and if we're saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or end as both are equal
    }
    static int binarySearch (int [] arr, int target, int start, int end) {


        while(start <= end ) {
            int mid = start + (end - start)  / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            }else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    static int binarySearchDescending (int [] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start)/ 2;
            if(target<arr[mid])
                start = mid + 1;
            else if(target > arr[mid])
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
