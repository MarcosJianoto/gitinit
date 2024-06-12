public class App {
    public static void main(String[] args) throws Exception {

        // 1. **Intercalação de Strings:** Peça ao usuário para inserir duas strings e
        // crie uma nova string intercalando os caracteres de ambas as strings.

        String a = "Marcos";
        String b = "João";
        String c = "";

        if (a.length() > b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (b.length() > i) {
                    c += a.charAt(i);
                    c += b.charAt(i);
                } else {
                    c += a.charAt(i);
                }

            }
            System.out.println(c);
        }

    }
}
