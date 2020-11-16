package aplicacao;

import java.util.Scanner;
import entidades.aves;
import entidades.cachorro;
import entidades.entrega;
import entidades.pessoa;

public class pet 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		pessoa cliente1 = new pessoa ("Gustavo");
		cachorro cachorro1 = new cachorro ("Pit bul");
		cachorro cachorro2 = new cachorro ("Pincher");
		aves ave1 = new aves ("Verde", "Bico Fino", "Piriquito");
		entrega entrega1 = new entrega ();
		
		System.out.println(cliente1.nome);
		System.out.println("Insira seu ano de nascimento: ");
		cliente1.anoNascimento = leia.nextInt();
		System.out.println(cachorro1.raca);
		System.out.println(cachorro2.raca);
		System.out.printf("\n%s %s %s",ave1.cor,ave1.bico, ave1.tipoAve );
		
		cliente1.idade();
	}

}
