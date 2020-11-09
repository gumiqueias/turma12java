programa
{
	
	funcao inicio()
	{
		real a, b, c
        escreva ("Insira o índice do grupo 1: ")
        leia (a)
        escreva ("Insira o índice do grupo 2: ")
        leia (b)
        escreva ("Insira o índice do grupo 3: ")
        leia (c)
        limpa ()


        se ((a >= 0.05 e a <= 0.25)  e (b >= 0.05 e b <= 0.25) e (c >= 0.05 e c <= 0.25)){

            escreva ("Índice do grupo OK!")
        }

        se (a >= 0.3){
         			senao se (a >= 0.5 e b >= 0.5 e c >= 0.5){
         				
         				escreva ("TODOS GRUPOS DEVERÃO SUSPENDER SUAS ATIVIDADES!")
         			}
         			senao se (a >= 0.4 e b >= 0.4){
         				escreva ("ATENÇÃO!! GRUPO A E B DEVERÃO SUSPENDER AS ATIVIDADES!")
         			}

         			senao se (a < 0.05 e b < 0.05 e c < 0.05){
         				escreva ("índice abaixo do padrão")
         			}
                	senao { 
                		escreva ("ATENÇÃO!! GRUPO A DEVERÁ SUSPENDER AS ATIVIDADES!")
                }               	 		
      
         }
         
	}
}


		

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 728; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */