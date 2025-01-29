package HerancaPolimorfismo.Lista01.test;

import HerancaPolimorfismo.Lista01.QuadraticEquation;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        // 1 raíz
        QuadraticEquation equation = new QuadraticEquation(4, 4, 1);
        // Nenhuma raíz
        QuadraticEquation equation2 = new QuadraticEquation(1, 4, 5);
        // 2 raízes
        QuadraticEquation equation3 = new QuadraticEquation(1, 5, 6);

        System.out.println(equation.getDelta());
        System.out.println(equation.raizesReais()[0]);
        System.out.println(equation.toString() + "\n");

        try {
            System.out.println(equation2.getDelta());
            System.out.println(equation2.raizesReais()[0]);
            System.out.println(equation2.toString());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage() + "\n");
        }

        System.out.println(equation3.getDelta());
        double[] roots = equation3.raizesReais();
        System.out.println(roots[0] + " " + roots[1]);
        System.out.println(equation3.toString() + "\n");
    }
}
