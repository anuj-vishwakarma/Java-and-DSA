import java.util.ArrayList;
import java.util.Arrays;

public class PassingArrayListINArgument {
    public static void main(String[] args) {

        int [] arr = {1,2,3,3,3,3,4,5};
        int target = 3;
        System.out.println(find(arr,target,0,new ArrayList<>()));
        // we can also print it like
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(find(arr,target,0,list));
        System.out.println((find2(arr,target,0)));

    }
    // Passing list in argument have different reference variable in each call but they point
    // to same object thus we're getting final answer in same arraylist


    static ArrayList<Integer> find(int []arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length)
            return list;
        if(arr[index] == target)
            list.add(index);
        return find(arr,target,++index,list);
    }
    // return the list don't take it in argument
    // Problem to this approach : Every time of function call a new list will be created
    // But this ain't so optimized approach because we're creating objects again and again
    static ArrayList<Integer> find2(int [] arr, int target, int index){
        ArrayList <Integer> list = new ArrayList<>(); // creating objects again and again

        if(index == arr.length)
            return list;
        // this will contain answer for that function call only
        if(arr[index] == target)
            list.add(index);
        ArrayList<Integer> ansFromBelowCalls = find2(arr,target, ++index);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}

//RECURSION//