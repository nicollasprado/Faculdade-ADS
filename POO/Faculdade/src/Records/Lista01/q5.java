package Records.Lista01;

// Crie uma interface Calculavel com um método double calcularArea(). Implemente essa interface em um record Circulo que tenha o campo raio (double).

public class q5 {
    private interface Calculavel {
        double calcularArea();
    }

    private record Circulo(double raio) implements Calculavel {
        @Override
        public double calcularArea() {
            return 3.14 * (raio * raio);
        }
    }

    public static void main(String[] args) {
        Circulo circle = new Circulo(2.319);

        System.out.println(circle.calcularArea());
    }
}
