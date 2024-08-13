package generics.lecture1;

public class ObjectClassProblem2 {
    public static void main(String[] args) {
        Object [] obj = new Object[3];
        obj[0] = "Hello";
        obj[1] = "Bye";
        obj[2] = new Integer(12); // or obj[2] = 10 or Integer.valueOf(10); // See it's not showing error
        // Now converting all of them into strings
        String str;
        for(Object element : obj){
            str = (String) element;
            System.out.println(element);// Now we'll get ClassCastException because Integer can't be typecast to string.
        }
    }
}