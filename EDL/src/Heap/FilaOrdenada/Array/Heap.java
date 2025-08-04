package Heap.FilaOrdenada.Array;

// https://lerngruppe.gitbooks.io/algo2015/content/02_Basic_Data_Structures/02_08_Heaps.html
// https://www.cs.purdue.edu/cgvlab/courses/251/lectures/slides/02.16-Heap.pdf

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
        if(size == capacity) increaseCapacity();

        nodes[size] = data;

        upheap(size);

        this.size++;
    }

    private void downHeap(){
        int iterIndex = 1;

        if(size == 1) return;

        while(true){
            int leftIndex = iterIndex * 2;
            int rightIndex = iterIndex * 2 + 1;

            if(compare(nodes[leftIndex], nodes[iterIndex]) == -1){}
        }
    }

    public Object removeMin(){
        Object removed = nodes[1];

        nodes[1] = nodes[size];
        size--;

        downHeap();

        return removed;
    }
}
