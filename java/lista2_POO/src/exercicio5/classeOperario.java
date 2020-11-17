package exercicio5;

import exercicio1.classePessoa;

public class classeOperario extends classePessoa
{
	private double valorProducao;
	private double comissao;
	
	public classeOperario()
	{
		
	}
	
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
}
