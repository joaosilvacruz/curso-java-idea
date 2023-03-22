package anotacoesInterfaces.exercicio1Fixacao.application;

import anotacoesInterfaces.exercicio1Fixacao.model.entities.Contract;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        Integer contractNumber = sc.nextInt();

        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine());

        System.out.println("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        System.out.println("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        Contract contract = new Contract(contractNumber, date, totalValue);

        System.out.println("Parcelas: ");

        sc.close();
    }
}
