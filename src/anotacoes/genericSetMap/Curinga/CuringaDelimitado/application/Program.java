package anotacoes.genericSetMap.Curinga.CuringaDelimitado.application;

import anotacoes.genericSetMap.Curinga.CuringaDelimitado.entities.Circle;
import anotacoes.genericSetMap.Curinga.CuringaDelimitado.entities.Rectangle;
import anotacoes.genericSetMap.Curinga.CuringaDelimitado.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        // myCircle é subtipo de shape e com o <? extends Shape> torna possível utilizá-lo
        System.out.println("Total area: " + totalArea(myCircles));
    }

    // o tipo <? extends Shape> é o tipo Curinga delimitado de qualquer subtipo de shape
    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
