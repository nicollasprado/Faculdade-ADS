package url.nome2.estruturascondicionais.switchcase;
import java.util.InputMismatchException;
import java.util.Scanner;

public class atvDiasDaSemana {
    public static void main(String[] args){
        try (Scanner dadosTeclado = new Scanner(System.in)) {
            System.out.println("Digite um valor:");
            int valorCapturado = dadosTeclado.nextInt();
            String diaDaSemana = "";
            switch(valorCapturado){
                case 1:
                    diaDaSemana = "Segunda-Feira";
                    break;
                case 2:
                    diaDaSemana = "Terça-Feira";
                    break;
                case 3:
                    diaDaSemana = "Quarta-Feira";
                    break;
                case 4:
                    diaDaSemana = "Quinta-Feira";
                    break;
                case 5:
                    diaDaSemana = "Sexta-Feira";
                    break;
                case 6:
                    diaDaSemana = "Sábado";
                    break;
                case 7:
                    diaDaSemana = "Domingo";
                    break;
                default:
                throw new InputMismatchException("Dia não encontrado!");
            }
            System.out.println("Dia Correspondente: " + diaDaSemana);
        }catch(Exception erro){
            System.out.println(erro);
        }finally{
            System.out.println("Sistema Finalizado!");
        }
    }
}
