package anotacoes.heranca.application;

import anotacoes.heranca.entities.Account;
import anotacoes.heranca.entities.BussinessAccount;
import anotacoes.heranca.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1005, "Joao", 1850.00);
        BussinessAccount bacc = new BussinessAccount(1003, "Marcos", 0.0, 500.00);

        //UPCASTING -> SUBCLASSE PARA SUPERCLASSE

        Account acc1 = bacc;
        Account acc2 = new BussinessAccount(1007, "Bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING -> SUPERCLASSE PARA SUBCLASSE

        BussinessAccount acc4 = (BussinessAccount) acc2;
        acc4.loan(500.00);

        // erro porque acc3 foi instanciada como SavingsAccount
//        BussinessAccount acc5 = (BussinessAccount) acc3;
        // testando se acc3 é instancia de bussinessaccount
        if (acc3 instanceof BussinessAccount){
            BussinessAccount acc5 = (BussinessAccount) acc3;
            acc5.loan(20.00);
            System.out.println("Loan");
        }
        if ( acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


    }
}
