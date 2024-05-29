import java.util.Locale;
import java.util.Scanner;

public class calculadoraTemp {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura:  ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Qual tipo de temperatura é? c/f/k (celcius/farenheit/kevin) ");
        String temp = sc.nextLine();
        double temperatura;

        if (temp.equals("c")) {
            System.out.println("Você escolheu Celcius");
            System.out.println("Gostaria de transformar em Farenheit ou Kevin?f/k");
            String converter = sc.nextLine();
            if (converter.equals("f")) {
                temperatura = (1.8 * n) + 32;
                System.out.println(temperatura);
            } else if (converter.equals("k")) {
                temperatura = n + 273.15;
                System.out.println(temperatura);
            }
        } else if (temp.equals("f")) {
            System.out.println("Você escolheu Farenheit");
            System.out.println("Gostaria de transformar em Celcius ou Kevin?c/k");
            String converter = sc.nextLine();
            if (converter.equals("c")) {
                temperatura = (n - 32) * 1.8;
                System.out.println(temperatura);
            } else if (converter.equals("k")) {
                temperatura = (n - 32) * 1.8;
                double temperaturaKelvin = temperatura + 273.15;
                System.out.println(temperaturaKelvin);
            }
        } else {
            System.out.println("Você escolheu Kelvin");
            System.out.println("Gostaria de transformar em Celcius ou Farenheit?c/f");
            String converter = sc.nextLine();
            if (converter.equals("c")) {
                temperatura = (1.8 * (n - 273)) + 32;
                double temperaturaCelcius = (n - 32) * 1.8;
                System.out.println(temperaturaCelcius);
            } else if (converter.equals("f")) {
                temperatura = (1.8 * (n - 273)) + 32;
                System.out.println(temperatura);
            }
        }

        sc.close();

    }
}
