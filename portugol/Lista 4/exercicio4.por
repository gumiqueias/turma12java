programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		
		const inteiro linha = 3, coluna = 3
		inteiro matriz[linha][coluna]
		inteiro x = 0, y = 0, soma = 0
		
		para (x = 0; x<linha; x++)// linha
		{
			para (y = 0; y<coluna; y++)// coluna
			{
				matriz[x][y] = Util.sorteia(1, 20)

				se (x==y){
					soma = soma + matriz[x][y]
				}
			}
			
		}

		para (x = 0; x<linha; x++)// linha
		{
			para (y = 0; y<coluna; y++)// coluna
			{
				escreva (matriz[x][y])
				escreva (" ")
			}
			
			escreva ("\n")
		}

		escreva ("\nTotal de valores da diagonal: "+soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 289; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */