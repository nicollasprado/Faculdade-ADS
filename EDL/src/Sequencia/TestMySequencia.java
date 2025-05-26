package Sequencia;

public class TestMySequencia {
    public static void main(String[] args) {
        MySequencia ms = new MySequencia();

        ms.insertFirst(1);
        ms.insertAfter(0, 2);
        ms.insertFirst(-1);
        ms.insertLast(3);
        ms.print();
        ms.insertBefore(3, 25);
        ms.print();
        ms.swap(3, 4);
        ms.print();
        ms.replace(4, 4);
        ms.print();
        System.out.println(ms.getAt(0));
        System.out.println(ms.size());
        System.out.println(ms.isEmpty());
        System.out.println(ms.first() + " - " + ms.last());
        ms.removeAt(1);
        ms.print();
    }
}
