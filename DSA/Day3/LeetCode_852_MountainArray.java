public class LeetCode_852_MountainArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,5,7,9,4,3};
        System.out.println(peakIndexInMountainArray(nums));
        }
    static int peakIndexInMountainArray(int [] arr) {
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

}
