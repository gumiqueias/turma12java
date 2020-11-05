programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		real vetor[5]
		inteiro x, contador

		para (contador=0; contador <5); contador++)
		{
			escreva ("Insira o número para a posição "+contador+" do vetor: ")
			leia (vetor[contador])
		}

		escreva ("\nInsira o código: ")
		leia (x)

		se (x == 0)
		{
			limpa ()
			
		}
		senao se (x==1)
		{
			para (contador=0; contador <5); contador++)
			{
				escreva ("\nPosição: " + contador + " - Valor: "+vetor[contador])

			}
		}
		senao se (x==2)
		{
			para (contador=4; contador >=0); contador--)
			{
				escreva ("\nPosição: " + contador + " - Valor: "+vetor[contador])
			
			}	
		}
		senao
		{
			limpa ()
			escreva ("Código inválido")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */