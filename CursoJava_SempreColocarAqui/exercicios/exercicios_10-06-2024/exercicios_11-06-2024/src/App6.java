public class App6 {
    public static void main(String[] args) throws Exception {

        // 6. **Alteração de Maiúsculas e Minúsculas:** Peça ao usuário para inserir uma
        // string e alterne as letras entre maiúsculas e minúsculas.

        String digit = "Marcos";
        String dois = "";
        for (int i = 0; i < digit.length(); i++) {
            String variavelOpcinal = Character.toString(digit.charAt(i));

            if (variavelOpcinal.equals(variavelOpcinal.toLowerCase())) {
                variavelOpcinal.toUpperCase();
                dois += variavelOpcinal;
            } else {
                variavelOpcinal.toLowerCase();
                dois += variavelOpcinal;
            }
        }

        System.out.println(dois);

    }
}
