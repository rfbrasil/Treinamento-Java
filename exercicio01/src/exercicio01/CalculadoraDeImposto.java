package exercicio01;

public class CalculadoraDeImposto {

	public double executaCalculo(Produto produto, Imposto imposto) {

		// Strategy!
		return imposto.calcula(produto);

	}
}
