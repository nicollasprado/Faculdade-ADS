package url.nome2.estruturascondicionais.ifelse;
public class atvNatacao {
    public static void main(String[] args){
        String nome = "Pedro";
        int idade = 18;
        if(idade <= 10){
            System.out.println(nome+" participará da categoria Infantil");
        }else if(idade >= 11 && idade <= 15){
            System.out.println(nome+" participará da categoria Juvenil");
        }else if(idade >= 16 && idade <= 19){
            System.out.println(nome+" participará da categoria Pré-adulto");
        }else if(idade > 20){
            System.out.println(nome+" participará da categoria Adulto");
        }else{
            System.out.println("O usuario nao se encaixa em nenhuma categoria!");
        }
    }
}
