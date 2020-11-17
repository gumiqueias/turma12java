package exercicio6;

import exercicio1.classePessoa;

public class classeVendedor extends classePessoa
{
	private double valorVendas;
	private double comissao;
	
	public classeVendedor()
	{
		
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
}
