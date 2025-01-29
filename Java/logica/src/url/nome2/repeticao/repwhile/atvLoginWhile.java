package url.nome2.repeticao.repwhile;
import java.util.Scanner;

public class atvLoginWhile {
    public static void main(String[] args){
        try(Scanner dadosTeclado = new Scanner(System.in)){
            final String usuarioCorreto = "Pedro23"; // final = nao pode mudar;
            final String senhaCorreta = "pedroSenha14";
            String usuarioCapturado = "";
            String senhaCapturada = "";
            while(usuarioCapturado.equals(usuarioCorreto) == false || senhaCapturada.equals(senhaCorreta) == false){
                System.out.println("Digite Seu Usuário:");
                usuarioCapturado = dadosTeclado.nextLine();
                System.out.println("Digite Sua Senha:");
                senhaCapturada = dadosTeclado.nextLine();
                if(usuarioCapturado.equals(usuarioCorreto) && senhaCapturada.equals(senhaCorreta)){
                    System.out.println("Acesso Concedido!");
                    break;
                }else{
                    System.out.println("Acesso Negado!");
                }
            }
        }
    }
}
