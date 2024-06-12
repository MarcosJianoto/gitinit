import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        /*
         * 4. **Intercalação de Strings:** Peça ao usuário para inserir duas strings e
         * intercale seus caracteres (por exemplo, se as strings forem "abc" e "123", o
         * resultado deve ser "a1b2c3").
         */

        String one = "Marcos";
        String two = "Pedrfasffsafssaffsao";
        String tree = "";
        if (one.length() > two.length()) {
            for (int i = 0; i < one.length(); i++) {
                if (i < two.length() && i < one.length()) {
                    tree += one.charAt(i);
                    tree += two.charAt(i);
                } else if (i < one.length() && i > two.length()) {
                    tree += one.charAt(i);
                } else if (i > one.length() && i < two.length()) {
                    tree += two.charAt(i);
                }
            }
        } else if (one.length() < two.length()) {
            for (int i = 0; i < two.length(); i++) {
                if (i < two.length() && i < one.length()) {
                    tree += one.charAt(i);
                    tree += two.charAt(i);
                } else if (i < one.length() && i > two.length()) {
                    tree += one.charAt(i);
                } else if (i > one.length() && i < two.length()) {
                    tree += two.charAt(i);
                }
            }
        }

        System.out.println(tree);

        sc.close();

    }
}
