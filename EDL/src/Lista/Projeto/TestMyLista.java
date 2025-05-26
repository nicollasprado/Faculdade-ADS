package Lista.Projeto;

public class TestMyLista {
    public static void main(String[] args) {
        MyLista ml = new MyLista();

        ml.insertFirst(1);
        ml.insertAfter(0, 2);
        ml.insertAfter(1, 3);
        ml.insertLast(4);
        ml.print();
        ml.swap(0, 1);
        ml.print();
        ml.replace(0, 20);
        ml.print();
        ml.insertBefore(2, 10);
        ml.print();
        ml.removeAt(0);
        ml.print();
        System.out.println(ml.after(1));
        System.out.println(ml.before(1));
        System.out.println(ml.first());
        ml.insertAfter(3, 5);
        ml.insertAfter(4, 6);
        ml.insertAfter(5, 7);
        ml.insertAfter(6, 8);
        ml.insertAfter(7, 9);
        ml.insertAfter(8, 10);
        ml.print();
        System.out.println("Size: " + ml.size());
    }
}
