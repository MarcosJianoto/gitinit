import java.util.Random;
import java.util.Scanner;

public class App13 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        double result = Math.pow(number1, number2);
        System.out.println(result);

        sc.close();
    }
}
