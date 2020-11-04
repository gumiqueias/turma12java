programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real sal = 0, filhos = 0, tfilhos = 0, tsal = 0, maiorsal = 0, menorcem = 0, funci = 0, contador = 0, entrevistados = 0

		escreva ("Digite a quantidade de entrevistados:")
		leia (entrevistados)
		
		para (funci=0; funci < entrevistados; funci++)
		{
			escreva ("\nInforme o salário: ")
			leia (sal)
			escreva ("\nInforme o número de filhos: ")
			leia (filhos)	

			se (sal > maiorsal)
			{
				maiorsal = sal	
				
			}
						
			se (sal < 100)
			{				
                	contador = mat.arredondar((contador + 1.0),0)
			}	
			
		}
			tsal = (tsal + sal)/entrevistados
			tfilhos = (tfilhos + filhos)/entrevistados
			menorcem = mat.arredondar(((contador/entrevistados)*100.00),2)

			escreva ("\nA média do salário da população é de: "+tsal)
			escreva ("\nA média de filhos da população é de: "+tfilhos)
			escreva ("\nO maior salário dentro os inseridos é de: "+maiorsal)
			escreva ("\nO percentual de pessoal com salário abaixo de 100 é de: "+menorcem+" %")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 746; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {sal, 7, 7, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */