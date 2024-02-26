public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-21, -10, 0, 2,3,4, 15,16, 52, 74};
        int target = 15;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    //return the index of target element
    //return -1 if target element not found
    static int binarySearch (int [] arr, int target){
        int start = 0;
        int end = arr.length-1;


        // we didn't write like mid = (start + end) / 2 because if start and end become so large
        // then the start + end will go outside the range of integer thus producing an error

        // but can't we do it like start/2 + end/2

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if (target < arr[mid] ) {
                end =  mid -1 ;
            }
            else {
                return mid;
            }
        }
        // when there's not such element in the array
        return -1;
    }
}
