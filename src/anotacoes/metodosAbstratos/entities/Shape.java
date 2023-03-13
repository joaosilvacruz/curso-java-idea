package anotacoes.metodosAbstratos.entities;

import anotacoes.metodosAbstratos.entitiesEnums.Color;

// CLASE ABSTRATA
public abstract class Shape {

    private Color color;

    public Shape(){
    }

    public Shape(Color color) {
        this.color = color;
    }

    // METODO ABSTRATO
    public abstract double area ();

    public Color getColor(){
        return color;
    }


    public void setColor(Color color) {
        this.color = color;
    }
}
