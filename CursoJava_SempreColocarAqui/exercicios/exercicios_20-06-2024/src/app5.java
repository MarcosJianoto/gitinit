import java.util.Locale;
import java.util.Scanner;

public class app5 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // utilizar o for para verificar anos bissexto;

        double nota1 = sc.nextDouble();
        System.out.print("Peso nota 1: ");
        int peso1 = sc.nextInt();

        double nota2 = sc.nextDouble();
        System.out.print("Peso nota 2: ");
        int peso2 = sc.nextInt();

        double nota3 = sc.nextDouble();
        System.out.print("Peso nota 3: ");
        int peso3 = sc.nextInt();

        System.out.println("A média ponderada é: ");
        double nota1ComPeso = nota1 * peso1;
        double nota2ComPeso = nota2 * peso2;
        double nota3ComPeso = nota3 * peso3;
        int pesoPDivisao = peso1 + peso2 + peso3;

        double mediaPonderada = (nota1ComPeso + nota2ComPeso + nota3ComPeso) / pesoPDivisao;
        System.out.println(mediaPonderada);

        sc.close();

    }
}
