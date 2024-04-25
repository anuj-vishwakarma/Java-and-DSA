
class LowBalanceException extends Exception {
    @Override
    public String toString () {
        return "Balance should not be less than 5000";
    }
}
public class DemoExceptions {
    static void fun1() throws LowBalanceException{

            throw new LowBalanceException();


    }
    static void fun2() throws LowBalanceException{
        fun1();
    }
    static void fun3() throws LowBalanceException{
        fun2();
    }
    public static void main(String[] args) {
        try {
            fun3();
        }
        catch (LowBalanceException e){
            System.out.println(e);
        }
        finally {
            System.out.println("not gonna lie");
        }
    }
}
