programa
{
	
	funcao inicio()
	{
		real valor, desconto
		cadeia pag, cc

		escreva ("Insira o valor da etiqueta do produto: ")
		leia (valor)
		escreva ("\nFORMA DE PAGAMENTO")
		escreva ("\n\nInsira 'A' para á vista, 'AC' para á vista no cartão de crédito ou 'CC' para cartão de crédito: ")
		leia (pag)
		se (pag == "cc" ou pag == "CC")
		{
			 limpa()
			 escreva ("Em 2 ou 3 vezes: ")
			 leia (cc)
			 se (cc == "3")
			 {
			 	desconto = valor *0.10
			 	valor = valor + desconto
			 	escreva ("\nO valor a ser pago é de: R$ " + valor + " parcelado em 3x.")
			 }
			 senao{
			 	valor = valor + 0
			 	escreva ("\nO valor a ser pago é de: R$ " + valor)
			 }
		}	 
		se (pag == "a" ou pag == "A")
		{
			desconto = valor *0.20
			 valor = valor - desconto
			 
			 escreva ("\nO valor a ser pago é de: R$ " + valor)
		}
		
		se (pag == "AC" ou  pag == "ac")
		{
			desconto = valor * 0.15
			valor = valor - desconto
			escreva ("\nO valor a ser pago é de: R$ " + valor)
		}
			 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 618; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */