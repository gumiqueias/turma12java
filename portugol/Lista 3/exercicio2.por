programa
{
	
	funcao inicio()
	{
		inteiro contador, soma = 0

		para (contador = 1; contador <=500; contador ++){

			se ((contador % 2)!=0 e (contador % 3) ==0){
				
				soma = contador + soma

				escreva ("\nA soma de todos números ímpares múltiplo de 3 é de: "+soma)
				}
			}
			
		}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */