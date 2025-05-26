package Lista;

public interface ILista {
    Object first();
    Object last();
    Object before(int i);
    Object after(int i);
    void replace(int i, Object o);
    void swap(int i, int p);
    void insertBefore(int i, Object o);
    void insertAfter(int i, Object o);
    void insertFirst(Object o);
    void insertLast(Object o);
    void removeAt(int i);
    int size();
    boolean isEmpty();
}
