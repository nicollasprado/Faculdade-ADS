package HerancaPolimorfismo.Lista01;

public class Circle {
    private double radius;
    private double pi = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, double pi){
        this.radius = radius;
        this.pi = pi;
    }


    public double area() {
        return this.pi * (this.radius * this.radius);
    }

    public double perimeter() {
        return 2 * this.pi * radius;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
