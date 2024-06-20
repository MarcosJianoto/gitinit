package entities_funcionarios.entities_funcionarios;

public class Gerente extends Padrao {

    public Double comissao;

    public Gerente(String name, Double salary, Cargos cargos, Double comissao) {
        super(name, salary, cargos);
        this.comissao = comissao;
    }

    public Double getComando() {
        return this.comissao;
    }

    public void setComando(Double comissao) {
        this.comissao = comissao;
    }

    public double calculoAMais(double value) {
        return salary += comissao;
    }

}
