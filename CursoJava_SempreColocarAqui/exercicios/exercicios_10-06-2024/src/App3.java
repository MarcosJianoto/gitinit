import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App3 {
    public static void main(String[] args) throws Exception {
        /*
         * 10. **Remoção de Caracteres Duplicados:** Peça ao
         * usuário para inserir uma
         * string e remova todos os caracteres duplicados,
         * deixando apenas a primeira
         * ocorrência de cada caractere.
         */

        Scanner sc = new Scanner(System.in);

        String one = "Marcos Pedro Leticia";
        StringBuilder two = new StringBuilder();
        Set<Character> letrasExistentes = new HashSet<>();

        for (int i = 0; i < one.length(); i++) {
            char letraAtual = one.charAt(i);

            if (!letrasExistentes.contains(letraAtual)) {
                letrasExistentes.add(letraAtual);
                two.append(letraAtual);
            }

        }

        System.out.println(two.toString());

        sc.close();

    }
}
