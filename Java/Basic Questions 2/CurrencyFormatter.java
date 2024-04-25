import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;
public class CurrencyFormatter {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int  moneyINR  = input.nextInt();

        System.out.println("This will just format the indian currency to US, without taking care of exchange rates");
        Locale localeUS = new Locale ("en", "US");

        NumberFormat moneyUS = NumberFormat.getCurrencyInstance(localeUS);
        System.out.println(moneyUS.format(moneyINR));

        System.out.println("THis will actually change the INR Money to US:");
        float usMoney = (float)moneyINR * 0.014f;
        NumberFormat usMoneyFormatted= NumberFormat.getCurrencyInstance(localeUS);
        System.out.println(usMoneyFormatted.format(usMoney));

    }
}
