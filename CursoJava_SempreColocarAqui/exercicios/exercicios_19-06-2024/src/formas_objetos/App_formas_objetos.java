package formas_objetos;

import formas_objetos.entities_formas_objetos.Quadrado;

public class App_formas_objetos {
    public static void main(String[] args) throws Exception {

        Quadrado quadrado = new Quadrado(10, 5);
        System.out.println(quadrado.area());
        System.out.println(quadrado.perimetro());

    }
}
