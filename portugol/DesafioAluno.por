programa
{
	
	funcao inicio()
	
	{
		const inteiro limite = 29
		cadeia codigo[limite] = {"1","2","3","4","5","6","7","8","9","10",
		"11","12","13","14","15","16","17","18","19","20","21","22","23","24",
		"25","26","27","28","29"}
		cadeia nome[limite] = {"Ana veronica Nascimento cruz", "Bruno Estivalli Vicente", "Bruno Henrique Moraes Santos","Daniel Ferreira", "Dayane de Oliveira", 
		"Denis Vinicius Bolla da Silva", "Diego  Joaquim Silva", "Erick Alan", "Everson Silva", "Gabriel Enrique Cabral Silva", "Guilherme Alex", "Guilherme Fidelis Pereira",
		"Gustavo Miquéias Lopes Santana", "Isac Cordeiro de Oliveira", "Iuri Garcia Nunes", "Jenifer Lima Placido", "Jéssica Cristiane",
		"Joao Pedro Sena", "Larissa Moraes Ribeiro", "Leonardo de Moraes Magalhães", "Lucas Santos Gonçalves", "Mariana  de Cássia Antunes Oliveira",
		"Patricia da Silva Machado", "Paula Leticia", "Raul Fernandes","RICARDO MAGALHAES FINKELSTEIN", "Thiago dos Anjos", "Vitória Gonçalves de Freitas",
		"William Xavier"}
		
		cadeia mail [limite] = { "anaveronica3001@hotmail.com", "bruno.estivalli@gmail.com", "brunohmoraes93@gmail.com", "daniel.z.ferreira@hotmail.com","dayane873@gmail.com","denisvini@gmail.com", "joaquim.diego8@gmail.com", "erickalan068@gmail.com", "eversonmessias@outlook.com", "gabrieldgrafico@outlook.com","guilhermealex01@gmail.com","gui.fdsk@hotmail.com", "gumiqueias@hotmail.com", "zaq.c@live.com", "iurinunes01@gmail.com", "jenifer.sdti@gmail.com", "jessicacristianebtr@gmail.com", "joao_usercon@hotmail.com", "larissaribeiro03@hotmail.com", "leo_o_nardo1@outlook.com",  "lucas.00.santos@outlook.com", "mari_oli25@hotmail.com", "pathsilva09@gmail.com", "paula.leticia.braz@gmail.com", 
		"raulogus2@gmail.com", "ricardomrfin@gmail.com", "thiagohdosanjos99@gmail.com", "vitoriagcf@hotmail.com", "william.xavier07@hotmail.com" }
		inteiro x
		inteiro posicao;
		inteiro nota[limite];
		caracter entrega;
		cadeia alun;	
		logico sexo[limite] = {verdadeiro, falso, falso, falso, verdadeiro, falso, falso, falso, falso, falso, falso, falso, falso, falso, falso, verdadeiro, 
		verdadeiro,falso, verdadeiro, falso, falso, verdadeiro, verdadeiro, verdadeiro, falso, falso,falso, verdadeiro, falso}
		cadeia parar
		
				para( x = 0; x<limite; x++)
				{
					
					escreva("Ensira o código do aluno(A) correspondente: ")
					leia(posicao);
					se (sexo[posicao] == verdadeiro)
					{
						alun = "Aluna"
					}
					senao{
						alun = "Aluno"
					}
					escreva(alun," ",nome[posicao] ,"\n")
					escreva("O ",alun," entregou (S/N) ? ")
					leia(entrega)
					se(entrega == 'S' ou entrega == 's'){
							
							escreva("Insira a nota do ",alun, " : ")
							leia(nota[x]);

							nota[x] = nota[x] + 1;
					}senao {
							nota[x] = 0;
					}

					escreva("\n","Deseja cadastrar outra nota ? (S/N) ")
					leia(parar) 
					se(parar == "S" ou parar == "s"){
						
					} senao 
					{
						escreva("CODIGO","\t","NOME","\t\t\t","EMAIL","\t\t\t","ENTREGA","\t","NOTA","\n")
						
							para(x = 0; x < limite; x++)
							{
							escreva("G5 - ",codigo[x],"\t",nome[x],"\t\t",mail[x],"\t\t\t",entrega,"\t",nota[x],"\n")
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
 * @POSICAO-CURSOR = 3148; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */