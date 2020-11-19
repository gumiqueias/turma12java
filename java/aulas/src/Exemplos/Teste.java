package Exemplos;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int vetor [] = new int [4];
		String nome;
		int qtde;
		
		System.out.print("Digite o nome do aluno: ");
		nome = leia.nextLine();
		
		System.out.print("\nDigite a quantidade de notas a serem cadastradas:");
		qtde = leia.nextInt();
		
		for (int x = 0; x<qtde;x++)
		{
			System.out.printf("\nInforme a %dº nota: ", (x+1));
			vetor [x] = leia.nextInt();
		}

	}

}
