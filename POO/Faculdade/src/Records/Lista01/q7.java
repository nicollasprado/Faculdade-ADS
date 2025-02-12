package Records.Lista01;

// Crie um record Circulo com o campo raio (double).
// Use Pattern Matching para verificar se um objeto é do tipo Circulo e, em caso positivo, exiba o valor do raio.

public class q7 {
    private record Circulo(double raio){}

    public static void main(String[] args) {
        Circulo object = new Circulo(5.21);

        if(object instanceof Circulo(double raio)){
            System.out.println("É um circulo");
        }else {
            System.out.println("Não é um circulo");
        }
    }
}
