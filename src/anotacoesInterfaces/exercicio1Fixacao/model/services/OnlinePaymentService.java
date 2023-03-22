package anotacoesInterfaces.exercicio1Fixacao.model.services;

public interface OnlinePaymentService {
    Double paymentFree(Double amount);
    Double interest(Double amount, Integer months);

}
