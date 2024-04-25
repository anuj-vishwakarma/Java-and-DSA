import java.util.concurrent.CyclicBarrier;

class Cylinder{
    private double radius;
    private double height;

    public Cylinder(){
        radius = 1;
        height = 1;
    }
    public void setRadius( double r) {
        radius = r;
    }
    public void setHeight(double h) {
        height = h;
    }
    public double getRadius() {
        if(radius<0)
            return (-1) * radius;
        else
            return radius;
    }
    public double getHeight() {
        if(height<0)
            return (-1) * height;
        else
            return height;
    }
    public double volume() {
        return Math.PI * getRadius() * getRadius() * getHeight();
    }
    public double CSA() {
        return 2 * Math.PI * getRadius() * getHeight();
    }
    public double TSA() {
        return ((2 * Math.PI * getRadius()) * (getHeight() + getRadius()));
    }
}
public class Data_Hiding_1 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setHeight(1);
        c.setRadius(1);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());
        System.out.println(c.CSA());
        System.out.println(c.TSA());
        System.out.println(c.volume());

    }
}
