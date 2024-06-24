package contabancaria;

import java.util.Scanner;

import contabancaria.entities.ContaBancaria;

public class Conta {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ContaBancaria contabancaria = new ContaBancaria("João", 500.00, 200.00);

        contabancaria.depositar(300.00);
        contabancaria.sacar(200.00);
        contabancaria.depositar(400.00);
        contabancaria.consultarSaldo();

        sc.close();

    }
}
