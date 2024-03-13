import java.util.ArrayList;

public class SearchingForTargetFromBothTheSidesOfArray {
    public static void main(String[] args) {
        int [] arr = {1,3,2,2,2,7};
        int target = 2;
        findAllIndex(arr,target,0);
        System.out.println(list);
    }
    static ArrayList <Integer> list = new ArrayList<>();
    static void findAllIndex(int [] arr, int target, int index) {
        if(index == arr.length)
            return;
        if(arr[index] == target) {
            list.add(index);

        }
        findAllIndex(arr, target, ++index);
    }
}
