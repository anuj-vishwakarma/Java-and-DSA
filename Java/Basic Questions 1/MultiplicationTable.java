import java.util.Scanner;
public class MultiplicationTable {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int i = 1;
        while(i<=10){
            System.out.format("%d x %02d = %02d\n", n, i, (n*i));
//            System.out.println(n + "x" + i + "=" + (n*i));
            i++;
        }
    }
}
