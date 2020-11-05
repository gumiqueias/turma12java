programa
{
	
	funcao inicio()
	
	{
		const inteiro limite = 29
		cadeia nome[limite] = {"Ana veronica Nascimento cruz", "Bruno Estivalli Vicente", "Bruno Henrique Moraes Santos","Daniel Ferreira", "Dayane de Oliveira", 
		"Denis Vinicius Bolla da Silva", "Diego  Joaquim Silva", "Erick Alan", "Everson Silva", "Gabriel Enrique Cabral Silva", "Guilherme Alex", "Guilherme Fidelis Pereira",
		"Gustavo Miquéias Lopes Santana", "Isac Cordeiro de Oliveira", "Iuri Garcia Nunes", "Jenifer Lima Placido", "Jéssica Cristiane",
		"Joao Pedro Sena", "Larissa Moraes Ribeiro", "Leonardo de Moraes Magalhães", "Lucas Santos Gonçalves", "Mariana  de Cássia Antunes Oliveira",
		"Patricia da Silva Machado", "Paula Leticia", "Raul Fernandes","RICARDO MAGALHAES FINKELSTEIN", "Thiago dos Anjos", "Vitória Gonçalves de Freitas",
		"William Xavier"}
		cadeia mail [limite] = { "anaveronica3001@hotmail.com", "bruno.estivalli@gmail.com", "brunohmoraes93@gmail.com", "daniel.z.ferreira@hotmail.com","dayane873@gmail.com","denisvini@gmail.com", "joaquim.diego8@gmail.com", "erickalan068@gmail.com", "eversonmessias@outlook.com", "gabrieldgrafico@outlook.com","guilhermealex01@gmail.com","gui.fdsk@hotmail.com", "gumiqueias@hotmail.com", "zaq.c@live.com", "iurinunes01@gmail.com", "jenifer.sdti@gmail.com", "jessicacristianebtr@gmail.com", "joao_usercon@hotmail.com", "larissaribeiro03@hotmail.com", "leo_o_nardo1@outlook.com",  "lucas.00.santos@outlook.com", "mari_oli25@hotmail.com", "pathsilva09@gmail.com", "paula.leticia.braz@gmail.com", 
		"raulogus2@gmail.com", "ricardomrfin@gmail.com", "thiagohdosanjos99@gmail.com", "vitoriagcf@hotmail.com", "william.xavier07@hotmail.com"}
		inteiro x;
		inteiro nota[limite]
		cadeia entrega[limite]
		cadeia alun;	
		logico sexo[limite] = {verdadeiro, falso, falso, falso, verdadeiro, falso, falso, falso, falso, falso, falso, falso, falso, falso, falso, verdadeiro, 
		verdadeiro,falso, verdadeiro, falso, falso, verdadeiro, verdadeiro, verdadeiro, falso, falso,falso, verdadeiro, falso}
		cadeia parar
		
				para( x = 0; x < limite; x++){

					
					
					escreva("Ensira o código do aluno correspondente: ")
					leia(x);
					se (sexo[x] == verdadeiro)
					{
						alun = "Aluna"
						
					}
					senao{
						alun = "Aluno"
					}
					escreva(alun," ",nome[x] ," ","\n")
					escreva("O aluno entregou (S/N) ? ")
					
					leia(entrega[x])
					se(entrega[x] == "S" ou entrega[x] == "s"){
							
							escreva("Insira a nota do aluno "," : ")
							
							leia(nota[x]);

							nota[x] = nota[x] + 1;
					}senao {
							
							nota[x] = 0;
					}

					escreva("\n","Deseja cadastrar outra nota de aluno ? (S/N) ")
					leia(parar) 
					se(parar == "S" ou parar == "s"){
						
					} senao {
						escreva("CODIGO","\t","NOME","\t\t\t\t","EMAIL","\t\t\t","ENTREGA","\t\t\t\t","NOTA","\n")
						para(x = 0; x < limite; x++){
						escreva("G5 - ",x,"\t",nome[x],"\t",mail[x],"\t\t\t",entrega[x],"\t",nota[x],"\n")
						}
						
					}
				
				}
	}
}



		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2345; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */