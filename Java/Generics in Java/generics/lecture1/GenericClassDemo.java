package generics.lecture1;

public class GenericClassDemo<T> {
    T [] data = (T []) new Object[3];
    // It's a generic array, can store any type of data or
    // any type of object.
    public static void main(String[] args) {
        GenericClassDemo<String> genericArray = new GenericClassDemo<>();
        genericArray.data[0] = "Hi";
        genericArray.data[1] = "Bye";
//        genericArray.data = 12;

        String str = genericArray.data[0];
    }
}
