/**
* // This is MountainArray's API interface.
* // You should not implement it, or speculate about its implementation
* interface MountainArray {
*     public int get(int index) {}
*     public int length() {}
* }
*/

class LeetCode1095_Hard {
   public static void main(String[] args) {

   }
   static int findInMountainArray(int target, MountainArray mountainArr) {

       int peak = findPeakIndex(mountainArr);
       int firstTry = ascendingBS(mountainArr, target, 0, peak);
       if (firstTry!=-1)
           return firstTry;
       return descendingBS(mountainArr, target, peak, mountainArr.length() - 1);

   }
   static int findPeakIndex(MountainArray mountainArr) {
       int start = 0;
       int end = mountainArr.length()-1;

       while( start < end) {
           int mid = start + (end - start) / 2;
           if(mountainArr.get(mid) > mountainArr.get(mid+1))
               end = mid;
           else
               start = mid+1;
       }
       return start; // or end
   }
   static int decreasingBS (MountainArray mountainArr, int target, int start, int end) {
       // int start = findPeakIndex(mountainArr);
       // int end = mountainArr.length() - 1;
       while(start <= end ) {
           int mid = start + (end - start) / 2;
           if(target<mountainArr.get(mid))
               start = mid + 1;
           else if (target > mountainArr.get(mid))
               end = mid - 1;
           else
               return mid;
       }
       return -1;
   }
   static int increasingBS (MountainArray mountainArr, int target, int start, int end) {
       // int start = 0;
       // int end = findPeakIndex(mountainArr);
       while(start <= end) {
           int mid = start + (end - start) / 2;
           if(target>mountainArr.get(mid))
               start = mid + 1;
           else if (target < mountainArr.get(mid))
               end = mid - 1;
           else
               return mid;
       }
       return -1;
   }

}
/*
Minimum index nikalna h
to sabse phle peak element ka index nikalo then search in both ascending
descending part of the mountain array,
kyuki agar elements dono side matlab inc and dec side me hue to hum dono side
check krenge
and even agar elements ek side to bhi dono side check krenge ok


finding peak index
1 2 3 4 5 3 2 1
0 1 2 3 4 5 6 7
s     m       e
       s     e
         m
         s   e
           m
           s e
           m
             s
             e
             utlimately start = end so we can return whatever we want as
             for returning peak index


mid = 3 arr[mid] = 4
now arr[mid] < arr[mid+1] isAsc = true
start = mid + 1
*/
