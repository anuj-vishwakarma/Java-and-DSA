@FunctionalInterface
interface MyLambda{
    public void display(String name);
}

class My implements MyLambda{
    public void display(String name){
        System.out.println("Hello, World!");
    }
}
public class Lambda1 {
    public static void main(String[] args) {
//        MyLambda m = new MyLambda() {
//            @Override
//            public void display(String name){
//                System.out.println("Hello, world!");
//            }
//        };
        MyLambda n =
                (String name) -> {System.out.println("Hello World!");};


    n.display("Hi");
    }
}
