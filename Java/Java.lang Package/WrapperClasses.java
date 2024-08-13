public class WrapperClasses {
    public static void main(String[] args) {
//        Integer x = new Integer(3); Deprecated and marked for removal
        Integer x = Integer.valueOf(3); // Unnecessary boxing
        Integer a = 43; // The simplest method to create an Integer object it internally calls Integer.valueOf(); method

        int b = 3;
//        Integer c = Integer.valueOf("fdsafds"); Number format exception because only numbers inside double quotes are allowed

        Integer d = Integer.valueOf(324); // Boxing
        int e = d.intValue(); // Unboxing
        int f = d; // is equally correct! No need to do unboxing...

        Integer g = Integer.valueOf("10011", 2);
        Integer h = Integer.decode("001101");
        System.out.println(h);
        System.out.println(g);

        Float var1 = 3423.f / 0;
        System.out.println(var1.isInfinite());

        Float var2 = (float) Math.sqrt(-1);
        System.out.println(var2.isNaN());
        System.out.println(var2!=Float.NaN);

    }
}