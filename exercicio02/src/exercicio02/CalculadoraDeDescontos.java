package exercicio02;

public class CalculadoraDeDescontos {

	public double calcula(Carrinho carrinho) {
		//Chain of Responsability
		Desconto maiorQueMil = new DescontoMaiorQueMil();
		Desconto maisQueDois = new DescontoMaisQueDois();
		
		//não esquecer de criar o ultimo elo da corrente
		Desconto zero = new DescontoZero();
		
		maiorQueMil.setProximo(maisQueDois);
		maisQueDois.setProximo(zero);
		
		return maiorQueMil.calcula(carrinho);

	}
}
