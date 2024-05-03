import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question4{
    public static void main(String [] args){
        List<Integer> nums = Arrays.asList(1,2,34,5);

        List<Integer> evenNumbers = nums.stream().filter(n -> n%2 == 0).toList();


        List<Integer> oddNumbers = nums.stream().filter(n -> n%2 != 0).toList();
        System.out.println("\nOdd Numbers: ");
        for (int x  : oddNumbers) {
            System.out.print(x + " ");
        }

    }
}