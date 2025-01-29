package url.nome2.classes.introducaoClasses.testeclasses;
import url.nome2.classes.introducaoClasses.dominioclasses.pessoaClasses;

public class testeClasses {
    public static void main(String[] args) {
        pessoaClasses joao = new pessoaClasses();
        joao.nome = "joao";
        joao.idade = 23;
        joao.sexo = 'M';
        System.out.println(joao.nome);
        System.out.println(joao.idade);
        System.out.println(joao.sexo);
    }
}
