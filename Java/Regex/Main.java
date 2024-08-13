import java.util.regex.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "(1,2,3,4,5,6,7,8,9,10,)";
        List<Integer> numbers = extractNumbers(input);
        System.out.println(numbers);
    }

    public static List<Integer> extractNumbers(String input) {
        List<Integer> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            numbers.add(number);
        }
        return numbers;
    }
}
