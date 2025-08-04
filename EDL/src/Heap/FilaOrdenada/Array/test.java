package Heap.FilaOrdenada.Array;

public class test {
    public static void main(String[] args) {
        Heap h = new Heap();

        h.insert(2);
        h.insert(5);
        h.insert(6);
        h.insert(9);
        h.insert(7);
        h.insert(1);
        h.insert(1);
        h.print();
        h.removeMin();
        h.print();
        h.removeMin();
        h.print();
        h.removeMin();
        h.print();
        h.removeMin();
        h.print();
        h.removeMin();
        h.print();
        h.removeMin();
        h.print();
        h.removeMin();
        h.print();
        h.removeMin();
        h.print();
    }
}
