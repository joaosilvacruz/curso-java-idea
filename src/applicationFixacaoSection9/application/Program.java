package applicationFixacaoSection9.application;

import applicationFixacaoSection9.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter account number: ");
        String holder = sc.next();
        System.out.print("Enter account holder: ");
        String number = sc.next();
        System.out.print("Is there na initial deposit (y/n)?");
        char res = sc.next().charAt(0);

        float initialDeposit;
        if (res == 'y') {
            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextFloat();
            Account account1 = new Account(holder, number, initialDeposit);
        } else {
            Account account1 = new Account(holder, number);
        }

        System.out.println("Account data: ");
        System.out.print(account1);

    }

}
