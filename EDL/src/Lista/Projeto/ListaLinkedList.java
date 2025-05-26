package Lista.Projeto;

import Lista.ILista;
import Vetor.Projeto.NodeD;

public class ListaLinkedList implements ILista {
    private int size = 0;
    private NodeD head = null;
    private NodeD tail = null;

    public ListaLinkedList(){}

    public void print(){
        NodeD actualNode = head;
        for(int i = 0; i < size; i++){
            System.out.print(actualNode.getData() + ", ");
            actualNode = actualNode.getNext();
        }
        System.out.println();
    }

    private NodeD getNodeAt(int i){
        if(i >= size){
            throw new IndexOutOfBoundsException();
        }

        NodeD actualNode = head;
        for(int p = 0; p < i; p++){
            actualNode = actualNode.getNext();
        }

        return actualNode;
    }

    @Override
    public Object first() {
        return head.getData();
    }

    @Override
    public Object last() {
        return tail.getData();
    }

    @Override
    public Object before(int i) {
        if(i >= size || i <= 0){
            throw new IndexOutOfBoundsException();
        }

        return getNodeAt(i-1).getData();
    }

    @Override
    public Object after(int i) {
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException();
        }

        return getNodeAt(i+1).getData();
    }

    @Override
    public void replace(int i, Object o) {
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException();
        }

        NodeD requestedNode = getNodeAt(i);
        requestedNode.setData(o);
    }

    @Override
    public void swap(int i, int p) {
        if(i >= size || p >= size || i < 0 || p < 0){
            throw new IndexOutOfBoundsException();
        }

        NodeD requestedNode = getNodeAt(i);
        NodeD secondRequestedNode = getNodeAt(p);

        Object aux = requestedNode.getData();
        requestedNode.setData(secondRequestedNode.getData());
        secondRequestedNode.setData(aux);
    }

    @Override
    public void insertBefore(int i, Object o) {
        if(i >= size || i <= 0){
            throw new IndexOutOfBoundsException();
        }

        NodeD requestedNode = getNodeAt(i);
        NodeD newNode;
        if(i == 1){
            newNode = new NodeD(o, requestedNode, null);
            head = newNode;
        }else {
            newNode = new NodeD(o, requestedNode, requestedNode.getPrevious());
            requestedNode.getPrevious().setNext(newNode);
        }
        requestedNode.setPrevious(newNode);

        size++;
    }

    @Override
    public void insertAfter(int i, Object o) {
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException();
        }

        NodeD requestedNode = getNodeAt(i);
        NodeD newNode;
        if(i == size-1){
            newNode = new NodeD(o, null, requestedNode);
            tail = newNode;
        }else{
            newNode = new NodeD(o, requestedNode.getNext(), requestedNode);
            requestedNode.getNext().setPrevious(newNode);
        }
        requestedNode.setNext(newNode);

        size++;
    }

    @Override
    public void insertFirst(Object o) {
        if(size == 0){
            NodeD newNode = new NodeD(o, null, null);
            head = newNode;
            tail = newNode;
        }else{
            NodeD newNode = new NodeD(o, head, null);
            head.setPrevious(newNode);
            head = newNode;
        }

        size++;
    }

    @Override
    public void insertLast(Object o) {
        if(size == 0){
            NodeD newNode = new NodeD(o, null, null);
            head = newNode;
            tail = newNode;
        }else{
            NodeD newNode = new NodeD(o, null, tail);
            tail.setNext(newNode);
            tail = newNode;
        }

        size++;
    }

    @Override
    public void removeAt(int i) {
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException();
        }

        if(size == 1){
            head = null;
            tail = null;
        }else if(i == size-1){
            tail.getPrevious().setNext(null);
            tail = tail.getPrevious();
        }else{
            NodeD requestedNode = getNodeAt(i);
            if(i > 0){
                requestedNode.getPrevious().setNext(requestedNode.getNext());
            }else{
                head = requestedNode.getNext();
            }
            requestedNode.getNext().setPrevious(requestedNode.getPrevious());
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
