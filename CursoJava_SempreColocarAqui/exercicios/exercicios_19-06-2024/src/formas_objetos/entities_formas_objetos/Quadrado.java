package formas_objetos.entities_formas_objetos;

public class Quadrado {

    public double base;
    public double altura;

    public Quadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return altura + altura + base + base;
    }

}
