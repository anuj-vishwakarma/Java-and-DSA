import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(12);
//        list.add(92);

        // Taking input in ArrayList

//        for (int i = 0; i < 3; i++) {
//            list.add(input.nextInt());
//        }
//
//        System.out.println(list);
        //Multiple arraylist

        ArrayList <ArrayList<Integer>> newlist = new ArrayList<>();

        // Initializing the multidimensional array list
        // If you don't initialize it then by default the value would be null
        for (int i = 0; i < 3; i++) {
             newlist.add(new ArrayList<>());
        }
        // adding elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                newlist.get(i).add(input.nextInt());
            }
        }
            // just similar to what we've done in the multi dimensional arrays
                // for example: for(int row = 0; i<arr.length; row++){
//                                    for (int col = 0; col<arr[row].length; j++) {
//                                        arr [row][col] = input.nextInt();
//                                    }


        System.out.println(newlist);

    }
}
