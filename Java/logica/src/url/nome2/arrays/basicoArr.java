package url.nome2.arrays;

public class basicoArr {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 3;
        double nota4 = 6;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(media);
        System.out.println("------------------------");
        // para array
        double[] notas = new double[4];
        notas[0] = 7.5;
        notas[1] = 8.0;
        notas[2] = 3.0;
        notas[3] = 6.0;
        for (double d : notas) {
            System.out.println(d);
        }
        System.out.println("---------------------");
        // outra forma
        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
        System.out.println("-----------------------");
        // outra forma de definir o array
        double[] notas2 = {7.5, 8.0, 3.0, 3.0, 6.0}; // já é definido os valores e tamanho
        System.out.println(notas2[1]);
    }
}
