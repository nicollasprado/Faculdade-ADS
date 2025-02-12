package Records.Lista01;

// Adicione um método ao record Produto (criado no Exercício 1) que retorne uma string no formato: Produto: nome, Preço: R$preco.

public class q3 {
    private record Produto(String nome, double preco){
        @Override
        public String toString() {
            return "Produto: " + nome + ", Preço: R$ " + preco;
        }
    }

    public static void main(String[] args) {
        Produto product = new Produto("televisao", 1200.0);

        System.out.println(product.toString());
    }
}
