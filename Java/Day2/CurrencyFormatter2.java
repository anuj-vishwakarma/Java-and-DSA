import java.lang.*;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;
class CurrencyFormatter2 {
	public static void main (String [] args)
		{
			Scanner input = new Scanner (System.in);

			int moneyINR = input.nextInt();

			Locale LocaleUS = new Locale("en", "US");

			NumberFormat moneyUS = NumberFormat.getCurrencyInstance(LocaleUS);

			System.out.println(moneyUS.format(moneyINR * 0.012));
			input.close();
	}
}