import entities_carro.Carro;
import entities_carro.Rodas;

public class App_carro {
    public static void main(String[] args) throws Exception {

        Rodas rodas = new Rodas(true, new Carro("Palio"));
        rodas.moviment("direita");

    }
}
