programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x = 1, y
		real soma = 0.0, div = 0.0
		
		para (y=1; y<=50; y++){

			div = mat.arredondar((x/y), 2)		
			soma = mat.arredondar((soma + div),2)		
			
			x = 	x + 2
			escreva ("A soma total é: " + soma + "\n")	 		
	
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 224; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */