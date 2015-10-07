package exercicio01a;

public class TesteCalculadoraDeImposto {

public static void main(String[] args) {
		
		Product produto = new Product();
		produto.setName("TV Samsung");
		produto.setValue(1500);
		
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		
		double iss = calculadora.executaCalculo(produto, "ISS");
		double icms = calculadora.executaCalculo(produto, "ICMS");
		
		System.out.println(iss);
		System.out.println(icms);
		
	}
}
