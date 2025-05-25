package Pilha.PilhaDuasFilas;

import Fila.Projeto.MyQueue;
import Pilha.IPilha;

public class PilhaDuasFilasImpl implements IPilha {
    private int indicator = 0;
    private MyQueue queueOne;
    private MyQueue queueTwo;

    public PilhaDuasFilasImpl(){
        this.queueOne = new MyQueue();
        this.queueTwo = new MyQueue();
    }

    public void print(){
        if(indicator == 0){
            queueTwo.print();
        }else{
            queueOne.print();
        }
    }

    private void mergeQueues(){
        if(indicator == 0 && !queueOne.isEmpty()){
            while(!queueOne.isEmpty()){
                queueTwo.enqueue(queueOne.dequeue());
            }

            indicator = 1;
        }else if(indicator == 1 && !queueTwo.isEmpty()){
            while(!queueTwo.isEmpty()){
                queueOne.enqueue(queueTwo.dequeue());
            }

            indicator = 0;
        }

    }

    @Override
    public int size() {
        if(indicator == 0){
            return queueOne.getSize();
        }

        return queueTwo.getSize();
    }

    @Override
    public boolean isEmpty() {
        return queueOne.isEmpty() && queueTwo.isEmpty();
    }

    @Override
    public Object top() {
        if(indicator == 0){
            return queueOne.first();
        }

        return queueTwo.first();
    }

    @Override
    public void push(Object o) {
        if(indicator == 0){
            queueTwo.enqueue(o);
            mergeQueues();
        }else{
            queueOne.enqueue(o);
            mergeQueues();
        }
    }

    @Override
    public Object pop() {
        if(indicator == 0){
            return queueTwo.dequeue();
        }

        return queueOne.dequeue();
    }
}
