package HerancaPolimorfismo.Frete;

public class Frete {
    private double distancia;
    private double peso;

    public Frete(double distancia, double peso){
        this.distancia = distancia;
        this.peso = peso;
    }


    public double getValorFrete(){
        return (0.01 * (distancia * peso));
    }

    public String toString(){
        return ("Distancia: " + distancia + " Peso: " + peso + " Valor do Frete: " + getValorFrete());
    }


    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
