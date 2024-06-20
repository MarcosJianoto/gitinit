package entities_contaCorrente;

public class ContaCorrente {

    public String name;
    public Double saldo;

    public ContaCorrente(String name, Double saldo) {
        this.name = name;
        this.saldo = saldo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double value) {
        return saldo += value;
    }

    public double sacar(double value) {
        return saldo -= value;
    }

    public String toString() {
        return "O cliente " + name + " tem na conta: " + String.format("%.2f", saldo);
    }

}
