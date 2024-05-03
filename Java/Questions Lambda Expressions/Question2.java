//2. Write a Java program to implement a lambda expression to check if a given string is empty.

@FunctionalInterface
interface CheckString{
    public boolean isEmpty (String s);

}

public class Question2 {
    public static void main(String[] args) {
        CheckString a = (s) -> {return s.isEmpty();};
        CheckString b = (s) -> s.isEmpty();
        CheckString c = String::isEmpty;
        System.out.println(a.isEmpty("fda"));
        System.out.println(b.isEmpty("Empty"));
        System.out.println(c.isEmpty(""));
    }
}
