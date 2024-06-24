import java.util.Locale;
import java.util.Scanner;

public class app7 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer qual numero para ser elevado por uma potencia? ");
        int n = sc.nextInt();
        System.out.println("Você quer que ele seja elevado por qual potencia? ");
        int m = sc.nextInt();
        double result = 0;

        if (m <= 0) {
            System.out.println("Erro, numero menor que 0");
        } else {
            result = Math.pow(n, m);
            System.out.println(result);
        }

        sc.close();

    }
}
