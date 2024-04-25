class Car{
public void start(){System.out.println("Car Started");}
public void accelerate() { System.out.println("Car is Accelerated");}
public void changeGear() { System.out.println("Car Gear Changed"); }
}
class LuxaryCar extends Car {
    public void changeGear() {System.out.println("Automatic Gear");}
    public void openRoof() {System.out.println("Sun Roof is Opened");}
}

    public class Example2_Method_Overriding {
        public static void main(String[] args) {
            Car cr = new Car();
            cr.start();
            cr.accelerate();
            cr.changeGear();
            System.out.println("");
            LuxaryCar c = new LuxaryCar();
            c.start();
            c.accelerate();
            c.changeGear(); // the original change gear method which was inherited form super class has now been overridden
            // i.e. the original change gear method has been shadowed
            c.openRoof();

            System.out.println("");
            Car car = new LuxaryCar();

//            car.openroof(); is not available because we're using the reference of old car
            car.accelerate();
            car.start();
            car.changeGear();// it will change gear according to the object, which is here of LuxuryCar so, Luxury car's gear will be changed
        }
    }

