programa
{
	
	funcao inicio()
	{
		real area, base, altura

		escreva ("Insira a base: ")
		leia (base)
		escreva ("\n Insira a altura: ")
		leia (altura)
		limpa ()

		se (base >= 0 e altura >=0){

			area = (base*altura)/2

			escreva ("A área do triângulo é de: " + area)
		}
		senao {
			escreva ("Dados inválidos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 302; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */