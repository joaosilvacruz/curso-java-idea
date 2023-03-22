package anotacoesInterfaces.exercicio1Fixacao.model.services;

import anotacoesInterfaces.exercicio1Fixacao.model.entities.Contract;
import anotacoesInterfaces.exercicio1Fixacao.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){

        for(int i =1; i<= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);

        }

      }
}
