package model.service;

import model.data.Counterparty;

import java.util.*;

public class CounterpartyService {
    public List<Counterparty> makeCounterparties() {
        // Counterparty cp = new CompanyCounterparty();
        Map<String, List<String>> counterpartyA = new HashMap<>();

        counterpartyA.put("телефон", Arrays.asList("+7 914 255 21 01", "+7 87245 22"));
        counterpartyA.put("email", Arrays.asList("bublik@mail.ru"));
        counterpartyA.put("telegram", Arrays.asList("@Bublik"));
        counterpartyA.put("vk", Arrays.asList("https://vk.com/bublik2045"));

        Map<String, List<String>> counterpartyB = new HashMap<>();

        counterpartyB.put("телефон", Arrays.asList("+7 914 255 21 01", "+7 87245 22"));
        counterpartyB.put("email", Arrays.asList("bublik2@mail.ru"));
        counterpartyB.put("telegram", Arrays.asList("@Bublik2", "@Bublik22"));
        counterpartyB.put("vk", Arrays.asList("https://vk.com/bublik222"));

        Map<String, List<String>> counterpartyC = new HashMap<>();

        counterpartyC.put("телефон", Arrays.asList("+7 914 255 21 22"));
        counterpartyC.put("email", Arrays.asList("bublik2@mail.ru"));
        counterpartyC.put("telegram", Arrays.asList("@Studia245"));
        counterpartyC.put("vk", Arrays.asList("https://vk.com/studia245"));

        return Arrays.asList(
                new Counterparty("1 - Иванов Иван Иванович", counterpartyA),
                new Counterparty("2 - Иванов Роман Иванович", counterpartyB),
                new Counterparty("3 - Студия", counterpartyC));
    }

    public List<Counterparty> findCounterparty(List<Counterparty> counterparties, String name) {
        List<Counterparty> findCounterparties = new ArrayList<>();

        for (Counterparty counterparty : counterparties) {
            if (name.equals(counterparty.getName().substring(4))) {
                findCounterparties.add(counterparty);
            } else {
                System.out.println("Совпадений не найдено");
            }
        }
        return findCounterparties;
    }

    public List<Counterparty> addCounterparty(List<Counterparty> counterparties, String name) {
        Map<String, List<String>> temp = new HashMap<>();
        List<Counterparty> newCounterparties = new ArrayList<>(counterparties);
        temp.put("", Arrays.asList(""));

        String str = counterparties.size() + 1 + " - " + name;
        newCounterparties.add(new Counterparty(str, temp));
        return newCounterparties;
    }

    public List<Counterparty> deleteCounterparty(List<Counterparty> counterparties, String name) {
        List<Counterparty> newCounterparties = new ArrayList<>(counterparties);

        for (int i = 0; i < newCounterparties.size(); i++) {
            if (name.equals(newCounterparties.get(i).getName().substring(4))) {
                newCounterparties.remove(newCounterparties.get(i));
                System.out.println("Успешно удалено");
            }
        }
        return newCounterparties;
    }

    public List<Counterparty> addContact(List<Counterparty> counterparties, String name, String contact) {
        List<Counterparty> newCounterparties = new ArrayList<>(counterparties);

        for (Counterparty newCounterparty : newCounterparties) {
            if (name.equals(newCounterparty.getName().substring(4))) {
                newCounterparty.getContact().put(contact, Arrays.asList(""));
                System.out.println("Новая связь успешно добавлена");
            }
        }
        return newCounterparties;
    }

    public List<Counterparty> deleteContact(List<Counterparty> counterparties, String name, String contact) {
        List<Counterparty> newCounterparties = new ArrayList<>(counterparties);

        for (int i = 0; i < newCounterparties.size(); i++) {
            if (name.equals(newCounterparties.get(i).getName().substring(4))) {
                newCounterparties.get(i).getContact().remove(contact);
                System.out.println("Связь успешно удалена");
            }
        }
        return newCounterparties;
    }


}
//        for (int i = 0; i < newCounterparties.size(); i++) {
//        if (name.equals(newCounterparties.get(i).getName().substring(4))){
//        newCounterparties.get(i).getContact().put(contact, Arrays.asList(""));
//        System.out.println("Новая связь успешно добавлена");
//        }
//        }
