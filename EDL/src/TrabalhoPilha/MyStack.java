package TrabalhoPilha;

import java.lang.reflect.Array;

public class MyStack {
    private int redIndex = 0;
    private int blackIndex = 8;
    private int size = 0;
    private int capacity = 8;
    private Class<?> dataType;
    private Object[] data;



    public void print(){
        for(Object obj : data){
            System.out.print(obj + " ");
        }
    }


    @SuppressWarnings("unchecked")
    private void increaseCapacity(){
        try{
            int newCapacity = capacity*2;
            Object newData = Array.newInstance(Class.forName("T"), newCapacity);

            for(int i = 0; i <= redIndex; i++){
                newData[i] = data[i];
            }

            int newBlackIndex = newCapacity - blackIndex;
            int auxBlackIndex = blackIndex;
            for(int j = newBlackIndex; j < newCapacity; j++){
                newData[j] = data[auxBlackIndex];

                auxBlackIndex++;
            }
        }catch (Exception ignore){}
    }


    public T topV(){
        return data[redIndex];
    }

    public T topP(){
        return data[blackIndex];
    }

    public void pushV(T obj){
        if(redIndex == blackIndex){
            increaseCapacity();
        }

        this.redIndex++;
        data[redIndex] = obj;
    }


    @SuppressWarnings("unchecked")
    public MyStack(Class<?> T) {
        try{
            this.data = Array.newInstance(T, 8);
        }catch (Exception ignore){}
    }
}
