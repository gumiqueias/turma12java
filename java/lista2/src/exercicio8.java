import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int n;
		
		System.out.println("Insira um número: ");
		n = leia.nextInt();
		
		if (n > 100)
		{
			System.out.println("N = "+n);
		}
		else
		{
			n = 0;
			
			System.out.println("N = "+n);
		}
	}

}
