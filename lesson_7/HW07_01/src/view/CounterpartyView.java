package view;

import model.data.Counterparty;

import java.util.List;

public class CounterpartyView {
    public void printLiteCounterparty(List<Counterparty> counterparties) {
        for (Counterparty counterparty : counterparties) {
            System.out.println(counterparty.getName());
        }
        System.out.println();
    }


    public void printCounterparty(List<Counterparty> counterparties) {
        for (Counterparty counterparty : counterparties) {
            System.out.println(counterparty.getName() + " " + counterparty.getContact());
        }
        System.out.println();
    }
}
