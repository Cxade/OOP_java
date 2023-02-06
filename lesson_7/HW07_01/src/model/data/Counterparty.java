package model.data;

import java.util.*;

public class Counterparty {
    private String name;
    private Map<String, List<String>> contact;

    public Counterparty(String name, Map<String, List<String>> contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public Map<String, List<String>> getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Counterparty [name=" + name + ", contact=" + contact + "]";
    }

}
