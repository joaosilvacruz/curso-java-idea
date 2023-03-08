package exercicios.exercVetores.exercAlturas.application;

import exercicios.exercVetores.exercAlturas.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];
        double sum = 0.0;
        int aux = 0;
        for (int i=0; i< vect.length; i++){
            System.out.printf("Dados da %da pessoa: %n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoa(nome, idade, altura);
            sum += vect[i].getAltura();
            if (vect[i].getIdade() < 16){
                aux += 1;
            }
        }
        double media = sum / (double) n;
        System.out.printf("Altura média: %.2f%n", media);

        double percent = 100 * (double) aux / (double) n;
        System.out.printf("Pessoas com menos de 16 anos: %.2f%% %n", percent);
        for (int i=0; i < vect.length; i++){
            if (vect[i].getIdade() < 16){
                System.out.print(vect[i].getNome() + "\n");
                aux += 1;
            }
        }


    }
}
