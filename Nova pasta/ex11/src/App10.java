import java.util.Random;
import java.util.Scanner;

public class App10 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // verificação de paridade
        System.out.println("Digite um numero para saber se é par ou impar: ");
        int number = sc.nextInt();

        while (true) {
            if (number % 2 == 0) {
                System.out.println("par");
            } else {
                System.out.println("impar");
            }
            number = sc.nextInt();
        }

    }
}
