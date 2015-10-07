import javax.swing.JOptionPane;

public class UsandoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Entrada
		int idade[] = new int[2];
		
		for (int i = 0; i < idade.length; i++) {
			idade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade"));
		}
		
		// Processamento
		int somaIdade = 0;
		for (int i = 0; i < idade.length; i++) {
			somaIdade += idade[i];
		}
		
		double media = somaIdade / idade.length; 
		
		// Saida
		JOptionPane.showMessageDialog(null, "Média de idades " + media);
	}

}
