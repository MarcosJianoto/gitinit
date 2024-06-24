package ponto;

import java.util.Objects;

public class Ponto2d {

    private double x;
    private double y;

    public Ponto2d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Ponto2d)) {
            return false;
        }
        Ponto2d ponto2d = (Ponto2d) o;
        return x == ponto2d.x && y == ponto2d.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public String toString() {
        return "em X: " + x + ", em Y: " + y;
    }

    public double calcularDistancia(Ponto2d outroPonto) {
        double deltaX = this.x - outroPonto.getX();
        double deltaY = this.x - outroPonto.getY();

        double temp = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return temp;
    }

}
