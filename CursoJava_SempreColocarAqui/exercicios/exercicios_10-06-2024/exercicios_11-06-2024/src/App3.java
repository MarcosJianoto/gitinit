public class App3 {
    public static void main(String[] args) throws Exception {

        // 3. **Contagem de Caracteres Específicos:** Peça ao usuário para inserir uma
        // string e um caractere, e conte quantas vezes o caractere aparece na string.

        String a = "Marcos";
        String b = "a";
        int d = 0;

        for (int i = 0; i < a.length(); i++) {
            if (b.equals(Character.toString(a.charAt(i)))) {
                d++;
            }
        }
        System.out.println(d);

    }
}
