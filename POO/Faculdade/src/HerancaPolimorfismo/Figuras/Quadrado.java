package HerancaPolimorfismo.Figuras;

public class Quadrado extends Retangulo {

    public Quadrado(double lado) {
        super(lado, lado); // Define base e altura como o mesmo valor de lado
    }


    public double getLado(){
        return getBase();
    }


    public void setLado(double lado){
        setBase(lado);
        setAltura(lado);
    }

    @Override
    public void setAltura(double altura){
        setLado(altura);
    }

    @Override
    public void setBase(double base){
        setLado(base);
    }


    @Override
    public String toString() {
        return ("lado: " + getBase());
    }
}
