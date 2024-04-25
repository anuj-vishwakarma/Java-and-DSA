class Super{
    void meth1() { System.out.println("meth1");}
    void meth2() { System.out.println("super meth2");}
}
class Sub1 extends  Super{
    @Override
    void meth1() { System.out.println("sub meth2");}
    void meth3() { System.out.println("meth3");}
}
public class Dynamic_method_dispatch_1 {
    public static void main(String[] args) {
        // Dynamic method dispatch:
        // It decides at runtime which method to call based on the object created dynamically using new keyword(that we've used
//        for creating the object below
//        Sub s = new Sup(); NOT ALLOWED
/*👉*/      Super s = new Sub1();
        s.meth1();
        s.meth2(); // overrided method of sub class is called because the object is made of sub class
//        s.meth3(); can't be called because using reference of the super class but the object is created of sub class and
//        since the reference is of super class only the super class methods can be called
    }
}
