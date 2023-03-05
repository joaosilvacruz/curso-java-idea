package application;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class ProgramWithClass {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle A: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle B: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double area1 = x.calculateArea();
        double area2 = y.calculateArea();

        System.out.printf("The area of triangle 1 is: %f %nThe area of triangle 2 is: %f %n", area1, area2);

        if (area1 > area2){
            System.out.println("The area 1 is larger");
        } else if (area1 == area2) {
            System.out.println("The areas are equals");
        } else {
            System.out.println("The area 2 is larger");
        }
    }
}

