import java.util.Random;
import java.util.Scanner;

public class App5 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int[] vect = new int[] { 9, 8, 4, 6, 3 };
        int[] vectNew = new int[vect.length];

        int menorNumer;
        for (int i = 0; i < vect.length; i++) {
            menorNumer = vect[0];
            if (menorNumer > vect[i]) {
                menorNumer = vect[i];
            }
            vectNew[0] = menorNumer;
            if (i + 1 < vect.length) {
                vectNew[i + 1] = vect[i];
            }

        }
        for (int x : vect) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("new");
        for (int x : vectNew) {
            System.out.print(x + " ");
        }

        sc.close();

    }
}
