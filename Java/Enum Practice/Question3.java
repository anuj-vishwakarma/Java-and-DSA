// 3. Write a Java program to implement an enum called "Shape" with constants representing different geometric shapes.

import java.lang.Math;
import java.util.Arrays;

class Question3{

	enum Shape{
		TRIANGLE, CIRCLE, CYLINDER;

		public void getShapes(){
			System.out.println(Arrays.toString(Shape.values()));
		}
		public void getAreaOfTriangle(int height, int base){
			System.out.println(0.5 * base * height);
		}	

		public void getAreaOfCircle(int radius){
			System.out.println(Math.PI * radius * radius);		
		}
		public void getAreaOfCylinder(int radius, int height){
			System.out.println(2 * Math.PI * radius * radius + 2 * Math.PI * radius * height);
		}
	}

	@interface Interface{
		String name ();
	}
	public static void main(String [] args){
		Shape s = Shape.TRIANGLE; 
		s.getShapes();
		s.getAreaOfTriangle(10, 10);
		s.getAreaOfCircle(7);
		s.getAreaOfCylinder(7, 2);
	}
}