package exercicio01;

import javax.swing.JOptionPane;

public class TesteCalculadoraDeImposto {

	public static void main(String[] args) {

		
		Produto produto = new Produto();

		String nome = JOptionPane.showInputDialog(null, "Insira o nome do produto");

		produto.setNome(nome);

		String aux = JOptionPane.showInputDialog(null, "Insira o valor do produto");

		produto.setValor(Double.parseDouble(aux));

		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();

		ISS iss = new ISS();
		ICMS icms = new ICMS();

		double valorISS = calculadora.executaCalculo(produto, iss);
		double valorICMS = calculadora.executaCalculo(produto, icms);

		JOptionPane.showMessageDialog(null, "Produto: " + produto.getNome() + "\r\nValor do imposto ISS: " + valorISS
				+ ".\r\nValor imposto ICMS: " + valorICMS);
		// System.out.println(valorISS);
		// System.out.println(valorICMS);

	}
}
