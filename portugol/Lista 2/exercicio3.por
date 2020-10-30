programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro a, b, c, d , a1, b1, c1, d1
		
		escreva ("Digite o numero 1: ")
		leia (a)
		escreva ("Digite o numero 2: ")
		leia (b)
		escreva ("Digite o numero 3: ")
		leia (c)
		escreva ("Digite o numero 4: ")
		leia (d)
		
		a1 = (mat.potencia(a,2))
		b1 = (mat.potencia(b,2))
		c1 = (mat.potencia(c,2))
 		d1 = (mat.potencia(d,2))
 		limpa ()

 		se (c1 >= 1000){
 			escreva (" O resultado do número 3 ao quadrado é: " + c1)		
		}

		senao {
			escreva ("\nValor 1: " + a + " Valor ao quadrado: " + a1)
			escreva ("\nValor 2: " + b + " Valor ao quadrado: " + b1)
			escreva ("\nValor 3: " + c + " Valor ao quadrado: " + c1)
			escreva ("\nValor 4: " + d + " Valor ao quadrado: " + d1)
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 80; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */