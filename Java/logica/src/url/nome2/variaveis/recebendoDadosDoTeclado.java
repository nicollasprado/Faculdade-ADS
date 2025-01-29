package url.nome2.variaveis;
import java.util.Scanner;

public class recebendoDadosDoTeclado {
    public static void main(String[] args){
        try (Scanner dadosTeclado = new Scanner(System.in)) {
            System.out.println("Digite sua idade!");
            int idade = dadosTeclado.nextInt();
            System.out.println("Digite seu nome!");
            String nome = dadosTeclado.next();
            System.out.println("Idade: " + idade);
            System.out.println("Nome: " + nome);
        }catch(Exception erro){
            System.out.println("Deu ruim: " + erro);
        }finally{
            System.out.println("Sistema Finalizado!");
        }
    }
}
