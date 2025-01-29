package url.nome2.repeticao.repwhile;
import java.util.Scanner;

public class atvMenu {
    public static void main(String[] args){
        System.out.println("Para começar digite (0)");
        try(Scanner dadosTeclado = new Scanner(System.in)){
            while(dadosTeclado.nextInt() != 3){
                System.out.println("Escolha uma opção:");
                System.out.println("1. Calcular imposto");
                System.out.println("2. Depositar salário");
                System.out.println("3. Sair");
                if(dadosTeclado.nextInt() == 3){
                    break;
                }
            }
        }finally{
            System.out.println("Sistema Finalizado!");
        }
    }
}
