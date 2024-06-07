import java.util.Random;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual salário você recebe?");
        double salary = sc.nextDouble();
        double salaryWithTax = salary;
        double tax = 0;
        if (salary > 0 && salary < 2000.00) {
            System.out.println("Isento");
        } else if (salary > 2000.00 && salary < 3000.00) {
            tax = salary * 0.08;
            salaryWithTax += tax;
        } else if (salary > 3000.00 && salary < 4500.00) {
            tax = salary * 0.18;
            salaryWithTax += tax;
        } else if (salary > 4500.00) {
            tax = salary * 0.28;
            salaryWithTax += tax;
        }

        System.out.println(salaryWithTax);

        sc.close();

    }
}
