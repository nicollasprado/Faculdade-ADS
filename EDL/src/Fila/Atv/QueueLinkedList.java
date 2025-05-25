package Fila.Atv;

import Fila.IFila;

public class QueueLinkedList implements IFila {
    private int size = 0;
    private Node head = null;
    private Node tail = null;

    public QueueLinkedList(){}

    public void print(){
        Node actualNode = head;
        for(int i = 0; i < size; i++){
            System.out.print(actualNode.getData() + ", ");
            actualNode = actualNode.getNext();
        }
        System.out.println("");
    }

    @Override
    public Object first(){
        if(size == 0 || head == null){
            throw new IndexOutOfBoundsException();
        }

        return head.getData();
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public void enqueue(Object data){
        Node newNode = new Node(data, null);
        if(size == 0){
            head = newNode;
        }else{
            tail.setNext(newNode);
        }
        tail = newNode;

        size++;
    }

    @Override
    public Object dequeue(){
        if(size == 0){
            throw new IndexOutOfBoundsException();
        }

        Object dequeObj = head.getData();
        head = head.getNext();
        size--;

        if(size == 1){
            tail = head;
        }

        return dequeObj;
    }
}
