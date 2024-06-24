import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String texto = "texto padrão teste";
        String[] palavras = texto.split(" ");
        char[] letras = texto.toCharArray();

        int numeroPalavras = palavras.length;

        int numeroVogais = 0;
        String[] vogais = { "a", "e", "i", "o", "u" };

        for (char letra : letras) {
            for (String vogal : vogais) {
                if (letra == vogal.charAt(0)) {
                    numeroVogais++;
                }
            }

        }

        System.out.println("Numero palavras: " + numeroPalavras);
        System.out.println("Numero vogais: " + numeroVogais);

        sc.close();

    }
}
