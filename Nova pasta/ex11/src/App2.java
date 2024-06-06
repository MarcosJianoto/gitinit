import java.util.Random;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {

        int n = 2;
        int m = 3;
        int[][] vect = new int[n][m];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                vect[i][j] = random.nextInt(30 + 1);
            }
        }

        System.out.println("Matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(vect[i][j]);
            }
        }

    }
}
