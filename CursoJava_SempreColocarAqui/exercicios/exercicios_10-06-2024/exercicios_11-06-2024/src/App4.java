public class App4 {
    public static void main(String[] args) throws Exception {

        // 4. **Remoção de Substring:** Peça ao usuário para inserir uma string e uma
        // substring, e remova todas as ocorrências da substring na string original.

        String a = "Marcos";
        String b = "a";
        String c = "";

        for (int i = 0; i < a.length(); i++) {
            if (!b.equals(Character.toString(a.charAt(i)))) {
                c += a.charAt(i);
            }
        }
        

        System.out.println(c);

    }
}
