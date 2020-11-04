programa
{
	
	funcao inicio()
	{

		cadeia  c, p, spfc , san, tF, stop
		inteiro pontosc = 0, pontosP = 0, pontosSan = 0, contador = 1, pontosSpfc = 0

		faca{

			escreva ("Rodada " + contador)
			
			escreva ("\nInforme o resultado do Corinthians - (V - vitória) - (E - empate) - (D - derrota): ")
			leia (c)
			escreva ("\nInforme o resultado do Palmeiras - (V - vitória) - (E - empate) - (D - derrota): ")
			leia (p)
			escreva ("\nInforme o resultado do São Paulo - (V - vitória) - (E - empate) - (D - derrota): ")
			leia (spfc)
			escreva ("\nInforme o resultado do Santos - (V - vitória) - (E - empate) - (D - derrota): ")
			leia (san)

			// corinthians
			se (c == "V" ou c == "v")
			{
				pontosc = pontosc + 3 
			}
			senao se (c == "E" ou c == "e")
			{
				pontosc = pontosc + 1	
			}
			senao 
			{
				pontosc = pontosc + 0
			}
			
			// palmeiras
			se  (p == "V" ou p == "v")
			{
				pontosP = pontosP+ 3
			}
			senao se (p == "E" ou p == "e")
			{
				pontosP = pontosP + 1
			}
			senao 
			{
				pontosP = pontosP + 0
			}
			
			// santos
			se (san == "V" ou san == "v")
			{ 	
				pontosSan = pontosSan+ 3 
			}
			senao se (san == "E" ou san =="e")
			{ 	
				pontosSan= pontosSan + 1 
				
			}
			senao{
				pontosSan= pontosSan + 0
			}
			
			// spcf
			se (spfc == "V" ou spfc == "v")
			{
				pontosSpfc = pontosSpfc + 3 
			}
			senao se (spfc == "E" ou spfc == "e")
			{
				pontosSpfc = pontosSpfc + 1
			}
			senao 
			{
				pontosSpfc = pontosSpfc + 0
			}
						
		contador ++

		escreva ("\nDeseja continuar - S / N ?")
		leia (stop) 
			
		}enquanto (stop == "S" ou stop == "s")

		limpa ()
		escreva ("Insira seu time favorito: (C - Corinthians) (S - Santos ) (P - Palmeiras) (SPFC - São Paulo) ")
		leia (tF)

		escreva ("\nQuantidade de rodadas "+contador)
		
		se (tF == "C" ou tF == "c"){
			escreva ("\nSeu time favorito é o Corinthians e sua pontuação é: " + pontosc)
		}
		se (tF == "S" ou tF == "s"){
			escreva ("\nSeu time favorito é o Santos e sua pontuação é: " + pontosSan)
		}
		se (tF == "P" ou tF == "p"){
			escreva ("\nSeu time favorito é o Palmeiras e sua pontuação é: " + pontosP)
		}
		se (tF == "spfc" ou tF == "SPFC"){
			escreva ("\nSeu time favorito é o São Paulo e sua pontuação é: " + pontosSpfc)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 581; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */