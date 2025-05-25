package Vetor.Projeto;

public class TestVectorLL {
    public static void main(String[] args) {
        VectorLinkedList vll = new VectorLinkedList();

        vll.insertAt(0, 1);
        vll.insertAt(1, 2);
        vll.insertAt(2, 3);
        vll.print();
        vll.insertAt(2, 3);
        vll.print();
        vll.replace(0, 100);
        vll.print();
        vll.removeAt(1);
        vll.removeAt(0);
        vll.removeAt(1);
        vll.print();
        System.out.println(vll.getAt(0));
    }
}
