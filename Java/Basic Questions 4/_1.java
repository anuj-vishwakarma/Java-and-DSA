import java.math.*;
import java.util.Arrays;

public class _1 {
    public static void main(String[] args) {
//        max(10, 3, 5);
//        min(10,3, 5);
          Max( -5, -1, -10, 2);
    }
    /* static void max(int...a){
        var x = a[0];
        var y = a[1];
        var z = a[2];
        if(x > y && x > z)
            System.out.println(x);
        else if (y > x && y > z)
            System.out.println(y);
        else if (z > x && z > y)
            System.out.println(z);
        else
            System.out.println("Invalid Input");

    }*/
    /*static void min(int...a){
        var x = a[0];
        var y = a[1];
        var z = a[2];
        if(x < y && x < z)
            System.out.println(x);
        else if (y < x && y < z)
            System.out.println(y);
        else if (z < x && z < y)
            System.out.println(z);
        else
            System.out.println("Invalid Input");

    }*/
    static void Max(int...a){
        int c=0;
        int largeset = Integer.MIN_VALUE;
        try {
            for (int i = 0; i < a.length; i++) {
                if (a[i] > a[i + 1])
                    c = a[i];
                else if (a[i+1] > a[i])
                    c = a[i+1];
                else {
                    if(a[i] > largeset)
                        c = a[i];
                }
            }
        }
        catch (Exception e) {

        }
        System.out.println(c);
    }
}
