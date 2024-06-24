package contabancaria.entities;

public class ContaBancaria {

    private String titular;
    private double saldo;
    private double limiteSaque;

    public ContaBancaria(String titular, double saldo, double limiteSaque) {
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteSaque() {
        return this.limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void depositar(double deposit) {
        saldo += deposit;
    }

    public void sacar(double saque) {
        if (saque > limiteSaque) {
            System.out.println("não é possivel sacar esse valor");
        } else {
            saldo -= saque;
        }
    }

    public void consultarSaldo() {
        System.out.println(saldo);
    }
}
