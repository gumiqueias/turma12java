programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro vetor[10], soma = 0, c,  maior = 0, x = 0, cmaior = 0, media = 0
		

		para (c = 0; c < 10; c++)
		{
			escreva ("\n\nInsira o valor correspondente a jogada de 1 a 6: ")
			leia (vetor[c])
			escreva ("\nValor posição ", c+1 , " : ", vetor[c])
			soma = soma + vetor[c]	
			media = soma / 10

			se (vetor[c] >= maior)
			{
				se (vetor[c] != maior)
				{
					cmaior = 0
				}
				
			maior = vetor[x]
			cmaior ++
			}
		}
		
		escreva ("\n\nTotal de valores somados: ", soma)
		escreva ("\n\nMaior valor: ", maior)
		escreva ("\n\nMédia aritimética dos valores lançados: " + media)
		escreva ("\n\nQuantidade de vezes do maior valor: " + cmaior)				
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 598; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 7, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */