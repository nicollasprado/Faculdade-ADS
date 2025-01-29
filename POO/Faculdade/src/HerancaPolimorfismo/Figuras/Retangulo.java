package HerancaPolimorfismo.Figuras;

public class Retangulo{
    private double base;
    private double altura;

    // Construtor
    protected Retangulo(){}

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    // Metodos
    public double calcArea(){
        return (base * altura);
    }

    public double calcDiagonal(){
        return (Math.sqrt((base * base) +(altura * altura)));
    }

    public String toString(){
        return ("base: " + base + " altura: " + altura);
    }




    // Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // Setters
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
