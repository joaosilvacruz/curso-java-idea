package anotacoes.anotacoesInterfaces.defaultMethods.services;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate();

    // Default method é um método padrão para as classes que implementam
    // a ‘interface’.
    default double payment(double amount, int months) {
        if (months < 1){
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}
