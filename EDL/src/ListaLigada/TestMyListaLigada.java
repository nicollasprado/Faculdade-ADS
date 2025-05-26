package ListaLigada;

public class TestMyListaLigada {
    public static void main(String[] args) {
        MyListaLigada mll = new MyListaLigada();

        mll.insertFirst(1);
        mll.insertAfter(0, 2);
        mll.insertAfter(1, 3);
        mll.insertLast(4);
        mll.print();
        mll.swap(0, 1);
        mll.print();
        mll.replace(0, 20);
        mll.print();
        mll.insertBefore(2, 10);
        mll.print();
        mll.removeAt(0);
        mll.print();
        System.out.println(mll.after(1));
        System.out.println(mll.before(1));
        System.out.println(mll.first());
        mll.insertAfter(3, 5);
        mll.insertAfter(4, 6);
        mll.insertAfter(5, 7);
        mll.insertAfter(6, 8);
        mll.insertAfter(7, 9);
        mll.insertAfter(8, 10);
        mll.print();
        System.out.println("Size: " + mll.size());
    }
}
