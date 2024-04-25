
class CoffeeMachine
{
    private float coffeQty, milkQty, waterQty, sugarQty;
    static private CoffeeMachine my=null;
    static int count = 0;
    private CoffeeMachine(){
        coffeQty=1;
        milkQty=1;
    }
    public float getCoffee(){
        return 0.15f;
    }

    static CoffeeMachine getInstance(){
        count++;
        if (count < 5) {
                my = new CoffeeMachine();
        }

        return my;
    }
}
public class Singleton{
    public static void main(String[] args){
        CoffeeMachine m1=CoffeeMachine.getInstance();
        CoffeeMachine m2=CoffeeMachine.getInstance();
        CoffeeMachine m3=CoffeeMachine.getInstance();
        CoffeeMachine m4=CoffeeMachine.getInstance();
        CoffeeMachine m5=CoffeeMachine.getInstance();
        CoffeeMachine m6=CoffeeMachine.getInstance();
        CoffeeMachine m7=CoffeeMachine.getInstance();


        System.out.println(m1+" "+m2+" "+m3 + m4+" "+m5+" "+m6);
        if(m6==m7)
            System.out.println("Same");

    }
}