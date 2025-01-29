package url.nome2.estruturascondicionais.ifelse;
import java.util.Scanner;

public class atvLogin {
    public static void main(String[] args){
        String usuario = null;
        try(Scanner dadosTeclado = new Scanner(System.in)){
            System.out.println("Digite seu Usuário:");
            usuario = dadosTeclado.next();
            if(usuario.equals("") || usuario.toLowerCase().equals("admin") || usuario.equalsIgnoreCase("administrador")){
                throw new Error("Usuário Inválido!");
            }else{
                System.out.println(usuario + " Cadastrado com sucesso!");
            }
        }catch(Exception erro){
            System.out.println(erro);
        }finally{
            System.out.println("Sistema Finalizado!");
        }
    }
}
