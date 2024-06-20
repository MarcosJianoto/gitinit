package entities_contaCorrente;
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Nome do cliente: ");
        String name = "João";
        System.out.println("Saldo inicial");
        double saldo = 500.00;

        ContaCorrente contaCorrente = new ContaCorrente(name, saldo);

        contaCorrente.sacar(300.00);
        System.out.println(contaCorrente);

    }
}
