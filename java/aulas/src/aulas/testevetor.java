package aulas;
import java.util.Scanner;

public class testevetor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		final int minimo = 3;
		double vetor[] = new double[minimo];
		int x = 0;
		
		for (x = 0; x<3; x++) {
			System.out.println("Insira o valor do vetor: ");
			vetor [x] = ler.nextDouble();
		}
		for (x = 0; x<3; x++) {
			System.out.println (vetor [x]);
		}
	}

}
