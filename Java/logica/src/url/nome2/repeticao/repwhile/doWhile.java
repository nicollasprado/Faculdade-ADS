package url.nome2.repeticao.repwhile;
import java.util.Scanner;

public class doWhile {
    public static void main(String[] args){
        int desejaContinuar = 1;
        try (Scanner dadosTeclado = new Scanner(System.in)) {
            do{
                System.out.println("PLAYER 1: Digite um número de 1 a 10");
                int num1 = dadosTeclado.nextInt();
                System.out.println("PLAYER 2: Digite um número de 1 a 10");
                int num2 = dadosTeclado.nextInt();
                System.out.println("Acertou? " + (num1 == num2));
                System.out.println("-------------------------");
                System.out.println("Deseja Continuar?");
                System.out.println("1. Sim");
                System.out.println("2. Não");
                desejaContinuar = dadosTeclado.nextInt();
            }while(desejaContinuar == 1);
        }
    }
}
