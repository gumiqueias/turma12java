programa
{
	
	funcao inicio()
	{
		real idade

		escreva ("Insira a idade do nadador(a): ")
		leia (idade)

			se (idade>=5 e idade<=7){
				escreva ("\nCom sua idade, você pertence ao grupo infantil A de 5 a 7 anos")
			}
								
			senao se (idade>=8 e idade<= 11){
				escreva ("\nCom sua idade, você pertence ao grupo infantil B de 8 a 11 anos")
			}
	
			senao se (idade>= 12 e idade<= 13) {
				escreva ("\nCom sua idade, você pertence ao grupo juvenil A de 12 a 13 anos")
			}			
			
			senao se (idade>= 14 e idade <= 17){
				escreva ("\nCom sua idade, você pertence ao grupo juvenil B de 14 a 17 anos")
			}
				
			senao se (idade>= 18:){
				escreva("\nCom sua idade, você pertence ao grupo adulto acima de 18 anos")
			}
				
			senao{
				escreva("\nVocê não se aplica em nenhum grupo")
			}
			escreva("-------------------------------------------------")
		}
	}
	
		

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 45; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */