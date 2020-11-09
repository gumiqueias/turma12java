import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double area, base, altura;
		
		System.out.println("Insira a base: ");
		base = leia.nextDouble();
		
		System.out.println("Insira a altura: ");
		altura = leia.nextDouble();
		

		if (base >= 0 && altura >=0)
		{
			area = (base*altura)/2;

			System.out.printf ("A área do triângulo é de %.2f " , area);
		}
		
		else 
		{
			System.out.println ("Dados inválidos");
		}

	}

}
