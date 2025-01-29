package HerancaPolimorfismo.Figuras.Test;

import HerancaPolimorfismo.Figuras.Quadrado;
import HerancaPolimorfismo.Figuras.Retangulo;

public class TestFiguras {
    public static void main(String[] args) {
        Retangulo rect = new Retangulo(12.1, 16.7);
        System.out.println("Retangulo\nArea: " + rect.calcArea() + "\nDiagonal: " + rect.calcDiagonal() + "\ntoString: " + rect.toString() + "\n");
        Quadrado square = new Quadrado(19.2);
        System.out.println("Quadrado\nArea: " + square.calcArea() + "\nDiagonal: " + square.calcDiagonal() + "\ntoString: " + square.toString());
    }
}
