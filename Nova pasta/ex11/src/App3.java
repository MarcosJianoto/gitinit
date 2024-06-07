import java.util.Random;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double a, b, c;
        Random random = new Random();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        }

        if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
            System.out.println("TRIANGULO RETANGULO");
        }

        if (a * a < (b * b + c * c)) {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (a * a > (b * b + c * c)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }

        if (a == b && a != c || a == c && a != b || b == c && b != a) {
            System.out.println("TRIANGULO ISOSCELES");
        }

        if (a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        }

    }
}
