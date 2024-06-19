
import java.util.Scanner;

public class App6_notas {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Sua nota em Matemática?");
        double nota1 = sc.nextInt();

        System.out.println("Sua nota em Portugues?");
        double nota2 = sc.nextInt();

        System.out.println("Sua nota em Ingles?");
        double nota3 = sc.nextInt();

        System.out.println("Sua nota em História?");
        double nota4 = sc.nextInt();

        System.out.println("Sua nota em Geografia?");
        double nota5 = sc.nextInt();

        double[] vect = new double[] { nota1, nota2, nota3, nota4, nota5 };
        double media = 0;
        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];
        }
        System.out.println(media = soma / 5);

        sc.close();
    }
}
