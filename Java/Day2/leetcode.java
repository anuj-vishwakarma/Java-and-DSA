public class leetcode {
    public static void main(String[] args) {
        int n = 4;
        int [] arr = sumZero(n);
        for(int x:arr) {
            System.out.print(x + " ");
        }
        arr[0] = 3;
    }

    static int[] sumZero(int n) {
        int size = n/2;
         int [] arr;
        if(n %2!= 0) {
            arr = new int [n];
            for(int i = -size; i<=size; i++ ){
                arr[size+i] = i;
            }
        }
        else {
            arr = new int [n];
            for(int i = -size; i<=size; i++ ){
                if(i != size)
                    arr[size+i] = i;
                else
                    arr[size-1+i] = arr[size-1+i] + i;
            }
        }

        return arr;
    }

}
