package Fila.Atv;

public class SimpleLinkedList {
    private int size = 0;
    private Node head = null;
    private Node tail = null;

    public SimpleLinkedList(){}

    public void print(){
        Node actualNode = head;
        for(int i = 0; i < size; i++){
            System.out.print(actualNode.getData() + ", ");
            actualNode = actualNode.getNext();
        }
        System.out.println("");
    }

    public Object getFirst(){
        if(size == 0 || head == null){
            throw new IndexOutOfBoundsException();
        }

        return head.getData();
    }

    public Object getLast(){
        if(size == 0 || tail == null){
            throw new IndexOutOfBoundsException();
        }

        return tail.getData();
    }

    public int size(){
        return this.size();
    }

    public void add(Object data){
        if(size == 0){
            Node newNode = new Node(data, null);
            head = newNode;
            tail = newNode;
        }else{
            Node newNode = new Node(data, null);
            tail.setNext(newNode);
            tail = newNode;
        }

        size++;
    }

    public Object remove(int index){
        if(index >= size){
            throw new IndexOutOfBoundsException();
        }

        Node previousNode = head; // this is the node of requested index-1
        for(int i = 0; i < size; i++){
            if(i == index-1){
                break;
            }

            previousNode = previousNode.getNext();
        }

        Node requestedIndex;
        if(index == 0){
            requestedIndex = head;
            head = requestedIndex.getNext();
        } else if(index == size-1){
            requestedIndex = previousNode.getNext();
            previousNode.setNext(requestedIndex.getNext());
            tail = previousNode;
        } else{
            requestedIndex = previousNode.getNext();
            previousNode.setNext(requestedIndex.getNext());
        }

        size--;

        if(size == 1){
            head = previousNode;
            tail = previousNode;
        }

        return requestedIndex.getData();
    }

    public Object pop(){
        if(size == 0){
            throw new IndexOutOfBoundsException();
        }

        Object obj;

        if(size == 1){
            obj = head.getData();
            head = null;
            tail = null;
        }else{
            Node actualNode = head; // it will be tail previous node
            for(int i = 0; i < size; i++){
                if(i == size-2){
                    break;
                }

                actualNode = actualNode.getNext();
            }

            actualNode.setNext(null);
            obj = tail.getData();
            tail = actualNode;
        }

        size--;
        return obj;
    }

}
