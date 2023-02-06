package controller;

import model.data.Counterparty;
import model.service.CounterpartyService;
import view.CounterpartyView;

import java.util.*;

public class Presenter {
    public static void run() {
        CounterpartyService cs = new CounterpartyService();
        CounterpartyView view = new CounterpartyView();

        List<Counterparty> counterparty = cs.makeCounterparties();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(
                    """
                            Введите число от 1 до 7, где:
                            1 - посмотреть список контрагентов\s
                            2 - посмотреть список контрагентов (только имена)\s
                            3 - найти контрагента по названию
                            4 - добавить контрагента
                            5 - удалить контрагента
                            6 - добавить новый способ связаться с контрагентом
                            7 - удалить способ связаться с контрагентом
                            8 - выйти из программы""");

            switch (scanner.nextInt()) {
                case 1:
                    view.printCounterparty(counterparty);
                    break;
                case 2:
                    view.printLiteCounterparty(counterparty);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Введите имя контрагента: ");
                    view.printCounterparty(cs.findCounterparty(counterparty, scanner.nextLine()));
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Введите имя контрагента, которого хотите добавить: ");
                    counterparty = cs.addCounterparty(counterparty, scanner.nextLine());
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Введите имя контрагента, которого хотите удалить: ");
                    counterparty = cs.deleteCounterparty(counterparty, scanner.nextLine());

                    break;
                case 6:
                    scanner.nextLine();
                    System.out.println("Введите имя контрагента, которому хотите добавить новый способ связи: ");
                    String nameOfAddContact = scanner.nextLine();
                    System.out.println("Теперь введите название способа связи: ");
                    counterparty = cs.addContact(counterparty, nameOfAddContact, scanner.nextLine());

                    break;
                case 7:
                    scanner.nextLine();
                    System.out.println("Введите имя контрагента, у которого хотите удалить метод связи: ");
                    String nameOfDeletedContact = scanner.nextLine();
                    System.out.println("Теперь введите название способа связи: ");
                    counterparty = cs.deleteContact(counterparty, nameOfDeletedContact, scanner.nextLine());

                    break;
                case 8:
                    scanner.close();
                    return;
                default:
                    scanner.close();
                    System.out.println("Введите корректное число!");
                    break;
            }

        }
    }
}
