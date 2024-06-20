package entities_imc;

public class Imc {

    public double altura;
    public double peso;

    public Imc(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void condicao() {

        double imc = peso / Math.pow(altura, 2);
        System.out.println("IMC: " + imc);

        if (imc < 16.9) {
            System.out.println("Muito abaixo do peso");
        } else if (imc >= 17 && imc <= 18.4) {
            System.out.println("Abaixo do peso");
        } else {
            System.out.println("Passou");
        }

    }

}
