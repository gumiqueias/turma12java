package Classes;

public class ContaEmpresa extends Conta 
{
	
	private double emprestimo;
	
	 public ContaEmpresa(int numero, String cpf_cnpj) 
	 {
		super(numero, cpf_cnpj);		
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
		}
	}
	
}
