package exercicios.exercVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercUm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você pretende digitar? ");
        int n = sc.nextInt();

        while (n < 1 || n > 10){
            System.out.println("Quantidade inválida");
            System.out.println("Digite uma quantidade entre 1 e 10: ");
            n = sc.nextInt();
        }

        double[] vect = new double[n];
        for (int i=0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i=0; i< vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
    }
}
