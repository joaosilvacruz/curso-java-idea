package anotacoes.polimorfismo.application;

import anotacoes.polimorfismo.entities.Account;
import anotacoes.polimorfismo.entities.BussinessAccount;
import anotacoes.polimorfismo.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc1 = new Account(2000, "Georg", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(2005, "Caio", 1000.00, 0.01);
        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());

        Account acc3 = new BussinessAccount(2001, "Marcos", 1000.00, 500.00);
        acc3.withdraw(200.00);
        System.out.println(acc3.getBalance());


    }
}
