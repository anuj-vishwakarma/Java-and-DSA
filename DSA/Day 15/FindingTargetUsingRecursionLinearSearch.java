public class FindingTargetUsingRecursionLinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5};
        int target = 5;
        System.out.println(search(arr,target,0));
    }
    static int search(int [] arr, int target, int index) {
        if(index == arr.length)
            return -1;
        if(arr[index] == target )
            return index;
        else
            return search(arr, target,++index);

    }
}

