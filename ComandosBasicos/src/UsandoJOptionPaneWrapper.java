import javax.swing.JOptionPane;

public class UsandoJOptionPaneWrapper {

	public static void main(String[] args) {
		// Scanner entrada = new Scanner(System.in);

		// double salario = entrada.nextDouble();
		// int idade = entrada.nextInt();
		
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
		String sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobrenome");

		String aux = JOptionPane.showInputDialog(null, "Insira seu salário");
		
		double salario = Double.parseDouble(aux);
		
		String nomeCompleto = nome + " " + sobrenome;

		JOptionPane.showMessageDialog(null, nomeCompleto);
		JOptionPane.showMessageDialog(null, "R$ " + salario);

	}

}
