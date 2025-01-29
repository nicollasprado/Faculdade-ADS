package url.nome2.estruturascondicionais.switchcase;
import java.util.Scanner;

public class tipoDaConta {
    public static void main(String[] args){
        try(Scanner dadosTeclado = new Scanner(System.in)){
            float contaPoupancaJuros = 0.05F;
            float contaCorrenteJuros = 0.02F;
            float contaInvestimentoJuros = 0.1F;
            System.out.println("Escolha seu tipo de Conta!");
            System.out.println("(0) - Conta Poupança");
            System.out.println("(1) - Conta Corrente");
            System.out.println("(2) - Conta Investimento");
            int contaEscolhida = dadosTeclado.nextInt();
            switch(contaEscolhida){
                case 0:
                    System.out.println("Conta Poupança Escolhida!");
                    System.out.println("Juros: " + contaPoupancaJuros + "%");
                    break;
                case 1:
                    System.out.println("Conta Corrente Escolhida!");
                    System.out.println("Juros: " + contaCorrenteJuros + "%");
                    break;
                case 2:
                    System.out.println("Conta Investimento Escolhida!");
                    System.out.println("Juros: " + contaInvestimentoJuros + "%");
                    break;
                default:
                    throw new Error("Conta não encontrada!");
            }
        }catch(Exception erro){
            System.out.println("Erro encontrado: " + erro);
        }finally{
            System.out.println("Sistema Encerrado!");
        }
    }
}
