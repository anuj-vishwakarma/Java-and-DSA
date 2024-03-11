public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int [] arr = { 1, 2, 3, 4, 66, 77, 88};
        int target = 66;
        int s = 0;
        int e = arr.length - 1;
        System.out.println(search(arr, target, s, e));
    }
    static int search(int [] arr, int target, int s, int e){
        if(s > e ) // base condition (:
            return -1;

        int m = s + (e - s) / 2;
        if(target == arr[m])
            return m;

        if(target < arr[m])
            return search(arr, target, s, m-1); // make sure to return the search as
        // we've done,  only searching like
        // search(arr, target, s, m-1) ain't gonna work, we've to return some value

        return search(arr, target, m+1, e);
    }
}
