// 2. Write a Java program to create an enum called "Weekend" with constants representing the days of the weekend.
import java.util.Arrays;

public class Question2{
	enum Weekend{
			SATURDAY, 
			SUNDAY;
			public void getDaysOfWeekend(){
				System.out.println(Arrays.toString(Weekend.values()));
			}
		}
	public static void main(String [] args){
		Weekend w = Weekend.SATURDAY;
		w.getDaysOfWeekend();
		
	}
}