package Records.Lista01;

public class q1 {

    public record Produto(String nome, double preco){}

    public static void main(String[] args) {
        Produto shampoo = new Produto("shampoo", 12.5);

        System.out.println(shampoo.nome + " " + shampoo.preco);
    }
}
