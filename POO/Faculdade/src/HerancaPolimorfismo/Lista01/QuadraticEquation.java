package HerancaPolimorfismo.Lista01;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private Double delta;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        genDelta();
    }

    public void genDelta(){
        delta = (b * b) - (4 * a * c);
    }

    public double[] raizesReais(){
        if(delta < 0){
            throw new IllegalArgumentException("Não há raíz real para os valores especificados");
        }else if(delta == 0){
            double[] roots = new double[1];
            roots[0] = (b * -1) / (2 * a);
            return roots;
        }else{
            double[] roots = new double[2];
            roots[0] = ((b * -1) + Math.sqrt(delta)) / (2 * a);
            roots[1] = ((b * -1) - Math.sqrt(delta)) / (2 * a);
            return roots;
        }
    }

    public String toString(){
        return a + "x^2 + " + b + "x + " + c;
    }




    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Double getDelta() {
        return delta;
    }
}
