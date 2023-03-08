package exercicios.exercVetores.exercPensionato.application;

import exercicios.exercVetores.exercPensionato.entities.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serao alugados? ");
        int n = sc.nextInt();

        Aluguel[] vetor = new Aluguel[9];
        for (int i=0; i<n; i++){
            System.out.printf("Rent #%d: %n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.next();
            sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vetor[quarto] = new Aluguel(nome, email, quarto);
        }
        System.out.println("Busy rooms: ");
        for (int i=0; i<vetor.length; i++){
            if (vetor[i] != null) {
                int quarto = vetor[i].getQuarto();
                String nome = vetor[i].getName();
                String email = vetor[i].getEmail();
                System.out.printf("%d: %s, %s", quarto, nome, email);
            }
        }
        sc.close();
    }
}
