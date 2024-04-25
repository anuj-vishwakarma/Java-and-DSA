
interface Test{
    void method1();
}
class My implements Test{
    public void method1 (){
        System.out.println("Hi, from method1");
    }
    public void method2(){
        System.out.println("Hi, from method2");
    }
}
public class InterfacesExample {
    public static void main(String[] args) {
        Test t = new My();
        t.method1();
    }
}
