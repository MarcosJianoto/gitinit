package deckCartas.entities;

public class Carta {

    public String valor;
    public String naipe;

    public Carta(String valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public String getValor() {
        return this.valor;
    }

    public String getNaipe() {
        return this.naipe;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }

}
