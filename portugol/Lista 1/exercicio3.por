programa
{
	
	funcao inicio()
	{
		inteiro evento, horas, minutos, segundos
		escreva ("Tempo de duração em segundos do evento:")
		leia (evento)
		
		minutos = (evento % 3600)/60
		horas = evento / 3600
		segundos = ((evento % 3600)%60)

		escreva ("total em minutos: "+minutos)
		escreva ("\ntotal em horas: "+horas)
		escreva ("\ntotal em segundos: "+segundos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */