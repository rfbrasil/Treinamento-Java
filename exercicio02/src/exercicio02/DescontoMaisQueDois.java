package exercicio02;

public class DescontoMaisQueDois implements Desconto {
	
	private Desconto proximo;

	@Override
	public double calcula(Carrinho carrinho) {
		if (carrinho.getListaProdutos().size() > 2) {
			return carrinho.getValor() * 0.05;
		} else {
			return proximo.calcula(carrinho);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}

}
