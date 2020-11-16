package exercicio1;

import java.util.Scanner;

public class cliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		dadosCliente cliente1 = new dadosCliente ();
		
		System.out.println("Insira seu nome: ");
		cliente1.nome = leia.nextLine();
		System.out.println("\nInsira seu CPF: ");
		cliente1.cpf = leia.next();
		System.out.println("\nInsira seu telefone: ");
		cliente1.telefone = leia.next();
		System.out.println("\nInsira sua idade: ");
		cliente1.idade = leia.nextInt();
		
		cliente1.getCliente();
	}

}
