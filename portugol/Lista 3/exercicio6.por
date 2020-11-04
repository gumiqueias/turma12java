programa
{
	
	funcao inicio()
	{
		inteiro valorDigitado = 0, totalSoma = 0, contador = 0
		
		escreva("Digite um valor inteiro positivo: ")
		leia (valorDigitado)

		faca {

			contador ++
			totalSoma = totalSoma + contador
			
		}enquanto (contador < valorDigitado)

		escreva ("\nNumero de giros: "+contador)
		escreva ("\nSomatorio: "+ totalSoma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 75; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */