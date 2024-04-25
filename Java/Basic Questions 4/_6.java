import java.util.Scanner;
public class _6 {
    static float pi = 3.14159f;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        float radius = input.nextFloat();
        area(radius);
        circumference(radius);
    }
    static void area(float radius) {
        float area = pi * radius * radius;
        System.out.println("The area of circle is : " + area);
    }
    static void circumference(float radius) {
        float circumference = 2 * pi * radius;
        System.out.println("The circumference of circle is : " + circumference);
    }
}
