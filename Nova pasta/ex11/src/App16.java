import java.util.Random;
import java.util.Scanner;

public class App16 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma String");
        String name = "Marcos";

        System.out.println("Digite uma letra e um caractere");
        char charToRemove = 'o';

        String result = name.replace(Character.toString(charToRemove), name);

        sc.close();

    }

}
