package Lista;

import java.util.NoSuchElementException;

public class MyLista implements ILista {
    private int capacity = 8;
    private int size = 0;
    private Object[] data = new Object[8];

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
        if(i >= size){
            throw new IndexOutOfBoundsException();
        }

        return data[i-1];
    }

    @Override
    public Object after(int i) {
        if(i >= size){
            throw new IndexOutOfBoundsException();
        }

        if(i == size-1){
            throw new NoSuchElementException();
        }

        return data[i+1];
    }

    @Override
    public void replace(int i, Object o) {
        if(i >= size){
            throw new IndexOutOfBoundsException();
        }

        data[i] = o;
    }

    @Override
    public void swap(int i, int p) {
        if(i >= size || p >= size){
            throw new IndexOutOfBoundsException();
        }

        Object aux = data[i];
        data[i] = data[p];
        data[p] = aux;
    }

    @Override
    public void insertBefore(int i, Object o) {
        if(i >= size){
            throw new IndexOutOfBoundsException();
        }

        if(i == 0){
            throw new IllegalArgumentException();
        }

        if(size == capacity){
            increaseCapacity();
        }

        for(int p = size-1; p >= i; p--){
            data[p] = data[p-1];
        }

        data[i-1] = o;
    }

    @Override
    public void insertAfter(int i, Object o) {
        if(i >= size){
            throw new IndexOutOfBoundsException();
        }

        if(size == capacity){
            increaseCapacity();
        }

        for(int p = size-1; p > i; p--){
            data[p] = data[p-1];
        }

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

        data[0] = o;
    }

    @Override
    public void insertLast(Object o) {
        if(size == capacity){
            increaseCapacity();
        }

        data[size-1] = o;
    }

    @Override
    public void removeAt(int i) {
        if(i >= size){
            throw new IndexOutOfBoundsException();
        }

        for(int p = i; p > ; p++){
            data[p] = data[p-1];
        }

        data[i+1] = o;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFirst(int i) {
        return false;
    }

    @Override
    public boolean isLast(int i) {
        return false;
    }
}
