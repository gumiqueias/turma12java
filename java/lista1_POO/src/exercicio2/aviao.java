package exercicio2;

import java.util.Scanner;

public class aviao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		dadosAviao aviao1 = new dadosAviao (1234, "GRANDE", 125);
		
		char permissao;
		
		System.out.printf("Avi�o n�mero: %d deseja permiss�o para decolar S/N ?", aviao1.numeracao);
		permissao = leia.next().toUpperCase().charAt(0);
		
		if (permissao == 'S')
		{
			aviao1.getDecolando();
			
			System.out.printf("\nAvi�o n�mero: %d deseja permiss�o para pousar S/N ?", aviao1.numeracao);
			permissao = leia.next().toUpperCase().charAt(0);
			
			if (permissao == 'S')
			{
				aviao1.getPousando();
			}
		}

	}

}
