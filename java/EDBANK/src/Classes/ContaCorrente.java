package Classes;

public class ContaCorrente extends Conta {
	
	private int numeroTalao=1;
	
	
	public ContaCorrente(int numero, String cpf_cnpj)
	{
		super(numero, cpf_cnpj);
	
	}

	
	public int getNumeroTalao() {
		return numeroTalao;
	}
	
	public void setNumeroTalao(int numeroTalao) {
		this.numeroTalao = numeroTalao;
	}
	
	
	public void emitirTalao() 
	{
		
		this.numeroTalao = this.numeroTalao+1;
	}	
	
	public void emitirTalao( int numeroDeTaloes) 
	{
		
		this.numeroTalao = this.numeroTalao + numeroDeTaloes;
		System.out.println(numeroDeTaloes + " TALOES EMITIDOS");
	
	}	
	
}