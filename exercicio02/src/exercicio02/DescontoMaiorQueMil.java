package exercicio02;

public class DescontoMaiorQueMil implements Desconto {


	private Desconto proximo;

	@Override
	public double calcula(Carrinho carrinho) {
		if (carrinho.getValor() > 1000) {
			return carrinho.getValor() * 0.1;
		} else {
			return proximo.calcula(carrinho);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;		
	}
}
