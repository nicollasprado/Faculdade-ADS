package Records.Lista01;

public class q2 {

    public record Email(String endereco){
        public Email{
            // arrumar regex
            if(!endereco.matches("^(?=.*[A-Za-z]).+(?=.+@).+$")){
                throw new IllegalArgumentException("Endereço de email inválido!");
            }
        }
    }

    public static void main(String[] args) {
        Email mailOne = new Email("nicollas@teste.com");
        Email mailTwo = new Email("@teste.com");

        System.out.println(mailOne);
        System.out.println(mailTwo);
    }
}
