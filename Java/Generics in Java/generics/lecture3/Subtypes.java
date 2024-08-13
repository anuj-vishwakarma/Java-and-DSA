package generics.lecture3;

import java.util.Arrays;
@SuppressWarnings("unchecked")

class MyArray<T> {
    private T[] arr = (T[]) new Object[20];
    int length  = 0;
    public void setData(T obj){
        arr[length++] = obj;
    }
    public int getLength(){
        System.out.println("The lenght is: " );
        return this.length;
    }
    public void getData() {
        Arrays.stream(arr).filter(x -> x != null).forEach(System.out::println);
    }
}
interface A{ }
class B  implements A  { }
class C implements A { }

public class Subtypes {
    public static void main (String[] args) {
        MyArray<Integer> obj = new MyArray();
//        J<String> obj1 = new J();
        obj.setData(4);
//        obj.setData(4); while creating object of class A, it is specifically mentioned that the
//        the method will take String as argument         
        obj.getData();



    }
}
