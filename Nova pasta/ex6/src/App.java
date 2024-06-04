import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestRate;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Months: ");
        int months = sc.nextInt();

        System.out.println("Payment after 3 months: ");
        InterestRate is = new BrazilInterestService(2.0);

        double payment = is.payment(amount, months);
        System.out.println(payment);

        sc.close();

    }
}
