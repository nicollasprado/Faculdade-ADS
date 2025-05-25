package Fila.Atv;

public class TestSimpleLinkedList {
    public static void main(String[] args) {
        SimpleLinkedList sll = new SimpleLinkedList();

        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.print();
        sll.remove(2);
        sll.print();
        System.out.println("Pop: " + sll.pop());
        sll.print();
        System.out.println(sll.getFirst());
        System.out.println(sll.getLast());
        sll.add(10);
        sll.add(11);
        sll.add(12);
        sll.add(13);
        sll.print();
        sll.remove(0);
        sll.print();
        System.out.println(sll.getFirst() + " " + sll.getLast());
    }
}
