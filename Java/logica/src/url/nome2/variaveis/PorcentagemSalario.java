package url.nome2.variaveis;
public class PorcentagemSalario {
    public static void main(String[] args){
        float salario = 1000.10F; // o F indica que é float
        float porcentagem = 10;
        float calcularPorcentagem = (salario*porcentagem)/100;
        System.out.println(porcentagem+"% de " + salario + " é igual a: " + calcularPorcentagem);
    }
}
