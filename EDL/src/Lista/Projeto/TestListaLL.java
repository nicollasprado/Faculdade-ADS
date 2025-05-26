package Lista.Projeto;

public class TestListaLL {
    public static void main(String[] args) {
        ListaLinkedList lll = new ListaLinkedList();

        lll.insertFirst(1);
        lll.insertAfter(0, 2);
        lll.insertAfter(1, 3);
        lll.insertLast(4);
        lll.print();
        lll.swap(0, 1);
        lll.print();
        lll.replace(0, 20);
        lll.print();
        lll.insertBefore(2, 10);
        lll.print();
        lll.removeAt(0);
        lll.print();
        System.out.println(lll.after(1));
        System.out.println(lll.before(1));
        System.out.println(lll.first());
        lll.insertAfter(3, 5);
        lll.insertAfter(4, 6);
        lll.insertAfter(5, 7);
        lll.insertAfter(6, 8);
        lll.insertAfter(7, 9);
        lll.insertAfter(8, 10);
        lll.print();
        System.out.println("Size: " + lll.size());
    }
}
