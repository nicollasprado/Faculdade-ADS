package Records.Lista01;

// Crie um record chamado Produto com os campos nome (String) e preco (double). Instancie um objeto e exiba seus valores.

public class q1 {
    private record Produto(String nome, double preco){}

    public static void main(String[] args) {
        Produto shampoo = new Produto("shampoo", 12.5);

        System.out.println(shampoo.nome + " " + shampoo.preco);
    }
}
