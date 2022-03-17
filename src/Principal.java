
public class Principal {

	public static void main(String[] args) {
	
		Pessoa pessoa = new Pessoa("Anderson", 28);
		
		
		EntradaSaida.exibirPessoa(pessoa);
		
		Pessoa p = new Pessoa();
		
		p.setNome("Anderson");
		p.setIdade(28);

		EntradaSaida.exibirPessoa(p);

	}

}
