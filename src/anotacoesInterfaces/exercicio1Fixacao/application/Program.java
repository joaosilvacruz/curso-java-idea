package anotacoesInterfaces.exercicio1Fixacao.application;

import anotacoesInterfaces.exercicio1Fixacao.model.entities.Contract;
import anotacoesInterfaces.exercicio1Fixacao.model.entities.Installment;
import anotacoesInterfaces.exercicio1Fixacao.model.services.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        Integer contractNumber = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(contractNumber, date, totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(null);
        contractService.processContract(contract, n);
        System.out.println("Parcelas: ");
        for (Installment installment: contract.getInstallments()){
            System.out.println(installment);
        }

        sc.close();
    }
}
