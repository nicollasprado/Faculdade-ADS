package Fila.Projeto;

public interface IFila {
    public abstract void enqueue(Object o);
    public abstract Object dequeue();
    public Object first();
    public abstract int getSize();
    public abstract boolean isEmpty();
}

