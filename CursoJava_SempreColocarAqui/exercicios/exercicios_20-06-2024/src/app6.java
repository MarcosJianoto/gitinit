import java.util.Locale;
import java.util.Scanner;

public class app6 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual numero voce quer a tabuada? ");
        int n = sc.nextInt();
        System.out.println("Queres até qual numero multiplicado pelo seu numero? ");
        int m = sc.nextInt();

        for (int i = 0; i <= m; i++) {
            int calc = i * n;
            System.out.printf("%d * %d = " + calc, n, i);
            System.out.println();
        }

        sc.close();

    }
}
