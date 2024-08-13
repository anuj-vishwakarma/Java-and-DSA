package generics.lecture1;

public class ObjectClassFeaturesandDrawbacks {
    public static void main(String[] args) {
        Object obj = new String("Hello");
//        String str =   obj;   Wrong
        obj = new Integer(10);
        String str = (String)  obj; // this will generate ClassCastException at run-time because we're
//        typecasting integer to string.
    }
}
