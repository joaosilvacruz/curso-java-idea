package anotacoes.genericSetMap.Curinga.CuringaDelimitado.entities;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
