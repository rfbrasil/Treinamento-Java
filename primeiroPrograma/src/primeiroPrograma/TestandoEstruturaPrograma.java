package primeiroPrograma;

import java.util.Scanner;

/*
 * Treinamento DevMedia
 * Aula: Desenvolvendo a estrutura de uma aplicação - Curso básico de Java e Orientação a Objetos
 * http://goo.gl/UdqTsB
 */

public class TestandoEstruturaPrograma {

	public static void main(String[] args) {
		// Entrada de dados
		// Objeto entrada do tipo Scanner
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		String nome = entrada.next();
		System.out.println("Digite seu ano de nascimento:");
		int anoNascimento = entrada.nextInt();
		System.out.println("Digite seu ano atual:");
		int anoAtual = entrada.nextInt();

		// Processamento
		int idade = anoAtual - anoNascimento;

		// Saida de dados
		System.out.println("Nome: " + nome + ", Idade = " + idade);
	}

}
