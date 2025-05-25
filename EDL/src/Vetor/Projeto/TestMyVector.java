package Vetor.Projeto;

public class TestMyVector {
    public static void main(String[] args) {
        MyVector mv = new MyVector();

        mv.insertAt(0, 2);
        mv.insertAt(1, 3);
        mv.print();
        mv.insertAt(0, 4);
        mv.print();
        System.out.println(mv.getAt(0));
        mv.replace(2, 10);
        mv.print();
        mv.insertAt(3, 20);
        mv.insertAt(4, 30);
        mv.print();
        mv.removeAt(3);
        mv.print();
        mv.removeAt(0);
        mv.print();
    }
}
