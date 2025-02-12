package Records.Lista01;

//  Crie um record chamado Email com o campo endereco (String). Adicione um construtor personalizado para validar se o endereço contém o caractere @.

public class q2 {
    private record Email(String endereco){
        public Email{
            if(!endereco.matches("^[A-Za-z].+@[A-Za-z.].+$")){
                throw new IllegalArgumentException("Endereço de email inválido!");
            }
        }
    }

    public static void main(String[] args) {
        Email mailOne = new Email("nicollas@teste.com");
        //Email mailTwo = new Email("@teste.com");

        System.out.println(mailOne.endereco());
        //System.out.println(mailTwo);
    }
}
