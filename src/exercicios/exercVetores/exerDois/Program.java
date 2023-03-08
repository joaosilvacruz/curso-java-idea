package exercicios.exercVetores.exerDois;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double sum = 0.0;
        for (int i=0; i<vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            sum += vect[i];
        }
        double media = sum / n;

        System.out.print("VALORES: ");
        for (int i=0; i< vect.length; i++){
            System.out.printf("%.1f ", vect[i]);
        }

        System.out.printf("%nSOMA = %.2f %n", sum);
        System.out.printf("MEDIA = %.2f%n", media);

        sc.close();
    }
}
