package Heap.FilaOrdenada.Array;

public class Heap {
    private int size = 1;
    private int capacity = 8;
    private Object[] nodes = new Object[8];

    public Heap(){
        this.nodes[0] = "firstIndex";
    }

    public void print(){
        for(Object node : this.nodes){
            System.out.print(node + ", ");
        }
        System.out.println();
    }

    private void increaseCapacity() {
        int newCapacity = capacity * 2;
        Object[] newNodes = new Object[newCapacity];

        for(int i = 0; i < size+1; i++){
            newNodes[i] = nodes[i];
        }

        this.nodes = newNodes;
        this.capacity = newCapacity;
    }

    private int compare(Object a, Object b){
        if(a instanceof Integer){
            int intA = (int) a;
            int intB = (int) b;

            int test = intA - intB;

            if(test > 1) return 1;
            if(test == 0) return 0;
            if(test < 0) return -1;
        }

        return -2;
    }

    public int size () {
        return this.size-1;
    }

    public boolean isEmpty() {
        return this.size == 1;
    }

    public Object min() {
        return this.nodes[1];
    }

    private void upheap(int valueIndex){
        int parentIndex = valueIndex / 2;

        while(parentIndex > 0){
            if(compare(nodes[parentIndex], nodes[valueIndex]) == -1){
                break;
            }

            Object aux = nodes[parentIndex];
            nodes[parentIndex] = nodes[valueIndex];
            nodes[valueIndex] = aux;

            int auxIndex = valueIndex;
            valueIndex = parentIndex;
            parentIndex = auxIndex / 2;
        }

    }

    public void insert(Object data){
        if(size+1 >= capacity) increaseCapacity();

        nodes[size] = data;

        upheap(size);

        this.size++;
    }

    private void downHeapRec(int index){
        int leftIndex = index * 2;
        int rightIndex = index * 2 + 1;

        if(nodes[leftIndex] != null && compare(nodes[leftIndex], nodes[index]) == -1){
            Object aux = nodes[index];
            nodes[index] = nodes[leftIndex];
            nodes[leftIndex] = aux;
            downHeapRec(leftIndex);
        }

        if(nodes[rightIndex] != null && compare(nodes[rightIndex], nodes[index]) == -1){
            Object aux = nodes[index];
            nodes[index] = nodes[rightIndex];
            nodes[rightIndex] = aux;
            downHeapRec(rightIndex);
        }
    }

    private void downHeap(){
        downHeapRec(1);
    }

    public Object removeMin(){
        if(size == 1) throw new RuntimeException("Empty queue");

        Object removed = nodes[1];

        nodes[1] = nodes[size-1];
        nodes[size-1] = null;
        size--;

        downHeap();

        return removed;
    }
}
