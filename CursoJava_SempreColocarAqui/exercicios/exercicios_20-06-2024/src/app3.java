import java.util.Locale;
import java.util.Scanner;

public class app3 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double a = sc.nextDouble();
        if (a < 0) {
            System.out.println("negativo");
        }

        sc.close();

    }
}
