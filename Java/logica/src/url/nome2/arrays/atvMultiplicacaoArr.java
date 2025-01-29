package url.nome2.arrays;
import java.util.Random;

public class atvMultiplicacaoArr {
    public static void main(String[] args) {
        int[] valores1 = new int[9];
        int[] valores2 = new int[9];
        Random numerosAleatorios = new Random();
        for (int i = 0; i < 9; i++) {
            valores1[i] = numerosAleatorios.nextInt(10);
        }
        for (int i = 0; i < 9; i++) {
            valores2[i] = numerosAleatorios.nextInt(10);
        }
        for (int i = 0; i < valores1.length; i++) {
            int multiplicacaoResultado = valores1[i]*valores2[i];
            System.out.println("O resultado de " + valores1[i] + "x" + valores2[i] + " É:" + multiplicacaoResultado);
        }
    }
}
