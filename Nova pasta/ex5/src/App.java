import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.EuaInterestService;
import services.NterestService;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor inicial: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        NterestService is = new EuaInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + "months: ");
        System.out.println(String.format("%.2f", payment));

        sc.close();

    }
}
