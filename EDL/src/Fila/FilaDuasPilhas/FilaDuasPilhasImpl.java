package Fila.FilaDuasPilhas;

import Fila.IFila;

import java.util.Stack;

public class FilaDuasPilhasImpl implements IFila {
    private Stack<Object> in;
    private Stack<Object> out;

    public FilaDuasPilhasImpl(){
        this.in = new Stack<>();
        this.out = new Stack<>();
    }

     public void print(){
        System.out.print("Entrada: ");
        for(int i = 0; i < in.size(); i++){
            System.out.print(in.elementAt(i) + ", ");
        }

        System.out.println("");
        System.out.print("Saida: ");
        for(int i = 0; i < out.size(); i++){
            System.out.print(out.elementAt(i) + ", ");
        }
        System.out.println("");
    }

    private void transferBetweenStacks() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
    }

    @Override
    public void enqueue(Object o) {
         in.push(o);
    }

    @Override
    public Object dequeue() {
        if(out.isEmpty()){
            transferBetweenStacks();
        }

        return out.pop();
    }

    @Override
    public Object first() {
        if(out.isEmpty()){
            transferBetweenStacks();
        }

        return out.peek();
    }

    @Override
    public int getSize() {
        return in.size() + out.size();
    }

    @Override
    public boolean isEmpty() {
        return in.isEmpty() && out.isEmpty();
    }
}
