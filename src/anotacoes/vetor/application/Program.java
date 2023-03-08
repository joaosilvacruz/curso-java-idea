package anotacoes.vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the quantities of height");
        int n = sc.nextInt();
        // Declaração de vetor de n elementos
        double[] vect = new double[n];
        for (int i = 0; i <n ; i++){
            System.out.println("Enter the height");
            vect[i] = sc.nextDouble();
            System.out.println(vect[i]);
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++){
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n",  avg);
        sc.close();
    }
}
