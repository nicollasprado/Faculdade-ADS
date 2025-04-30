package Fila.Projeto;

public class Test {
    public static void main(String[] args) {
        MyQueue deque = new MyQueue();

        System.out.println(deque.getSize() + " " + deque.isEmpty());
        deque.enqueue(1);
        deque.enqueue(2);
        deque.enqueue(3);
        deque.enqueue(4);
        deque.enqueue(5);
        deque.enqueue(6);
        deque.enqueue(7);
        deque.enqueue(8);
        deque.print();
        deque.enqueue(9);
        deque.print();

        deque.dequeue();
        deque.dequeue();
        deque.print();
        deque.enqueue(10);
        deque.enqueue(11);
        deque.enqueue(12);
        deque.enqueue(13);
        deque.enqueue(14);
        deque.enqueue(15);
        deque.enqueue(16);
        deque.enqueue(17);
        deque.enqueue(18);
        deque.print();
        deque.enqueue(19);
        deque.print();
    }
}
