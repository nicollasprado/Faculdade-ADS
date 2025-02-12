package Records.Lista01;

// Refatorar uma classe para record

public class q6 {
    private record Produto(String nome, double preco){
        @Override
        public String toString(){
            return "Produto[nome=" + nome + ", preco=" + preco + "]";
        }
    }

    public static void main(String[] args) {
        Produto product = new Produto("Celular", 829);

        System.out.println(product.toString());
    }
}
