import java.util.Scanner;

import forma.Retangulo;

public class Forma {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo(5, 5);

        System.out.println(retangulo.area());
        System.out.println(retangulo.perimetro());
        retangulo.eQuadrado();

        sc.close();

    }
}
