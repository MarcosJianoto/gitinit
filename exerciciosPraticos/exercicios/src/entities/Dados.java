package entities;

import java.util.Random;

public class Dados {

    private int numeroFaces;
    private Random random;

    public Dados(int numeroFaces) {
        this.numeroFaces = numeroFaces;
        random = new Random();
    }

    public int rolar() {
        return random.nextInt(numeroFaces) + 1;
    }

}
