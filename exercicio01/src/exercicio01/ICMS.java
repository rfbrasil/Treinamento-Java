package exercicio01;

public class ICMS implements Imposto {

	public double calcula(Produto produto) {		
		return produto.getValor() * 0.18;
	}
}
