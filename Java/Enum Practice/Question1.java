// 1. Write a Java program to create an enum called "DaysOfWeek" representing the days of the week.
import java.util.Arrays;

/**
 * @author Anuj Vishwakarma
 * @version 1.0.0.00
 * @since April 27, 2024
 */
public class Question1 {
    enum DaysOfWeek{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        public void getDaysOfWeek(){
            System.out.println(Arrays.toString(DaysOfWeek.values()));
        }
		public void getDay(){
			System.out.println(this);
		}
		public void getDayFromIndex(int index){
			DaysOfWeek [] list = DaysOfWeek.values();
			if(index>=1)
				System.out.println(list[index-1]);	
			else 
				System.out.println("Invalid Input");
		}
    }
    public static void main(String[] args) {
        DaysOfWeek d = DaysOfWeek.Monday;
        d.getDaysOfWeek();
		d.getDay();
		d.getDayFromIndex(3);
    }
	
}
