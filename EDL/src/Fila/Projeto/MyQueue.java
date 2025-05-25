package Fila.Projeto;

import Fila.IFila;

import java.util.NoSuchElementException;

public class MyQueue implements IFila {
    private int startIndex = 0;
    private int endIndex = 0;
    private int capacity = 8;
    private int size = 0;
    private Object[] data;


    public void print(){
        for(Object obj : data){
            System.out.print(obj + " ");
        }
        System.out.println(" ");
    }

    private void increaseCapacity(){
        int newCapacity = capacity*2;

        Object[] newData = new Object[newCapacity];

        int auxIndex = startIndex;
        for(int i=0; i < size; i++){
            if(auxIndex == capacity){
                auxIndex = 0;
            }

            newData[i] = data[auxIndex];

            auxIndex++;
        }

        startIndex = 0;
        endIndex = size;
        capacity = newCapacity;
        data = newData;
    }

    @Override
    public void enqueue(Object o) {
        if(size == capacity){
            increaseCapacity();
        }

        if(endIndex == capacity){
            endIndex = 0;
        }

        data[endIndex] = o;
        size++;
        endIndex++;
    }

    @Override
    public Object dequeue() {
        if(size == 0){
            throw new NoSuchElementException();
        }

        data[startIndex] = null;
        startIndex++;

        if(startIndex == capacity){
            startIndex = 0;
        }

        size--;
        return data[startIndex];
    }

    @Override
    public Object first() {
        if(size == 0){
            throw new NoSuchElementException();
        }

        return data[startIndex];
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    public MyQueue() {
        this.data = new Object[8];
    }
}
