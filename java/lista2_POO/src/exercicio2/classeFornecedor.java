package exercicio2;

import exercicio1.classePessoa;

public class classeFornecedor extends classePessoa
{
	private double valorCredito;
	private double valorDivida;
	
	
	public classeFornecedor(String nome, double valorCredito, double valorDivida) {
		super(nome);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	public classeFornecedor()
	{
		
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public void  obterSaldo()
	{
		double saldo = this.valorCredito - this.valorDivida;
		System.out.println(saldo);
	}
}
