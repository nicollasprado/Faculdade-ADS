package Vetor.Projeto;

import Vetor.IVetor;

public class VectorLinkedList implements IVetor {
    private int size = 0;
    private NodeD head = null;
    private NodeD tail = null;

    public VectorLinkedList(){}

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
    public Object getAt(int i) {
        return getNodeAt(i).getData();
    }

    @Override
    public Object replace(int i, Object o) {
        if(i >= size){
            throw new IndexOutOfBoundsException();
        }

        NodeD nodeAt = getNodeAt(i);
        Object oldData = nodeAt.getData();
        nodeAt.setData(o);

        return oldData;
    }

    @Override
    public void insertAt(int i, Object o) {
        if(i > size){
            throw new IndexOutOfBoundsException();
        }

        System.out.println("Size: " + size);

        if(size == 0){
            NodeD newNodeD = new NodeD(o, null, null);
            tail = newNodeD;
            head = newNodeD;
        }else{
            if(i == size){
                NodeD newNode = new NodeD(o, null, tail);
                tail.setNext(newNode);
                tail = newNode;
            } else if(i == size-1){
                NodeD newNode = new NodeD(o, null, tail);
                tail.setNext(newNode);
                tail = newNode;
            }else if(i == 0){
                NodeD newNode = new NodeD(o, head.getNext(), null);
                head.getNext().setPrevious(newNode);
                head = newNode;
            }else{
                NodeD nodeAt = getNodeAt(i);
                NodeD newNode = new NodeD(o, nodeAt.getNext(), nodeAt.getPrevious());
                nodeAt.getNext().setPrevious(newNode);
                nodeAt.getPrevious().setNext(newNode);
            }
        }

        size++;
    }

    @Override
    public Object removeAt(int i) {
        if(i >= size){
            throw new IndexOutOfBoundsException();
        }

        NodeD nodeAt = getNodeAt(i);

        if(i == 0){
            NodeD afterHead = nodeAt.getNext();
            afterHead.setPrevious(null);
            head = afterHead;
        }else if(i == size-1){
            NodeD beforeTail = nodeAt.getPrevious();
            beforeTail.setNext(null);
            tail = beforeTail;
        }else{
            nodeAt.getNext().setPrevious(nodeAt.getPrevious());
            nodeAt.getPrevious().setNext(nodeAt.getNext());
        }

        size--;
        return nodeAt.getData();
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
