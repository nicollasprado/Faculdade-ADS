package Records.Lista01;

// Crie um record Produto com os campos nome (String) e preco (double). Instancie um produto e crie uma cópia com o preço alterado.

public class q8 {
    private record Produto(String nome, double preco){}

    public static void main(String[] args) {
        Produto product = new Produto("Bola", 50);

        Produto productCopy = new Produto(product.nome, 100);
        System.out.println(product);
        System.out.println(productCopy);
    }
}
