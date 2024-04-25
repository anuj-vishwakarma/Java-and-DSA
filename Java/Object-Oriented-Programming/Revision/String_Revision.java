public class String_Revision {
    public static void main(String[] args) {
        byte b = 10;
        byte a = 012;
        byte c = 0b0111;
        byte d = 0xC;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        int x = 12;
        System.out.println(Integer.toBinaryString(x));
    }
}

/*
 7
                0 0 0 0 0 1 1 1
1's compliment: 1 1 1 1 1 0 0 0
                             +1
                1 1 1 1 1 0 0 1 (now this will be stored in the memory, because negative
                numbers are stored in the form of 2's compliment.

    */