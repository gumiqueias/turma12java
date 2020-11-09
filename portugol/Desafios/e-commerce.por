programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//variaveis
		// Estoque minimo de saída
		// minimo para poder comprar
		const inteiro minimo = 10;
		inteiro x = 0, y = 0;
		inteiro estoque[minimo] = {10,10,10,10,10,10,10,10,10,10}
		//CODIGOS E VALOR DOS PRODUTOS
		real valor[minimo] = {40.00, 30.00, 20.00, 30.00, 30.00, 25.00, 20.00, 20.00, 10.00, 10.00};
		inteiro codigo[minimo] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		real valorCompras[minimo];
		real valorTotal = 0.0, imp = 0.0, valorAtualizado = 0.0
		//PRODUTOS DA NOSSA LOJA
		cadeia produtos[minimo] = {"Calça","Short","Camisa","Vestido","Camiseta","Babylook","Saia","Bermuda","Touca","Cinto"};
		//caracteres de intração com o usuario
		cadeia compras[minimo];
		caracter dinheiro, cheque, credito, parcelas, juros, notaFiscal, empresa, imposto, totalPagar, confirmacao, novoUser;
		cadeia pag, parc
		logico user = verdadeiro;

		enquanto(user == verdadeiro) {
		escreva ("---------LOJAS LUIS VINTÃO-----------\n")
		escreva("\nPRODUTOS:\t","VALOR:\t\t", "ESTOQUE:\n")
		para(x = 0; x<10; x++){
			escreva("------------------------------------------------\n")
			escreva(codigo[x]," - ",produtos[x],"\tR$",valor[x],"\t\t",estoque[x]," und.\t|","\n")
				
		}
		escreva("\nPor favor, digite o código do produto que deseja: ");
		para(x = 0; x<10; x++) {
			leia(codigo[x]);
		
				se(codigo[x] == 1){
					estoque[x] = estoque[x] -1
					compras[x] = produtos[0]
					valorCompras[x] = valor[0]
					escreva("O produto ","'",produtos[0],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					} senao {
						pare
					}
				}
				se(codigo[x] == 2){
					estoque[x] = estoque[x] -1
					compras[x] = produtos[1]
					valorCompras[x] = valor[1]
					escreva("O produto ","'",produtos[1],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
				}
				se(codigo[x] == 3){
					estoque[x]= estoque[x] -1
					compras[x] = produtos[2]
					valorCompras[x] = valor[2]
					escreva("O produto ","'",produtos[2],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
				}
				se(codigo[x] == 4){
					estoque[x] = estoque[x] -1
					compras[x] = produtos[3]
					valorCompras[x] = valor[3]
					escreva("O produto ","'",produtos[3],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
				}
				se(codigo[x] == 5){
					estoque[x] = estoque[x] -1
					compras[x]= produtos[4]
					valorCompras[x] = valor[4]
					escreva("O produto ","'",produtos[4],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
				}
				se(codigo[x] == 6){
					estoque[x] = estoque[x] -1
					compras[x] = produtos[5]
					valorCompras[x] = valor[5]
					escreva("O produto ","'",produtos[5],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
				}
				se(codigo[x] == 7){
					estoque[x] = estoque[x] -1
					compras[x] = produtos[6]
					valorCompras[x] = valor[6]
					escreva("O produto ","'",produtos[6],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
				}
				se(codigo[x] == 8){
					estoque[x] = estoque[x] -1
					compras[x] = produtos[7]
					valorCompras[x] = valor[7]
					escreva("O produto ","'",produtos[7],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
				}
				se(codigo[x] == 9){
					estoque[x] = estoque[x] -1
					compras[x] = produtos[8]
					valorCompras[x] = valor[8]
					escreva("O produto ","'",produtos[8],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
					
				}
				se(codigo[x] == 10){
					estoque[x] = estoque[x] -1
					compras[x] = produtos[9]
					valorCompras[x] = valor[9]
					escreva("O produto ","'",produtos[9],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
				}
			}
			limpa();
			escreva("Carrinho de compras:\n")
			escreva("PRODUTOS:\t","VALOR:\n")
			para(x = 0; x < minimo; x++ ){
				valorTotal = valorTotal + valorCompras[x]
				escreva("------------------------------------------------\n")
				escreva(x + 1," - ",compras[x],"\t","R$ ", valorCompras[x],"\n")
			
			}
			imp = mat.arredondar((valorTotal*0.09), 2)
			escreva("\nValor total do carrinho: R$",valorTotal)
			escreva("\nValor total dos impostos a serem pagos: R$",imp,"\n")
			escreva("\n--------------FORMA DE PAGAMENNTO---------------\n")
			escreva ("\n\nInsira 'A' para á vista em dinheiro ou cheque, 'AC' para á vista no cartão de crédito ou 'CC' para cartão de crédito: ")
			leia (pag)

			se (pag == "A" ou pag == "a")
			{
				valorAtualizado = valorTotal * 0.20
				valorTotal = valorTotal - valorAtualizado
				escreva ("\nO valor a ser pago é de: R$ " , valorTotal, " com desconto de 20%\n.")
			}

			se (pag == "AC" ou pag == "ac")
			{
				valorAtualizado = valorTotal * 0.15
				valorTotal = valorTotal - valorAtualizado
				escreva ("\nO valor a ser pago é de: R$ " , valorTotal, " com desconto de 15%\n.")
			}

			se (pag == "CC" ou  pag == "cc")
			{
				escreva ("\nEm 2x ou 3x: ")
				leia (parc)

				se (parc == "2x" ou parc == "2")
				{
					escreva ("\nO valor a ser pago é de: R$ " , valorTotal, " parcelado em 2x.\n")
				}

				senao se (parc == "3x" ou parc == "3")
				{
					valorAtualizado = valorTotal*0.10
					valorTotal = valorTotal + valorAtualizado
					escreva ("\nO valor a ser pago é de: R$ " , valorTotal, " parcelado em 3x com juros de 10%.\n")
				}
		
			}

			escreva ("\nDeseja a impressão da nota fiscal - S/N ?")
			leia (notaFiscal)

			se (notaFiscal == 'S' ou notaFiscal == 's')
			{
				limpa ()
				escreva ("---------NOTA FISCAL-----------\n")
				escreva ("---------LOJAS LUIS VINTÃO-----------\n")
				para(x = 0; x < minimo; x++ ){
				escreva("------------------------------------------------\n")
				escreva(x + 1," - ",compras[x],"\t","R$ ", valorCompras[x],"\n")				
				}
				escreva ("\n---------IMPOSTOS PAGOS = " + imp + " -----------\n")	
				escreva ("\n\n---------TOTAL A SER PAGO = " + valorTotal + " -----------\n")
				escreva ("\n\n---------OBRIGADO E VOLTE SEMPRE -----------\n")
				
			}
			senao{
				
				escreva ("\n\n---------OBRIGADO E VOLTE SEMPRE -----------\n\n")
			}
			escreva("Deseja continuar com novas compras ? (S/N)" );
			leia(novoUser)
			se (novoUser == 'S' ou novoUser == 's') {
				limpa();
				user = verdadeiro;
			} senao {
				user = falso;	
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5539; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */