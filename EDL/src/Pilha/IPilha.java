package Pilha;

public interface IPilha {
    public int size();    
    public boolean isEmpty();
    public Object top();
    public void push(Object o);
    public Object pop();
}
