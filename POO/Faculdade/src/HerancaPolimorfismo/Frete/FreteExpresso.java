package HerancaPolimorfismo.Frete;

public class FreteExpresso extends Frete{
    private double seguro;

    public FreteExpresso(double distancia, double peso, double seguro){
        super(distancia, peso);
        this.seguro = seguro;
    }

    @Override
    public double getValorFrete(){
        return (super.getValorFrete() + (seguro * 0.01));
    }

    @Override
    public String toString(){
        return (super.toString() + " Seguro: " + seguro + " Valor do Frete: " + getValorFrete());
    }
}
