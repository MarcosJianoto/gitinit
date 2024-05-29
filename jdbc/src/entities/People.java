package entities;

public class People {

    private double weight;
    private double height;

    public People(double weight, double heigh) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeigh() {
        return this.height;
    }

    public void setHeigh(double heigth) {
        this.height = heigth;
    }

    public double calc(double weight, double height) {
        return weight / (height * height);
    }

}
