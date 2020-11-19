package desafioFuncionario;

public class classeFuncionario 
{
	private String cod;
	protected double horas;
	protected double valorHora;
	
	// construc
	public classeFuncionario(String cod, int horas, int valorHora) 
	{
		this.cod = cod;
		this.horas = horas;
		this.valorHora = valorHora;
	}
	
	public classeFuncionario ()
	{
		
	}
	
	//encap
	public String getCod() {
		return cod;
	}


	public void setCod(String cod) {
		this.cod = cod;
	}


	public double getHoras() {
		return horas;
	}


	public void setHoras(double horas) {
		this.horas = horas;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	// metodo
	public double pagamentoSalario () 
	{
		
		double total;
		
		total = this.horas * this.valorHora;
		
		return total;
	}
}
