package exploring.networkprogramming.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String text = "cat bat mat rat";
        Pattern pattern = Pattern.compile("\\b\\w{3}\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }



        String sum1 = "sum(34,45,3,5)";
        List<Integer> list = new ArrayList<>();

        if (sum1.matches("sum\\([\\d,]+\\)")) {
            Pattern pattern1 = Pattern.compile("\\d+");
            Matcher matcher1 = pattern.matcher(sum1);

            while (matcher.find()) {
                list.add(Integer.parseInt(matcher.group()));
            }
        }
        // This also works fine, but above method is better.
        String sum = "sum(3,4,5,6,6)";
        String numbersOnly = sum.substring(sum.indexOf('(') + 1, sum.indexOf(')'));
        List<String> num = Arrays.stream(numbersOnly.split(","))
                .map(String::trim)
                .toList();
        System.out.println(num);

        System.out.println(sum.matches("sum\\([\\d+,]+\\)"));
    }
}
