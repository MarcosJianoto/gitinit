import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos números você gostaria de calcular: ");
        int quantosN = sc.nextInt();
        double[] vect = new double[quantosN];

        for (int i = 0; i < quantosN; i++) {
            System.out.printf("Digite o %dnº numero: ", i + 1);
            int digit = sc.nextInt();
            vect[i] = digit;
        }

        int multiplicando = 1;
        for (int i = 0; i < quantosN; i++) {

            multiplicando *= vect[i];
        }

        System.out.println(multiplicando);

        sc.close();

    }
}
