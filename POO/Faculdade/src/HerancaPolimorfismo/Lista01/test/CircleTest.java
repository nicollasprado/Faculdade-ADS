package HerancaPolimorfismo.Lista01.test;

import HerancaPolimorfismo.Lista01.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(3.5, 3);

        System.out.println(circle1.area());
        System.out.println(circle1.perimeter());

        System.out.println(circle2.area());
        System.out.println(circle2.perimeter());
    }
}
