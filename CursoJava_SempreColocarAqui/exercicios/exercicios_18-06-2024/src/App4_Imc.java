import java.util.Locale;
import java.util.Scanner;

import entities_imc.Imc;

public class App4_Imc {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        // TABUADA magica...
        Scanner sc = new Scanner(System.in);

        double altura = sc.nextDouble();
        double peso = sc.nextDouble();

        Imc imc = new Imc(altura, peso);
        imc.condicao();

        sc.close();
    }
}
