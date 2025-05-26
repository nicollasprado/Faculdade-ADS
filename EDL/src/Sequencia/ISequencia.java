package Sequencia;

public interface ISequencia {
    int size();
    boolean isEmpty();
    Object first();
    Object last();
    Object before(int i);
    Object after(int i);
    Object getAt(int i);
    void replace(int i, Object o);
    void swap(int i, int p);
    void removeAt(int i);
    void insertAfter(int i, Object o);
    void insertBefore(int i, Object o);
    void insertFirst(Object o);
    void insertLast(Object o);
}
