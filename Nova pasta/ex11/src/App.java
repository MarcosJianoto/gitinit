import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int n = 2;
        int m = 3;
        int[][] vect = new int[n][m];

        System.out.println("Digite os valores: ");
        for (int i = 0; i < n; i++) {
            Random gerador = new Random();
            for (int j = 0; j < m; j++) {
                vect[i][j] = gerador.nextInt(30 + 1);// isso significa entre 1 e 30
            }
        }

        System.out.println("verificar matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(vect[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transposta");
        int[][] transposta = new int[vect[0].length][vect.length];
        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[0].length; j++) {
                transposta[i][j] = vect[j][i];
            }
        }

        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[0].length; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

    }
}
