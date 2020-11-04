programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro linha = 4, coluna = 6
		inteiro n1[linha][coluna], n2[linha][coluna], m1[linha][coluna] ,m2[linha][coluna]
		inteiro x = 0, y = 0, soma = 0, sub = 0

		para (x = 0; x<linha; x++)// linha
		{
			para (y = 0; y<coluna; y++)// coluna
			{
				n1[x][y] = Util.sorteia(1, 20)
			}
		}	
		para (x = 0; x<linha; x++)// linha
		{
			para (y = 0; y<coluna; y++)// coluna
			{
				n2[x][y] = Util.sorteia(1, 20)
				m1[x][y] = n1[x][y] + n2[x][y]
				m2[x][y] = n1[x][y] - n2[x][y]								
				
										
			}
			
		}
		para (x = 0; x<linha; x++){
			
			para (y = 0; y<coluna; y++)
			{
				
			escreva (m1[x][y])
				escreva (" ")
			}
			
			escreva ("\n\n")
		}
		para (x = 0; x<linha; x++){
			
			para (y = 0; y<coluna; y++)
			{
				
			escreva (m2[x][y])
				escreva (" ")
			}
			
			escreva ("\n\n")
		}
		
			

				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 871; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */