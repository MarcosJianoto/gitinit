import java.util.Random;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomic = random.nextInt(100);
        System.out.println("Randomic: " + randomic);

        int i = sc.nextInt();

        if (randomic == i) {
            System.out.println("Você descobriu! ");
        } else {

            while (true) {
                i = sc.nextInt();
                if (randomic == i) {
                    System.out.println("Você descobriu! ");
                    break;
                }
                continue;
            }

        }

        sc.close();

    }
}
