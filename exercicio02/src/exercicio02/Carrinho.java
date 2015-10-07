package exercicio02;

import java.util.List;

public class Carrinho {

	private double valor;
	private List<Produto> listaProdutos;
	
	public Carrinho(double valor, List<Produto> produtos){
		this.valor = valor;
		this.listaProdutos = produtos;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	
}
