import java.util.Locale;
import java.util.Scanner;

import entities.People;
import entities.peso;

public class IMC {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu peso? ");
        double weight = sc.nextDouble();

        System.out.println("Qual sua altura? ");
        double height = sc.nextDouble();

        People people = new People(weight, height);
        if (people.calc(weight, height) < 16) {
            System.out.println(peso.BAIXO_PESO);
        } else if (people.calc(weight, height) > 16 && people.calc(weight, height) < 16.99) {
            System.out.println(peso.PESO_NORMAL);
        } else if (people.calc(weight, height) > 16 && people.calc(weight, height) < 16.99) {
            System.out.println(peso.PESO_NORMAL);
        } else {
            System.out.println(peso.OBESIDADE);
        }

        sc.close();

    }
}
