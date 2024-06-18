
import java.util.Scanner;

import entities.PrintService;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        PrintService<String> ps = new PrintService<>();

        System.out.println("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String m = sc.next();
            ps.addValue(m);
        }

        ps.print();
        String x = ps.first();
        System.out.print("First: ");
        System.out.println(ps.first());

        sc.close();

    }
}