//5. Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Question5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Zebra", "X-mas", "Aircraft", "Puppy");
        String elements [] = {"anuj", "kirandweep", "harsh"};
        Arrays.sort(elements, (s1, s2) -> s1.compareToIgnoreCase(s2));
        list.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
        // or
        list.sort(String::compareToIgnoreCase);
        Arrays.sort(elements, String::compareToIgnoreCase);

        for (String s : list) {
            System.out.print(s + " ");
        }

    }
}
