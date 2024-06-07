import java.util.Random;
import java.util.Scanner;

public class App12 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("converter celcius em fahrenheit, digite o valor: ");
        Random random = new Random();
        int numberRandom = random.nextInt(100 + 1);
        double conversor = numberRandom * 1.8 + 32;

        System.out.println(numberRandom + " Celcius " + "é igual a " + String.format("%.2f", conversor) + " Farenheit");

        sc.close();
    }
}
