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
		System.out.println("\nAVI�O INICIANDO VOO");
		System.out.println("\nNUMERA��O: "+numeracao);
		System.out.println("\nCAPACIDADE: "+capacidade +" PESSOAS");
	}
	public void getPousando()
	{
		System.out.println("\nAVI�O POUSANDO");
		System.out.println("\nNUMERA��O: "+numeracao);
		System.out.println("\nCAPACIDADE: "+capacidade +" PESSOAS");
	}
	
}
