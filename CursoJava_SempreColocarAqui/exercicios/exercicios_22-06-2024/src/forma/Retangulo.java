package forma;

public class Retangulo {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
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
        double calc = Math.pow(altura, 2) + Math.pow(base, 2);
        return calc;
    }

    public void eQuadrado() {
        if (base == altura) {
            System.out.println("é Quadrado");
        } else {
            System.out.println("é um retângulo");
        }
    }

}
