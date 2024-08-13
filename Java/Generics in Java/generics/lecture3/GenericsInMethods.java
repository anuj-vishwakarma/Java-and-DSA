package generics.lecture3;

class MyClass <T> {
    private T obj;

}
interface Interface<T>{

}
class SubClass <T>extends MyClass<T> implements Interface<T>{
    
}
public class GenericsInMethods {
    public <T> void show(T obj){
        System.out.println(obj);
    }
    public static void main(String[] args) {

    }
}
