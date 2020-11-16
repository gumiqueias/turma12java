package exercicio2;

public class dadosAviao 
{
	public int numeracao;
	public String porte;
	public int capacidade;
	
	public dadosAviao(int numeracao, String porte, int capacidade) {

		this.numeracao = numeracao;
		this.porte = porte;
		this.capacidade = capacidade;
	}
	
	public void getDecolando()
	{
		System.out.println("\nAVIÃO INICIANDO VOO");
		System.out.println("\nNUMERAÇÃO: "+numeracao);
		System.out.println("\nCAPACIDADE: "+capacidade +" PESSOAS");
	}
	public void getPousando()
	{
		System.out.println("\nAVIÃO POUSANDO");
		System.out.println("\nNUMERAÇÃO: "+numeracao);
		System.out.println("\nCAPACIDADE: "+capacidade +" PESSOAS");
	}
	
}
