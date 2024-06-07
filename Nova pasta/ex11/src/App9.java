import java.util.Random;
import java.util.Scanner;

public class App9 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // calculo de média
        System.out.println("Quantas notas? ");
        int quantidadeNotas = 3;
        System.out.printf("Digite %d notas: ", quantidadeNotas);
        int[] vect = new int[quantidadeNotas];

        for (int i = 0; i < quantidadeNotas; i++) {

            vect[i] = sc.nextInt();
        }

        int soma = 0;
        int media = 0;
        for (int i = 0; i < quantidadeNotas; i++) {
            soma += vect[i];
        }

        media = soma / quantidadeNotas;
        System.out.println(media);

        sc.close();

    }
}
