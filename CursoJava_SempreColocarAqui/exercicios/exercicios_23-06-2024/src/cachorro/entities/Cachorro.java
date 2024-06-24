package cachorro.entities;

public class Cachorro {

    private String name;
    private String race;
    private int idade;

    private Color color;

    public Cachorro(String name, String race, int idade, Color color) {
        this.name = name;
        this.race = race;
        this.idade = idade;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return this.race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String latir() {
        return "latir";
    }

    public String comer() {
        return "latir";
    }

    public String brincar() {
        return "brincar";
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", race='" + getRace() + "'" +
                ", idade='" + getIdade() + "," + getColor() + "'" +
                "}";
    }

}
