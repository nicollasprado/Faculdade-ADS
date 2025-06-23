package Arvore.Generica;

public class AGenericaTest {
    public static void main(String[] args) {
        AGenerica tree = new AGenerica(new AGenNode(1));
        tree.addNode(tree.root(), 2);
        AGenNode middle = tree.addNode(tree.root(), 3);
        tree.addNode(tree.root(), 4);
        tree.addNode(middle, 5);
        System.out.println("Height: " + tree.height());
        tree.print();
    }
}
