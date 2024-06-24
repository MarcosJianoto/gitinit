import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int n = random.nextInt(5);
        System.out.println("Digite um numero entre 1 e 5: ");
        int numeroEscolha = sc.nextInt();

        while (n != numeroEscolha) {

            if (numeroEscolha < n) {
                System.out.println("Menor do que o numero escolhido pelo pc");
            } else if (numeroEscolha > n) {
                System.out.println("Maior do que o numero escolhido");
            }
            numeroEscolha = sc.nextInt();

            sc.close();
        }
        if (numeroEscolha == n) {
            System.out.println("Acertou!");
        }

    }
}
