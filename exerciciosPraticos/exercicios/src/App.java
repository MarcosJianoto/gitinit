import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Dados dados = new Dados(6);

        System.out.println(dados.rolar());

        sc.close();

    }
}
