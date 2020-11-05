programa
{
	
	funcao inicio()
	{
		inteiro x, contador = 0

			
			faca
			{	
				escreva ("\nEscreva um número: ")
				leia (x)
				se (x >= 0 e x<= 25)
				{
					contador ++
				}
				se (x >= 26 e x <= 50)
				{
					contador ++	
				}
				se (x >= 51 e x <= 75)
				{
					contador ++
				}
				se (x >= 76 e x<= 100)
				{				
				contador ++
				}
				
			}enquanto (x>0)

			escreva ("\nQuantidade de números entre [0-25], [26-50], [51-75] e [76-100]: " + contador)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 461; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */