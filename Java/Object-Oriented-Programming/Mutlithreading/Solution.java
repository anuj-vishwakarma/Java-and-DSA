import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int lineNumber = 1;
        while(input.hasNextLine()){
            String s = input.nextLine();
            System.out.println(lineNumber+" " + s);
            lineNumber++;
        }
    }
}
