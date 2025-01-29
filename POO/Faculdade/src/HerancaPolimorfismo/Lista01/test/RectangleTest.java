package HerancaPolimorfismo.Lista01.test;

import HerancaPolimorfismo.Lista01.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(15.0, 30.0);

        System.out.println(rect1.calcArea());
        System.out.println(rect1.getDiagonal());
        System.out.println(rect1.toString());
    }
}
