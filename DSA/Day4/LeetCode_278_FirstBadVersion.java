//
////https://leetcode.com/problems/first-bad-version/
///* The isBadVersion API is defined in the parent class VersionControl.
//      boolean isBadVersion(int version); */
//
//class LeetCode_278_FirstBadVersion {
//    public int firstBadVersion(int n) {
//        int start = 1;
//        int end = n;
//        while(start < end) {
//            int mid = start + (end - start)/2;
//
//            if(isBadVersion(mid) == true)// isBadversion(mid) only // it's an api which tells
//                // whether the version is bad or not
//                end = mid;
//            else
//                start = mid + 1;
//
//        }
//        return start;
//    }
//}
//
//
//// 1 2 3 4 5  // bad = 2
//// s   m   e
//// isBadVersion(m=3) (False) -> s = 3+1 = 4
////                          and e = 5
//// s   e
//// 4   5  m = 4
//// isBadVersion(m=4)
