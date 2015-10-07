package exercicio01;

public class ISS implements Imposto {

	public double calcula(Produto produto){
		return produto.getValor() * 0.05;
	}
}
