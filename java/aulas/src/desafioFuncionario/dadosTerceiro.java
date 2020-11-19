package desafioFuncionario;

public class dadosTerceiro extends classeFuncionario 
{
	private double adicional;

	public dadosTerceiro(String cod, int horas, int valorHora, double adicional) {
		super(cod, horas, valorHora);
		this.adicional = adicional;
	}

	public dadosTerceiro() {
		super ();
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	
	public double pagamentoSalario () 
	{		
		double total;
		
		total = this.horas * this.valorHora + this.adicional;
		
		return total;
	}
	
}
