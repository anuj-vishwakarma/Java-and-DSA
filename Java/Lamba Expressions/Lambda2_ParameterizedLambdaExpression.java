@FunctionalInterface
interface Int1{
    public int add(int x, int y);
}
@FunctionalInterface
interface Int2{
    public void display(String str);
}
public class Lambda2_ParameterizedLambdaExpression {
    public static void main(String[] args) {
        Int1 i1 = (x, y) -> {return (x+y);};
        Int1 i = (x, y) -> x+y; // this can also be written.
//        Int1 i1 = Integer::sum; this will also return sum

        System.out.println(i1.add(3,2));

        Int2 i2 = (g) -> {System.out.println("Hello " + g);};
//        Int2 i2 = (g) -> {System.out.println(g);};
//        Int2 i2 = System.out::println; this will also print g
    }
}
