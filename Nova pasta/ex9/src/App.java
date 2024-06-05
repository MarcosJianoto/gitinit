import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many values? ");

        int n = sc.nextInt();
        PrintService ps = new PrintService();

        for (int i = 0; i < n; i++) {
            int digitPrint = sc.nextInt();
            ps.addValue(digitPrint);
        }

        ps.print();

        System.out.println("First: " + ps.first());

        sc.close();

    }
}
