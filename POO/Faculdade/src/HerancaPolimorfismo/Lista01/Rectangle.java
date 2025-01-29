package HerancaPolimorfismo.Lista01;

public class Rectangle {
    private double base;
    private double height;

    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }



    public double calcArea(){
        return base * height;
    }

    public double getDiagonal(){
        return Math.sqrt(((base * base) + (height * height)));
    }

    public String toString(){
        return "A base do retângulo mede " + base + " e a sua altura é " + height;
    }




    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
