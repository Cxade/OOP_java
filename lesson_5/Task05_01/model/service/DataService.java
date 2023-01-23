package Task05_01.model.service;

import Task05_01.model.data.User;

public interface DataService<U extends User> {
    public void addStudent(U user);
    public void saveToFile(String path);
}
