package url.nome2.estruturascondicionais.ifelse;
import java.util.InputMismatchException;
import java.util.Scanner;

public class atvImpostos {
    public static void main(String[] args){
        int salario;
        float taxa = 0F;
        try(Scanner dadosTeclado = new Scanner(System.in)){
            System.out.println("Digite seu Salário");
            salario = dadosTeclado.nextInt();
            if(salario <= 34712){
                taxa = 9.7F;
            }else if(salario > 34712 && salario <= 68507){
                taxa = 37.35F;
            }else if(salario >= 68508){
                taxa = 49.5F;
            }
            System.out.println("Digite (0) para abrir o menu!");
            while(dadosTeclado.nextInt() != 3){
                System.out.println("Escolha uma opção");
                System.out.println("1. Taxa a ser cobrada");
                System.out.println("2. Valor a ser pago");
                int valorCapturado = dadosTeclado.nextInt();
                switch(valorCapturado){
                    case 1:
                        System.out.println("Taxa cobrada: " + taxa);
                        break;
                    case 2:
                        float valorPagar = salario / taxa;
                        System.out.println("Valor a ser pago: " + valorPagar);
                        break;
                    default:
                        break;
                }
            }
        }catch(InputMismatchException tipoErrado){
            System.out.println("O valor digitado não é um número!");
        }
    }
}
