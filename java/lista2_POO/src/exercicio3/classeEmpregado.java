package exercicio3;

import exercicio1.classePessoa;

public class classeEmpregado extends classePessoa 
{
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public classeEmpregado() {
		super();
	}
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public void imprime () 
	{
		System.out.println("Ol�, "+this.getNome());
		System.out.println("Seu endere�o � na "+this.getEnd());
		System.out.println("Seu c�digo � "+this.getCodigoSetor());
		System.out.println("Seu sal�rio base � R$  "+this.getSalarioBase());
		System.out.println("Com o desconto de impostos de "+this.getImposto()+" %");
				
	}
	
	public void calcularSalario ()
	{
		this.imposto = this.imposto/100; 
		double valorSalario = this.salarioBase - (this.salarioBase*this.imposto);
		System.out.println("Total sal�rio R$ "+valorSalario);
	}
	
}
