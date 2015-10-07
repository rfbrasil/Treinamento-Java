package exercicio02;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.junit.Test;

public class TesteCalculadoraDeDescontos {

	@Test
	public void testMaiorQueMil() {
		Produto tv = new Produto();

		String nome = JOptionPane.showInputDialog(null, "Insira o nome do produto");
		tv.setNome(nome);

		String aux = JOptionPane.showInputDialog(null, "Insira o valor do produto");
		tv.setValor(Double.parseDouble(aux));
		
		//Lista tipo Produto
		List<Produto> listaProdutos = new ArrayList<Produto>();
		listaProdutos.add(tv);

		Carrinho carrinho = new Carrinho(tv.getValor(), listaProdutos);

		CalculadoraDeDescontos calculadorDescontos = new CalculadoraDeDescontos();

		double desconto = calculadorDescontos.calcula(carrinho);

		JOptionPane.showMessageDialog(null,
				"Produto: " + tv.getNome() + "\r\nValor R$ " + tv.getValor() + "\r\nDesconto: " + desconto);
				// System.out.println(tv.getNome());

		// Verificação deste teste caso o valor de desconto for igual a 150.
		assertTrue(desconto == 150);
	}

	@Test
	public void testTresProdutos() {
		Produto caneta1 = new Produto();
		caneta1.setNome("Caneta Preta");
		caneta1.setValor(3);

		Produto caneta2 = new Produto();
		caneta2.setNome("Caneta Vermelha");
		caneta2.setValor(4);

		Produto caneta3 = new Produto();
		caneta3.setNome("Caneta azul");
		caneta3.setValor(3);

		List<Produto> listaProdutos = new ArrayList<Produto>();
		listaProdutos.add(caneta1);
		listaProdutos.add(caneta2);
		listaProdutos.add(caneta3);

		Carrinho carrinho = new Carrinho(10, listaProdutos);

		CalculadoraDeDescontos calculador = new CalculadoraDeDescontos();

		double desconto = calculador.calcula(carrinho);

		System.out.println(desconto);
		assertTrue(desconto == 0.50);
	}

	@Test
	public void testZero() {
		Produto tv = new Produto();
		tv.setNome("TV Samsung");
		tv.setValor(999);

		List<Produto> listaProdutos = new ArrayList<Produto>();
		listaProdutos.add(tv);

		Carrinho carrinho = new Carrinho(999, listaProdutos);

		CalculadoraDeDescontos calculadorDescontos = new CalculadoraDeDescontos();

		double desconto = calculadorDescontos.calcula(carrinho);

		System.out.println(desconto);
		assertTrue(desconto == 0);
	}

}
