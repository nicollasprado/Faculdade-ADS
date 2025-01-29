package HerancaPolimorfismo.Construtora;

public class Motorista extends Funcionario{
    private String cnh;


    public Motorista(String nome, String email, String fone, String cnh){
        super(nome, email, fone);
        this.cnh = cnh;
    }



    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
