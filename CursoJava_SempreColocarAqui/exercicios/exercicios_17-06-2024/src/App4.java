import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String usuarioAuth = "marcosbkmg";
        String senhaAuth = "senha123";

        System.out.println("Você deseja logar?");
        String logarSimNao = sc.nextLine();

        String logarSimNaoNoCaps = logarSimNao.toLowerCase();
        if (logarSimNaoNoCaps.equals("sim")) {
            String tentativa = sc.nextLine();
            String senhaTentativa;

            while (true) {
                if (tentativa.equals(usuarioAuth)) {
                    senhaTentativa = sc.nextLine();
                    if (senhaTentativa.equals(senhaAuth)) {
                        System.out.println("Você logou");
                        break;
                    } else {
                        System.out.println("Tente novamente");
                        continue;
                    }
                }
                tentativa = sc.nextLine();
                senhaTentativa = sc.nextLine();
            }

        }

        sc.close();

    }
}
