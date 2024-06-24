import java.util.Locale;
import java.util.Scanner;

public class CalculadoraCValidacao {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora que será as 4 operações : ");
        System.out.println("Digite dois números para o calculo :");

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        sc.close();

    }
}
