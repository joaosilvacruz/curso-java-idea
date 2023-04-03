package applications.applicationFixacaoSection9.application;

import applications.applicationFixacaoSection9.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account account1;

        System.out.print("Enter account number: ");
        String number = sc.next();
        System.out.print("Enter account holder: ");
        String holder = sc.next();
        System.out.print("Is there na initial deposit (y/n)?");
        char res = sc.next().charAt(0);

        if (res == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account1 = new Account(holder, number, initialDeposit);
        } else {
            account1 = new Account(holder, number);
        }
        System.out.println(account1.getNumber());
        System.out.println("Account data: ");
        System.out.print(account1);

        System.out.println();
        System.out.print("Deposit value: ");
        double amount = sc.nextDouble();
        account1.makeDeposit(amount);
        System.out.print("Updated account data");
        System.out.print(account1);

        System.out.println();
        System.out.print("Enter a withdraw vale: ");
        amount = sc.nextDouble();
        account1.makeWithdraw(amount);
        System.out.println("Updated account data: ");
        System.out.print(account1);

        sc.close();
    }

}
