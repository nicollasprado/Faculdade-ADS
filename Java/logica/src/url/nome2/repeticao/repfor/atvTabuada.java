package url.nome2.repeticao.repfor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class atvTabuada {
    public static void main(String[] args) {
        try(Scanner dadosTeclado = new Scanner(System.in)){
            System.out.println("Digite um número para resultar sua tabuada:");
            int valor = dadosTeclado.nextInt();
            for(int i = 1; i <= 10; i++){
                System.out.println(valor+" vezes "+i+" É igual a: "+(valor*i));
        }
        }catch(InputMismatchException erro){
            System.out.println("O valor não é um número!");
        }
    }
}
