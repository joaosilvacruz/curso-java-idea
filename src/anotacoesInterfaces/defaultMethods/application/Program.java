package anotacoesInterfaces.defaultMethods.application;

import anotacoesInterfaces.defaultMethods.services.BrazilInterestService;
import anotacoesInterfaces.defaultMethods.services.InterestService;
import anotacoesInterfaces.defaultMethods.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + "months: ");
        System.out.println(String.format("%.2f", payment));

        sc.close();
    }
}
