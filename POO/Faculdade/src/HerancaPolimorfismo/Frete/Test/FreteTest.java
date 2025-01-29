package HerancaPolimorfismo.Frete.Test;

import HerancaPolimorfismo.Frete.Frete;
import HerancaPolimorfismo.Frete.FreteExpresso;

public class FreteTest {
    public static void main(String[] args) {
        Frete freteComum = new Frete(200, 250);
        System.out.println("Frete Comum\nValor do Frete: " + freteComum.getValorFrete() + "\ntoString: " + freteComum.toString());
        FreteExpresso freteExpresso = new FreteExpresso(200, 250, 1000);
        System.out.println("Frete Expresso\nValor do Frete: " + freteExpresso.getValorFrete() + "\ntoString: " + freteExpresso.toString());
    }
}
