import java.util.Random;
import java.util.Scanner;

public class App15 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String name = "Ana";
        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(0) == name.charAt(name.length()))
                System.out.println(name.charAt(i));
        }

        sc.close();

    }

}
