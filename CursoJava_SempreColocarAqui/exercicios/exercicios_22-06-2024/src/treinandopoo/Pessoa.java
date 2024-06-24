package treinandopoo;

public class Pessoa {

    public String name;
    public int idade;
    public String profissao;

    public Pessoa(String name, int idade, String profissao) {
        this.name = name;
        this.idade = idade;
        this.profissao = profissao;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void aniversario() {
        idade++;
    }

    public String toString() {
        return "Name: " + name + ", Idade: " + idade + " Profissão: " + profissao;
    }

}
