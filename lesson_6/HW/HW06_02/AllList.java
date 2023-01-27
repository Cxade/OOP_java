/**
Задача 2. Есть два самодельных класса коллекций:

ImmutableList<T> — коллекция, которая никогда ни при каких обстоятельствах не меняется. Методы:
• getSize ()
• get (int i)

MutableList<T> — коллекция, которая допускает изменения. Методы:
• getSize ()
• get (int i)
• set (int i, T newValue)
• add (T newValue)
• remove (T value)

Реализуйте такую схему наследования между двумя этими классами, которая будет соответствовать принципу подстановки Лисков.
 */
public class AllList {
private int size;
private int position;


public int getSize() {
    return size;
}

public int get(int i) {
    return position;
}
    
}