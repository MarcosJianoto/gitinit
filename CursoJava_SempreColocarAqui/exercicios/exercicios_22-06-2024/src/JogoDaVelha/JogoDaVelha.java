package JogoDaVelha;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) throws Exception {

        Campo[][] velha = new Campo[3][3];
        char simboloAtual = 'X';
        Boolean game = true;
        String vitoria = "";
        Scanner sc = new Scanner(System.in);

        iniciarJogo(velha);

        while (game == true) {
            desenhaJogo(velha);
            vitoria = verificaVitoria(velha);
            if (!vitoria.equals("")) {
                System.out.printf("Jogador %s venceu%n", vitoria);
                break;
            }
            try {
                if (verificarJogada(velha, jogar(sc, simboloAtual), simboloAtual)) {
                    if (simboloAtual == 'X') {
                        simboloAtual = 'O';
                    } else {
                        simboloAtual = 'X';
                    }
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Fim do jogo!");

    }

    public static void desenhaJogo(Campo[][] velha) {
        // limparTela();
        System.out.println("   0    1    2 ");
        System.out.printf("0   %c | %c | %c %n ", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(),
                velha[0][2].getSimbolo());
        System.out.println("  ------------");
        System.out.printf("1   %c | %c | %c %n ", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(),
                velha[1][2].getSimbolo());
        System.out.println("  ------------");
        System.out.printf("2   %c | %c | %c %n ", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(),
                velha[2][2].getSimbolo());
    }

    public static void limparTela() {
        for (int i = 0; i < 200; i++) {
            System.out.println("");
        }
    }

    public static int[] jogar(Scanner sc, char simboloAtual) {
        int p[] = new int[2];
        System.out.printf("%s %c%n", "Quem joga: ", simboloAtual);
        System.out.print("Informa a linha ");
        p[0] = sc.nextInt();
        System.out.print("Informa a coluna ");
        p[1] = sc.nextInt();
        return p;
    }

    public static boolean verificarJogada(Campo[][] velha, int p[], char simboloAtual) {
        if (velha[p[0]][p[1]].getSimbolo() == ' ') {
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        } else {
            return false;
        }
    }

    public static void iniciarJogo(Campo[][] velha) {
        for (int i = 0; i < 3; i++) {
            for (int c = 0; c < 3; c++) {
                velha[i][c] = new Campo();
            }
        }
    }

    public static String verificaVitoria(Campo[][] velha) {
        return "";
    }

}
