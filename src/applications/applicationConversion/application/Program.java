package applications.applicationConversion.application;

import applications.applicationConversion.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double cotacao, reais, valorConvertido;

        System.out.print("What is the dollar price?");
        cotacao = sc.nextDouble();
        System.out.print("How many dollar will be bought?");
        reais = sc.nextDouble();

        valorConvertido = CurrencyConverter.converterDollar(reais, cotacao);

        System.out.print("Amount to be paid in reais " + valorConvertido);

    }
}
