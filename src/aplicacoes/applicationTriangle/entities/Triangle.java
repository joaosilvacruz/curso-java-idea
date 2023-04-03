package aplicacoes.applicationTriangle.entities;

public class Triangle {
    public double a, b, c;

    public double calculateArea(){
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
