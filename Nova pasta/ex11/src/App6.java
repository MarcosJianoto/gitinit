import java.util.Random;
import java.util.Scanner;

public class App6 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int[] vect = new int[] { 9, 8, 4, 6, 3 };
        int[] vectNew = new int[vect.length];

        int menorNumer = 0;
        int menorNumero2 = 0;

        for (int i = 0; i < vect.length; i++) {
            int menor = 0;
            for (int j = 0; j < vect.length; j++) {
                if (vect[j] > menor) {
                    menor = vect[i];
                }
                vectNew[i] = menor;
            }
        }

        for (int i = 0; i < vectNew.length; i++) {
            System.out.println(vectNew[i]);
        }

        sc.close();

    }
}
