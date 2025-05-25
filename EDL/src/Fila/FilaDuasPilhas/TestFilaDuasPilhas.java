package Fila.FilaDuasPilhas;

public class TestFilaDuasPilhas {
    public static void main(String[] args) {
        FilaDuasPilhasImpl fdp = new FilaDuasPilhasImpl();

        fdp.enqueue(1);
        fdp.enqueue(2);
        fdp.enqueue(3);
        fdp.print();
        System.out.println("Deque: " + fdp.dequeue());
        fdp.print();
        fdp.enqueue(10);
        fdp.enqueue(20);
        fdp.print();
        System.out.println("Deque: " + fdp.dequeue());
        fdp.print();
        System.out.println("Deque: " + fdp.dequeue());
        fdp.print();
        System.out.println("Deque: " + fdp.dequeue());
        fdp.print();
    }
}
