public class Mergin_Masking_applications {
    public static void main(String[] args) {
//        swapping two numbers using XOR operator
        int a = 9, b = 12;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
//        System.out.println(a + " " + b);
        byte x = 9, y = 12, z;
        z = (byte) (x << 4);
        z = (byte)(z | y);
        System.out.println(Integer.toBinaryString((z & 0b11110000)));
        System.out.println(((z & 0b00001111)));
        System.out.println((z & 0b11110000) >> 4);
    }
}
