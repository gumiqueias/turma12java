package exercicio2;

import java.util.Scanner;

public class aviao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		dadosAviao aviao1 = new dadosAviao (1234, "GRANDE", 125);
		
		char permissao;
		
		System.out.printf("Avião número: %d deseja permissão para decolar S/N ?", aviao1.numeracao);
		permissao = leia.next().toUpperCase().charAt(0);
		
		if (permissao == 'S')
		{
			aviao1.getDecolando();
			
			System.out.printf("\nAvião número: %d deseja permissão para pousar S/N ?", aviao1.numeracao);
			permissao = leia.next().toUpperCase().charAt(0);
			
			if (permissao == 'S')
			{
				aviao1.getPousando();
			}
		}

	}

}
