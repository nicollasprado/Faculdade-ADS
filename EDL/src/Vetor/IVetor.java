package Vetor;

public interface IVetor {
    Object getAt(int i);
    Object replace(int i, Object o);
    void insertAt(int i, Object o);
    Object removeAt(int i);
    int size();
    boolean isEmpty();
}
