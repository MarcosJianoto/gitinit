import java.util.Scanner;

import treinandopoo.Pessoa;

public class TreinandoPoo {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String name = "Marcos";
        int idade = 10;
        String profissao = "Marceneiro";
        Pessoa pessoa = new Pessoa(name, idade, profissao);

        pessoa.aniversario();

        System.out.println(pessoa.getIdade());

        pessoa.aniversario();

        System.out.println(pessoa.getIdade());

        System.out.println(pessoa.getProfissao());

        sc.close();

    }
}
