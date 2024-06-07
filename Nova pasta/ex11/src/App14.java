import java.util.Random;
import java.util.Scanner;

public class App14 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        double[] vect = new double[10];
        System.out.println("Digite 10 numeros: ");
        for (int i = 0; i < vect.length; i++) {
            vect[i] = random.nextInt(101);
        }

        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }

        System.out.println();

        System.out.println("Qual numero gostaria de procurar?");
        double numberExist = random.nextDouble(101);

        while (true) {
            boolean found = false;

            for (int i = 0; i < vect.length; i++) {
                if (numberExist == vect[i]) {
                    System.out.println(" O numero existe: " + numberExist + " ------ " + vect[i]);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            } else {
                numberExist = random.nextInt(101);
            }

        }
        sc.close();

    }

}
