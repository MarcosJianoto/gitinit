public class App5 {
    public static void main(String[] args) throws Exception {

        // 5. **Expansão de Ranges:** Peça ao usuário para inserir uma string contendo
        // ranges (por exemplo, "a-c") e expanda os ranges na string (por exemplo,
        // "abc").

        String a = "a-c";
        StringBuilder resultado = new StringBuilder();

        int i = 0;
        while (i < a.length()) {
            char currentChar = a.charAt(i);

            if (i + 2 < a.length() && a.charAt(i + 1) == '-' && Character.isLetterOrDigit(a.charAt(+2))) {
                char endChar = a.charAt(i + 2);
                if (currentChar <= endChar) {
                    for (char c = currentChar; c <= endChar; c++) {
                        resultado.append(c);
                    }
                    i += 3;
                } else {
                    resultado.append(currentChar);
                    i++;
                }
            } else {
                resultado.append(currentChar);
                i++;
            }

        }

    }
}
