
public class Principal {

	public static void main(String[] args) {
	
		Pessoa pessoa = new Pessoa("Indianara", 31);
		
		
		EntradaSaida.exibirPessoa(pessoa);
		
		Pessoa p = new Pessoa();
		
		p.setNome("Amâncio");
		p.setIdade(33);

		EntradaSaida.exibirPessoa(p);

	}

}
