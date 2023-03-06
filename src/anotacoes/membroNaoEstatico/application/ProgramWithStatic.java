package anotacoes.membroNaoEstatico.application;

import anotacoes.membroNaoEstatico.util.CalculatorWithStatic;

import java.util.Locale;
import java.util.Scanner;

public class ProgramWithStatic {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Como não é estático, é necessário instânciar o objeto.
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = CalculatorWithStatic.circumference(radius);
        double v = CalculatorWithStatic.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", CalculatorWithStatic.PI);

    }
}
