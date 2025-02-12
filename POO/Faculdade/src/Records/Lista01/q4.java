package Records.Lista01;

import java.util.List;

// Crie um record chamado Pedido com os campos id (int) e itens (List). Garanta que a lista de itens seja imutável.

public class q4 {
    private record Pedido(int id, List<String> itens){
        public Pedido {
            itens = List.copyOf(itens);
        }
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido(1, List.of("Suco", "Coxinha"));

        System.out.println(pedido.itens);
    }
}
