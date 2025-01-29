package url.nome2.repeticao.repwhile;
import java.util.Scanner;

public class atvImpares {
    public static void main(String[] args){
        try(Scanner dadosTeclado = new Scanner(System.in)){
            int valor = 0;
            System.out.println("Digite um valor:");
            int valorDigitado = dadosTeclado.nextInt();
            while(valor <= valorDigitado){
                if(valor%2 != 0){
                    System.out.println("Valor ímpar encontrado: " + valor);
                }
                valor++;
            }
        }finally{
            System.out.println("Sistema Encerrado!");
        }
    }
}
