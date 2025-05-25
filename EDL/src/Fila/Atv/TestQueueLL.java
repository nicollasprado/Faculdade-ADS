package Fila.Atv;

public class TestQueueLL {
    public static void main(String[] args) {
        QueueLinkedList qll = new QueueLinkedList();

        qll.enqueue(1);
        qll.enqueue(2);
        qll.enqueue(3);
        qll.print();
        qll.dequeue();
        qll.print();
        qll.enqueue(10);
        qll.enqueue(11);
        qll.enqueue(12);
        qll.enqueue(13);
        qll.print();
        qll.dequeue();
        qll.print();
    }
}
