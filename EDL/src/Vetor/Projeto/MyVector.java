package Vetor.Projeto;

import Vetor.IVetor;

public class MyVector implements IVetor {
    private int capacity = 8;
    private int size = 0;
    private Object[] data = new Object[8];

    public MyVector(){}

    public void print(){
        for(int i = 0; i < capacity; i++){
            System.out.print(data[i] + ", ");
        }
        System.out.println("");
    }

    private void increaseCapacity(){
        int newCapacity = capacity*2;
        Object[] newData = new Object[newCapacity];

        for(int i = 0; i < size; i++){
            newData[i] = data[i];
        }

        data = newData;
    }

    @Override
    public Object getAt(int i) {
        if(i >= size){
            throw new IndexOutOfBoundsException();
        }

        return data[i];
    }

    @Override
    public Object replace(int i, Object o) {
        if(i >= capacity){
            throw new IndexOutOfBoundsException();
        }

        Object oldObj = data[i];
        data[i] = o;
        return oldObj;
    }

    @Override
    public void insertAt(int i, Object o) {
        if(i > size){
            throw new IndexOutOfBoundsException();
        }

        if(size == capacity){
            increaseCapacity();
        }

        for(int p = size; p > i; p--){
            data[p] = data[p-1];
        }

        data[i] = o;
        size++;
    }

    @Override
    public Object removeAt(int i) {
        if(i >= size){
            throw new IndexOutOfBoundsException();
        }

        Object oldObj = data[i];
        for(int p = i; p < size; p++){
            data[p] = data[p+1];
        }

        size--;
        return oldObj;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
