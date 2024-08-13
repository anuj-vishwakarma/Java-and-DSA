package generics.lecture2;


class MyArray<T, K, R, W, P, X, C, B, N>{ // can give multiple parameters two
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

public class ExampleOfGenerics2 {
    public static void main(String[] args) {
        MyArray array = new MyArray<>();
        array.setData(3);
        array.setData(4);
        array.setData(1);
        array.setData(6);

        array.getData();
    }
}
