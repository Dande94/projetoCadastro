import javax.swing.JOptionPane;

public class EntradaSaida {
	
	
	public static void exibirPessoa(Pessoa pessoa) {
		
		JOptionPane.showMessageDialog(null, "Nome "+pessoa.getNome()
		+"\nIdade "+pessoa.getIdade());
		
	}

}
