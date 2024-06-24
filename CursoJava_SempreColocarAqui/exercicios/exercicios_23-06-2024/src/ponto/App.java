package ponto;

public class App {
    public static void main(String[] args) throws Exception {

        Ponto2d a = new Ponto2d(3, 5);
        Ponto2d b = new Ponto2d(6, 7);

        a.calcularDistancia(b);
        System.out.println(a.calcularDistancia(b));

    }
}
