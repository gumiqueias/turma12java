package Classes;

import java.util.Scanner;

public abstract class Conta 
{
	private int numero;
	private String cpf_cnpj;
	private double saldo;
	
	Scanner leia = new Scanner (System.in);
	
	// construtor	
	public Conta(int numero) 
	{
		this.numero = numero;
	}

	public Conta(int numero, String cpf_cnpj) 
	{
		this.numero = numero;
		this.cpf_cnpj = cpf_cnpj;
	}

	//encapsulamento
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public double getSaldo() {
		return saldo;
	}

	// metodos
	public void debitar (double debito)
	{
		this.saldo = this.saldo - debito;
	}
	public void creditar (double credito)
	{
		this.saldo = this.saldo + credito;
	}
	
	public void menu ()
	{	

		System.out.println("POR FAVOR, INSIRA O CODIGO DA CONTA DESEJADA:\n1 - CONTA POUPANÇA \n2 - CONTA CORRENTE \n3 - CONTA ESPECIAL \n4 - CONTA EMPRESARIAL");
	}
	
}
