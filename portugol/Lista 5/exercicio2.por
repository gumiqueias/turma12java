programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{

		real peso, altura, imc

		escreva ("Insira seu peso: ")
		leia (peso)
		escreva ("Insira sua altura: ")
		leia (altura)

		imc = mat.arredondar(peso/(altura*altura), 2)

		se (imc <= 18.5)
		{
			escreva ("\nVocê está abaixo do peso :(")
		}
		se (imc >= 18.6 e imc < 25)
		{
			escreva ("\nPeso normal :)")
		}
		se (imc >= 25 e imc <= 30)
		{
			escreva ("\nAcima do peso :/")
		}
		se (imc >30)
		{
			escreva ("\nObeso :'(")	
		}	
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 64; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */