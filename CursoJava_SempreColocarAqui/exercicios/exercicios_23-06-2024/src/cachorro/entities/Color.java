package cachorro.entities;

public class Color {

    private String color;

    public Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
                " color='" + getColor() + "'" +
                "}";
    }

}
