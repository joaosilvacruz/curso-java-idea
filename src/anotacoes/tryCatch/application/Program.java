package anotacoes.tryCatch.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Programa que le nomes separados por espaço e adiciona no vetor
        // Criando um tratamento de erro que busque a exceção de index fora da lista
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
        }
        catch (InputMismatchException e){
            System.out.println("Input error");
        }

        System.out.println("End of program");
        sc.close();


    }
}
