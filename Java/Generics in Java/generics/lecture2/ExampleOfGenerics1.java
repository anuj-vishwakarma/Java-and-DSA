package generics.lecture2;

class MyClass<T> {
    private T obj;
    public void setData(T obj){
        this.obj = obj;
    }
    public void getData(){
        System.out.println(obj);
    }
}
public class ExampleOfGenerics1 {
    public static void main(String[] args) {
        MyClass<String> myClass = new MyClass<>();
        myClass.setData("Hello, created generic class.");
        myClass.getData();

        MyClass<Integer> myClass1 = new MyClass<>();
        myClass1.setData(1232);
        myClass1.getData();
    }
}
