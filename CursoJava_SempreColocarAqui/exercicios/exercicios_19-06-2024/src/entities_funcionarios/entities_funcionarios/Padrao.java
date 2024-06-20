package entities_funcionarios.entities_funcionarios;

public class Padrao {

    public String name;
    public Double salary;
    public Cargos cargos;

    public Padrao(String name, Double salary, Cargos cargos) {
        this.name = name;
        this.salary = salary;
        this.cargos = cargos;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
