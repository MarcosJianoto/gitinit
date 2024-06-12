public class App7 {
    public static void main(String[] args) throws Exception {

        // 6. **Alteração de Maiúsculas e Minúsculas:** Peça ao usuário para inserir uma
        // string e alterne as letras entre maiúsculas e minúsculas.

        StringBuilder sb = new StringBuilder();
        sb.append("João");
        sb.append(" ");
        sb.append("Pedro");
        System.out.println(sb.toString());

        sb.insert(4, "João");
        System.out.println(sb.toString());

        sb.replace(0, 10, "Larissa");
        System.out.println(sb.toString());
    }
}
