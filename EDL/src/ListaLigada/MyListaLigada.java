package ListaLigada;

import Lista.ILista;
import Vetor.Projeto.NodeD;

import java.util.NoSuchElementException;

public class MyListaLigada implements ILista {
    private int size = 0;
    private NodeD head = null;
    private NodeD tail = null;

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
        if(size == 0){
            throw new NoSuchElementException();
        }

        return head.getData();
    }

    @Override
    public Object last() {
        if(size == 0){
            throw new NoSuchElementException();
        }

        return tail.getData();
    }

    @Override
    public Object before(int i) {
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException();
        }

        NodeD requestedNode = getNodeAt(i);

        return requestedNode.getPrevious().getData();
    }

    @Override
    public Object after(int i) {
        if(i >= size-1 || i < 0){
            throw new IndexOutOfBoundsException();
        }

        NodeD requestedNode = getNodeAt(i);

        return requestedNode.getNext().getData();
    }

    @Override
    public void replace(int i, Object o) {
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException();
        }

        getNodeAt(i).setData(o);
    }

    @Override
    public void swap(int i, int p) {
        if(i >= size || p >= size || i < 0 || p < 0){
            throw new IndexOutOfBoundsException();
        }

        if(i == p){
            throw new IllegalArgumentException();
        }

        NodeD firstNode = getNodeAt(i);
        NodeD secondNode = getNodeAt(p);
        Object aux = firstNode.getData();

        firstNode.setData(secondNode.getData());
        secondNode.setData(aux);
    }

    @Override
    public void insertBefore(int i, Object o) {
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException();
        }

        NodeD newNode;
        NodeD requestedNode = getNodeAt(i);
        if(size == 1){
            newNode = new NodeD(o, requestedNode, null);
            head.setPrevious(newNode);
            head = newNode;
        } else {
            newNode = new NodeD(o, requestedNode, requestedNode.getPrevious());
            requestedNode.getPrevious().setNext(newNode);
            requestedNode.setPrevious(newNode);
        }

        size++;
    }

    @Override
    public void insertAfter(int i, Object o) {
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException();
        }

        NodeD newNode;
        NodeD requestedNode = getNodeAt(i);
        if(i == size-1){
            newNode = new NodeD(o, null, requestedNode);
            tail.setNext(newNode);
            tail = newNode;
        } else {
            newNode = new NodeD(o, requestedNode.getNext(), requestedNode);
            requestedNode.getNext().setPrevious(newNode);
            requestedNode.setNext(newNode);
        }

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

        NodeD requestedNode = getNodeAt(i);
        if(i == 0){
            requestedNode.getNext().setPrevious(null);
            head = requestedNode.getNext();
        }else if(i == size-1){
            requestedNode.getPrevious().setNext(null);
            tail = requestedNode.getPrevious();
        }else{
            requestedNode.getPrevious().setNext(requestedNode.getNext());
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

    private NodeD positionFindFunc(int i, Object o, NodeD actualNode){
        if(actualNode.getData() == o){
            return actualNode;
        }

        if(i == size-1){
            if(actualNode.getData() == o){
                return actualNode;
            }else{
                return new NodeD(null, null, null);
            }
        }

        return positionFindFunc(i+1, o, actualNode.getNext());
    }

    public NodeD positionFind(Object o){
        NodeD foundNode = positionFindFunc(0, o, head);

        if(foundNode.getData() == null){
            throw new NoSuchElementException();
        }

        return foundNode;
    }
}
