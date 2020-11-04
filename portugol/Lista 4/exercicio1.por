programa
{
	
	funcao inicio()
	{
		inteiro vetor[5], contador = 0, maior = 0
		

		para(contador=0 ; contador<5; contador++)
		{
			escreva("Informe o valor: ")
			leia(vetor[contador])
		}

		para(contador=0 ; contador<5; contador++) 
	  	{
	  		escreva("\nValor posição ", contador+1," : ",vetor[contador])
	  		
	  		se(vetor[contador] > maior)
	  		{
	  			maior =vetor[contador]
	  		}
	  		
			
	  	}
	  	escreva ("\n\nMaior pontuação: ", maior)
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 425; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */