package Lista.Projeto;

import Lista.ILista;

import java.util.NoSuchElementException;

public class MyLista implements ILista {
    private int capacity = 8;
    private int size = 0;
    private Object[] data = new Object[8];

    public MyLista(){}

    public void print(){
        for(Object o : data){
            System.out.print(o + ", ");
        }
        System.out.println();
    }

    private void increaseCapacity(){
        int newCapacity = capacity * 2;

        Object[] newData = new Object[newCapacity];

        for(int i = 0; i < size; i++){
            newData[i] = data[i];
        }

        capacity = newCapacity;
        data = newData;
    }

    @Override
    public Object first() {
        return data[0];
    }

    @Override
    public Object last() {
        return data[size-1];
    }

    @Override
    public Object before(int i) {
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException();
        }

        if(i == 0){
            throw new IllegalArgumentException();
        }

        return data[i-1];
    }

    @Override
    public Object after(int i) {
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException();
        }

        if(i == size-1){
            throw new IllegalArgumentException();
        }

        return data[i+1];
    }

    @Override
    public void replace(int i, Object o) {
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException();
        }

        data[i] = o;
    }

    @Override
    public void swap(int i, int p) {
        if(i >= size || p >= size || i < 0 || p < 0){
            throw new IndexOutOfBoundsException();
        }

        Object aux = data[i];
        data[i] = data[p];
        data[p] = aux;
    }

    @Override
    public void insertBefore(int i, Object o) {
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException();
        }

        if(i == 0){
            throw new IllegalArgumentException();
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
    public void insertAfter(int i, Object o) {
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException();
        }

        if(size == capacity){
            increaseCapacity();
        }

        for(int p = size-1; p > i; p--){
            data[p] = data[p-1];
        }

        size++;
        data[i+1] = o;
    }

    @Override
    public void insertFirst(Object o) {
        if(size == capacity){
            increaseCapacity();
        }

        for(int p = size-1; p > 0; p--){
            data[p] = data[p-1];
        }

        size++;
        data[0] = o;
    }

    @Override
    public void insertLast(Object o) {
        if(size == capacity){
            increaseCapacity();
        }

        size++;
        data[size-1] = o;
    }

    @Override
    public void removeAt(int i) {
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException();
        }

        for(int p = i; p < size; p++){
            data[p] = data[p+1];
        }

        size--;
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
