package entities;

public class Employee implements Comparable<Employee> {

    private String name;
    private Double salary;

    public Employee(String name, Double Salary) {
        this.name = name;
        this.salary = Salary;
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

    public void setSalary(Double Salary) {
        this.salary = Salary;
    }

    @Override
    public int compareTo(Employee other) {
        return salary.compareTo(other.getSalary());
    }

}
