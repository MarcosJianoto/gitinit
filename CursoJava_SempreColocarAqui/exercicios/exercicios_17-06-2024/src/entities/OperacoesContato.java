package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacoesContato {

    public List<Contato> list = new ArrayList<>();

    public void listAdicionar(Contato contato) {
        list.add(contato);
    }

    public void listRemove(int posicao) {
        if (list.isEmpty()) {
            System.out.println("Lista vazia nao pode remover");
        }
        list.remove(posicao);
    }

    public void listBusca(int posicao) {
        if (list.isEmpty()) {
            System.out.println("ERROR");
        }
        list.get(posicao);
    }

    public void editContato(int posicao) {
        if (list.isEmpty()) {
            System.out.println("inútil");
            return;
        }

        if (posicao < 0 || posicao >= list.size()) {
            System.out.println("Posição invalida");
            return;
        }

        Contato contato = list.get(posicao);
        Scanner sc = new Scanner(System.in);

        System.out.println("O que voce deseja editar?");
        System.out.println("1. Nome");
        System.out.println("2. Telefone");
        System.out.println("3. Email");
        int escolha = sc.nextInt();
        sc.nextLine();

        switch (escolha) {
            case 1:
                System.out.println("Digite o novo nome: ");
                String novoNome = sc.nextLine();
                contato.setName(novoNome);
                break;
            case 2:
                System.out.println("Digite o novo telefone: ");
                String novoTelefone = sc.nextLine();
                contato.setTelefone(novoTelefone);
                break;
            case 3:
                System.out.println("Digite o novo email: ");
                String novoEmail = sc.nextLine();
                contato.setTelefone(novoEmail);
                break;
            default:
                System.out.println("Escolha inválida.");
                break;
        }
        System.out.println("Contato editado com sucesso.");

    }

    public Contato toString(int posicao) {
        return list.get(posicao);
    }

}
