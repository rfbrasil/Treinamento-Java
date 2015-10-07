package exercicio01a;

public class CalculadoraDeImposto {

	public double executaCalculo(Product produto, String imposto) {
		if (imposto.equals("ISS")){
			//regra de negocio centralizada
			return produto.getValue() * 0.05;
		}else if (imposto.equals("ICMS")) {
			return produto.getValue() * 0.18;
		}else {
			return 0;
		}	
	}
}
