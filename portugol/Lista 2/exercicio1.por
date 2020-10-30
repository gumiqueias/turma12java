programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real p, ex, m

		escreva ("Por favor, insira o peso cotemplando o exemplo de 00.00: ")
		leia (p)
		limpa ()
				
		se (p >50.00)
		{
			ex = p * 4.00			 	
			m = mat.arredondar((ex - 200.0),2)
			escreva ("Devido ao excesso de peso a multa a ser paga tem o valor de: " + m)
		}
		senao
		{
			p = 0
			ex = 0
			m = 0

			escreva ("P: "+p+", E: "+ex+", M: "+m)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 259; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */