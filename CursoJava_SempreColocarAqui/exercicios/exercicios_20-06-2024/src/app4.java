import java.util.Locale;
import java.util.Scanner;

public class app4 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // utilizar o for para verificar anos bissexto;

        int ano = sc.nextInt();

        for (int i = ano; ano > 0; ano--) {

            if (ano % 4 == 0 && ano % 400 != 0) {
                System.out.println("Ano bissexto:" + ano);
            } else {
                System.out.println("Não é bissexto: " + ano);
            }
        }

        sc.close();

    }
}
