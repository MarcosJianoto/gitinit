package entities_carro;

public class Rodas {

    public Boolean rodas;
    public Carro carro;

    public Rodas(Boolean rodas, Carro carro) {
        this.rodas = rodas;
        this.carro = carro;
    }

    public Boolean getRodas() {
        return this.rodas;
    }

    public void setRodas(Boolean rodas) {
        this.rodas = rodas;
    }

    public Carro getCarro() {
        return this.carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void moviment(String movimento) {
        if (movimento.equals("esquerda")) {
            System.out.println("Carro virou a esquerda");
        } else if (movimento.equals("direita")) {
            System.out.println("Carro virou a direita");
        } else if (movimento.equals("parar")) {
            System.out.println("Carro parou");
        }

    }

}
