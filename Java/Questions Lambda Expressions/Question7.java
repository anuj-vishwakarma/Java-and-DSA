//7. Write a Java program to implement a lambda expression to remove duplicates from a list of integers.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Duplicates{
    public void removeDuplicates();
}
public class Question7 {
    public void removeDuplicate(int [] arr){
        int f = 0;
        int index = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            f = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == f) {
                    list.add(arr[i]);
                    index = i;
                }
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,4,6);
        Duplicates d = () -> {
            int f = list.getFirst();

        };
    }
}
