package Classes;

public class ContaEmpresa extends Conta 
{
	
	private double emprestimo;
	
	 public ContaEmpresa(int numero, String cpf_cnpj, double emprestimo) 
	 {
		super(numero, cpf_cnpj);	
		this.emprestimo = emprestimo;
	}

	public double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	public void pedirEmprestimo (double valorEmprestimo)
	{
		if (valorEmprestimo <= this.emprestimo )
		{
			super.creditar (valorEmprestimo);
			this.emprestimo -=valorEmprestimo;
			System.out.println("EMPRESTIMO REALIZADO !");			
		}
		else 
		{
			System.out.println("\nVALOR NEGADO ! VALOR SUPERIOR AO LIMITE.\n");
		}
	}
	
}
