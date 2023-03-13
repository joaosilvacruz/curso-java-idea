package anotacoes.metodosAbstratos.application;

import anotacoes.metodosAbstratos.entities.Circle;
import anotacoes.metodosAbstratos.entities.Rectangle;
import anotacoes.metodosAbstratos.entities.Shape;
import anotacoes.metodosAbstratos.entitiesEnums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> shapeList = new ArrayList<>();

        for(int i = 1; i<=n; i++){
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char choice = sc.next().charAt(0);
            System.out.print("Color (Black/Blue/Red): ");
            Color color = Color.valueOf(sc.next());

            if (choice == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapeList.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapeList.add(new Circle(color, radius));
            }

        }
        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shapes:shapeList) {
            System.out.println(String.format("%.2f",shapes.area()));
        }

        sc.close();
    }
}
