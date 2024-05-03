//3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
import java.util.Arrays;
import java.util.List;

public class Question3{
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");

        System.out.print("Original List: \n");
        for(String x: stringList){
            System.out.print(x + " ");
        }
        stringList.replaceAll(s -> s.toLowerCase());

        stringList.replaceAll(String::toLowerCase);

        System.out.print("\nLowercase Strings: \n");
        for(String x: stringList){
            System.out.print(x + " ");
        }

        stringList.replaceAll(s -> s.toUpperCase());
        stringList.replaceAll(String::toUpperCase);

        System.out.print("\nUppercase Strings: \n");
        for(String x: stringList){
            System.out.print(x + " ");
        }
    }
}