programa
{
	
	funcao inicio()
	{
		real valor = 600.00
		inteiro p = 0
		cadeia nome
		caracter sexo, stop
		logico cf = verdadeiro

		escreva ("Insira seu nome: ")
		leia (nome)
		escreva ("\nInsira seu sexo (M OU F): ")
		leia (sexo)
		escreva ("\nÉ chefe de família (responda com 'verdadeiro' PARA SIM e 'falso' PARA NÃO)? ")
		leia (cf)
		limpa ()
	

		faca
		{

		se ((sexo == 'f' ou sexo == 'F') e (cf == verdadeiro))
		
		{ 
		
			valor = valor + 600.00

			escreva ("O valor do seu auxílio é de R$"+valor)	
		}
		senao
		{

			escreva ("O valor do seu auxílio é de R$"+valor)
			
		}
		
			escreva ("\nDeseja para o programa S / N ?")
			leia (stop)
		}
			
		enquanto (stop == 'N' ou stop == 'n')
		limpa()
		
		escreva ("\nprograma finalizado")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 715; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */