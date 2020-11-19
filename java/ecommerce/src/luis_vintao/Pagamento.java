package luis_vintao;

public class Pagamento 
{	
	private double valor;
	private double parcelas;
	private double valorFinal;
	private int parc = 0;
	
	public Pagamento() {
		
	}
	public Pagamento(double valor) 
	{
		this.valor = valor;
	}

	public double getParcelas() {
		return parcelas;
	}

	public void setParcelas(double parcelas) {
		this.parcelas = parcelas;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
	
	public void  pagamentoAvistaDinheiro ()
	{
		
		this.valorFinal = this.valorFinal - (this.valorFinal*0.20);

	}
	
	public void pagamentoAvistaCartao()
	{
		this.valorFinal = this.valorFinal - (this.valorFinal*0.15);
		
		
	}
	
	public void pagamentoCartao2x ()
	{		
		this.parcelas = this.valorFinal / 2;
		
		this.parc ++;
		
	}
	
	public void pagamentoCartao3x ()
	{
		this.valorFinal = this.valorFinal + (this.valorFinal*0.10);
		this.parcelas = this.valorFinal / 3;
		this.parc += 2;
	}
	
	public void notaFiscal1 () 
	{
		System.out.println("\n\n\n\n\n------------------------------NOTA FISCAL----------------------------\n");
		System.out.println("\n--------------------------LOJAS LUIS VINTÃO--------------------------\n");
		System.out.println("PRODUTOS:\t"+"VALOR:\t\tQUANTIDADE:\n");
		// carrinho		
	}
	public void notaFiscal2 ()
	{
		double impostos;
		impostos = this.valorFinal*0.09;
		
		System.out.printf("\n---------------------IMPOSTOS A SEREM PAGOS R$ %.2f------------------",impostos,"\n\n");
		
		if (this.parc == 1)
		{ 
			System.out.printf("\n\n----------------------TOTAL A SER PAGO = R$ %.2f -------------------\n",this.valorFinal);

			System.out.printf("\n----------------------PARCELADO EM 2X DE R$ %.2f -------------------" ,this.parcelas,"\n\n");
		}
		else if (parc == 2)
		{ 
			System.out.printf("\n\n----------------------TOTAL A SER PAGO = R$ %.2f -------------------\n",this.valorFinal);
			
			System.out.printf("\n----------------------PARCELADO EM 3X DE R$ %.2f -------------------" ,this.parcelas,"\n\n");
		}
		else
		{
			System.out.printf("\n\n----------------------TOTAL A SER PAGO = R$ %.2f -------------------\n",this.valorFinal);
		}
		
		System.out.print("\n\n------------------------OBRIGADO E VOLTE SEMPRE----------------------\n");
	}
	public void valorFinal(double valor) {
		this.valorFinal += valor;
	}
	
}
