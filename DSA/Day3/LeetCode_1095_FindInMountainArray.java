public class LeetCode_1095_FindInMountainArray {
    public static void main(String[] args) {
        int [] mountainArr = {0,1,2,4,2,1};
        int target = 1;
        System.out.println(findMountainArray(target,mountainArr));
    }
    static int findMountainArray(int target, int [] mountainArr) {
        int start, end;
        boolean isAsc;
        if(mountainArr[0] < peakIndexInMountainArray(mountainArr))
        {
            start = 0;
            end = peakIndexInMountainArray(mountainArr);
            isAsc = true;
        }
        else {
            start = peakIndexInMountainArray(mountainArr);
            end = mountainArr.length;
            isAsc = false;
        }
        return binarySaarch(mountainArr, target, start,end);
    }
    static int binarySaarch(int[] mountainArr, int target, int start, int end) {
        boolean isAsc ;
        if(mountainArr[0] < peakIndexInMountainArray(mountainArr))
        {
            start = 0;
            end = peakIndexInMountainArray(mountainArr);
            isAsc = true;
        }
        else {
            start = peakIndexInMountainArray(mountainArr);
            end = mountainArr.length;
            isAsc = false;
        }

         while(start <= end) {
             int mid = start + (end - start) / 2;
             if(target == mountainArr[mid])
                 return mid;
             if(isAsc){
                 if(target<mountainArr[mid])
                     end = mid - 1;
                 else
                     start = mid + 1;
             }
             else {
                 if(target>mountainArr[mid])
                     end = mid - 1;
                 else
                     start = mid + 1;
                }
         }

         return -1;
    }
    static int peakIndexInMountainArray(int [] mountainArr) {
        int index1=0, index2=0;
        int start = 0;
        int end = mountainArr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] > mountainArr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

       return start;
    }
}
