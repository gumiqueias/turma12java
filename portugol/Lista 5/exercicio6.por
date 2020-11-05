programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro linha = 3, coluna = 3
		inteiro vetor [linha], matriz [linha][coluna]
		inteiro x = 0, y = 0

		para (x = 0; x<linha; x++)
		{
			para (y = 0; y<coluna; y++)
			{
				matriz[x][y] = Util.sorteia(1, 9)
			}
		}	
		
		para (x = 0; x<linha; x++)// linha
		{
			vetor [x] = Util.sorteia(1, 9)			
		}
				
		escreva ("MATRIZ\n")
						
		para (x = 0; x<linha; x++)
		{
			
			para (y = 0; y<coluna; y++)
			{
				
			escreva (matriz[x][y])
				escreva (" ")
			}
			
			escreva ("\n")			
		}
			
		escreva ("\n\n")
		escreva ("VETOR\n")
		
		para (x = 0; x<linha; x++)
		{
			escreva (vetor[x]+" ")			
		}
		escreva ("\n\n")
		escreva ("\nMULTIPLICAÇÃO\n")
		
		vetor[0] = vetor[0] * matriz[0][0]
		vetor[1] = vetor[1] * matriz[0][1]
		vetor[2] = vetor[2] * matriz[0][2]
		
		para (x = 0; x<linha; x++)
		{			
			escreva (vetor[x]+" ")
		}
		escreva ("\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 720; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */