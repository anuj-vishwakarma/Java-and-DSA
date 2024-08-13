package jTree;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class Pairs{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
//              printPairs(new int [] {1,3,2,4});
        while(input.hasNext()){
            list.add(input.nextInt());
        }
        int [] arr = new int [list.size()];
        for(int i = 0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        subArrays(arr);
    }
    static void printPairs(int [] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                System.out.print("(" + arr[i] + ", " + arr[j] + ")");

            }
            System.out.println();
        }
    }
    static void subArrays(int [] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print("[" + arr[i] +" ");
            for(int j = i+1; j<n; j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println("]");
        }
    }
}