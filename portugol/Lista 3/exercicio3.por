programa
{
	
	funcao inicio()
	{
		real v = 0, soma = 0, n = 0, m = 0
					
		
		enquanto(v >= 0)
		{
			n = n+1
			soma = soma + v
			m = soma/n
			escreva("Informa o valor: ")
			leia(v)
		}
		escreva("\nO programa foi executado ",n," vezes, a soma total é de ",soma," e a média é de ",m)
	
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