public class CheckingIfTargetIsPresentInArrayUsingRecursion {
    public static void main(String[] args) {
        int [] arr = {1,4,3,6,7};
        int target = 9;
        System.out.println(search(arr,target,0));
    }
    static boolean search(int [] arr, int target, int index) {
        if(index == arr.length)
            return false;
        else
            return (arr[index] == target) || search(arr, target, ++index);
    }
}
