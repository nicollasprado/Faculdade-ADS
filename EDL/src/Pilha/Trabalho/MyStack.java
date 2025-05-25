package Pilha.Trabalho;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

public class MyStack {
    private int redIndex = 0;
    private int blackIndex = 7;
    private int size = 0;
    private int capacity = 8;
    private Object[] data;



    public void print(){
        for(Object obj : data){
            System.out.print(obj + " ");
        }
    }


    private void increaseCapacity(){
            int newCapacity = capacity*2;
            Object[] newData = new Object[newCapacity];

            for(int i = 0; i < redIndex; i++){
                newData[i] = data[i];
            }

            int newBlackIndex = newCapacity - (capacity - blackIndex);
            if(blackIndex < redIndex){
                newBlackIndex++;
            }

            int auxBlackIndex = capacity-1;
            if(blackIndex < capacity-1){
                for(int j = newCapacity-1; j > newBlackIndex; j--){
                    newData[j] = data[auxBlackIndex--];
                }
            }

            this.data = newData;
            this.capacity = newCapacity;
            this.blackIndex = newBlackIndex;
    }

    private void decreaseCapacity(){
        int newCapacity = capacity/2;
        Object[] newData = new Object[newCapacity];

        for(int i = 0; i < redIndex; i++){
            newData[i] = data[i];
        }

        int newBlackIndex = newCapacity - (capacity - blackIndex);
        if(blackIndex < redIndex){
            newBlackIndex++;
        }

        int auxBlackIndex = capacity-1;
        if(blackIndex < capacity-1){
            for(int j = newCapacity-1; j > newBlackIndex; j--){
                newData[j] = data[auxBlackIndex--];
            }
        }

        this.data = newData;
        this.capacity = newCapacity;
        this.blackIndex = newBlackIndex;
    }


    public boolean isEmpty(){
        return size > 0;
    }

    public Object topV(){
        if(redIndex == 0){
            throw new EmptyStackException();
        }

        return data[redIndex-1];
    }

    public Object topP(){
        if(blackIndex == capacity-1){
            throw new EmptyStackException();
        }

        return data[blackIndex+1];
    }

    public void pushV(Object obj){
        if(data[redIndex] != null || redIndex == capacity-1){
            increaseCapacity();
        }

        data[redIndex] = obj;
        this.redIndex++;
        this.size++;
    }

    public void pushP(Object obj){
        if(data[blackIndex] != null || blackIndex == 0){
            increaseCapacity();
        }

        data[blackIndex] = obj;
        this.blackIndex--;
        this.size++;
    }

    public void popV(){
        if(size <= 0){
            throw new EmptyStackException();
        }

        Object prev = data[redIndex];
        Object actual;
        for(int i = redIndex-1; i >= 0; i--){
            actual = data[i];
            data[i] = prev;
            prev = actual;
        }

        this.redIndex--;
        this.size--;

        if(size <= (capacity * 0.3)){
            decreaseCapacity();
        }
    }

    public void popP(){
        if(size <= 0){
            throw new EmptyStackException();
        }

        Object prev = data[blackIndex];
        Object actual;
        for(int i = blackIndex+1; i < capacity; i++){
            actual = data[i];
            data[i] = prev;
            prev = actual;
        }

        this.blackIndex++;
        this.size--;

        if(size <= (capacity * 0.3)){
            decreaseCapacity();
        }
    }


    public MyStack() {}

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
