public class App2 {
    public static void main(String[] args) throws Exception {

        // 2. **Repetição de Caracteres:** Peça ao usuário para inserir uma string e um
        // número, e repita cada caractere da string o número especificado de vezes.

        String a = "Marcos";
        int b = 3;
        String c = "";

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b; j++) {
                c += a.charAt(i);
            }
        }
        System.out.println(c);

    }
}
