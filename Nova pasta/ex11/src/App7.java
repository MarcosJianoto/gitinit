import java.util.Random;
import java.util.Scanner;

public class App7 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int[] vect = new int[] { 9, 8, 4, 6, 3 };
        int[] vectNew = new int[vect.length];

        int menorNumer;
        int menorNumero2 = 0;
        for (int i = 0; i < vect.length; i++) {

            for (int j = 0; j < vect.length; j++) {
                menorNumer = vect[i];
                if (menorNumer < vect[i]) {
                    menorNumero2 = vect[i];
                }
            }
            vectNew[i] = menorNumero2;

        }

        for (int x : vectNew) {
            System.out.print(x + " ");
        }

        sc.close();

    }
}
