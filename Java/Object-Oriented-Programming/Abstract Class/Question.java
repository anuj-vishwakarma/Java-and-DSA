/*6. Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape.*/

abstract class Shape3D{
    abstract public double calculateVolume();
    abstract public double calculateArea();
}
class Sphere extends Shape3D{
    private int radius;
    Sphere(int radius){
        this.radius = radius;
    }
     public double calculateVolume(){
         return  (double)( 4.0 / 3.0 )  * Math.PI * this.radius * this.radius * this.radius;
     }
    public double calculateArea(){
         return 4 * Math.PI * this.radius * this.radius;
    }
}
class Cube extends Shape3D{
    private int side;
    Cube (int side){
        this.side = side;
    }
    public double calculateVolume(){
        return Math.pow(side, 3);
    }
    public double calculateArea(){
        return 6 * Math.pow(side, 2);
    }
}

public class Question {
    public static void main(String[] args) {
        Shape3D sphere = new Sphere(2);
        System.out.println(sphere.calculateArea());
    }
}
