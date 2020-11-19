package Classes;

public class ContaEspecial extends ContaCorrente
{
	private double limite;
	
	public ContaEspecial(int numero, String cpf_cnpj, double limite) {
		super(numero, cpf_cnpj);
		this.limite = limite;
	}

	public double getLimite() 
	{
		return limite;
	}

	public void setLimite(double limite) 
	{
		this.limite = limite;
	}
	
	public void usarLimite (double valor)
	{
		if (super.getSaldo() <= 0 && this.limite >= valor)
		{
			super.creditar (valor);
			this.limite -=valor;
		}
		else 
		{
			System.out.print("\n\nSALDO INSUFICIENTE\n");
			System.out.print("\nREPITA A TRANSAÇÃO\n\n");
		}
	}
	public void reporLimite (double valor)
	{
		this.limite += valor;
		
		if (this.limite > 500)
		{
			this.limite = 500;
		}
	}
	
}
