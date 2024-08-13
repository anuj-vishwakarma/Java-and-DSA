package generics.lecture4;

class MyArray<T>{ // can give multiple parameters two
    private T[] arr = (T[]) new Object[20];
    private int length = 0;

    public void setData(T value) {
        arr[length++] = value;
    }

    public void getData () {
        for(int i = 0; i<length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
class A{ }
class B extends A{ }
class C extends B{ }

public class GenericMethods {

    // Writing generic method

    static <E> void show(E... list){
        for(E element : list){
            System.out.println(element);
        }
    }

    static <E>void fun1(MyArray<E> obj){
        obj.getData();
    }

    static void fun(MyArray <?>  obj){
//        obj.setData("anuj");
    }

    public static void main(String[] args) {

        MyArray<String> a = new MyArray<String>();
        // or
        MyArray<?> b = new MyArray<String>();
//        b.setData("dafd");
        fun(a);
    }
//        show(new String [] {"chocolate", "mils"});
//        show(1, 4 ,5, 2);

//        MyArray<String> obj = new MyArray<>();
//        obj.setData("hi");
//        obj.setData("Bye");
//        fun1(obj);

}
