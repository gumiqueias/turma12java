import java.util.Scanner;

public class exercico6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Insira a idade do nadador: ");
		idade = leia.nextInt();
		
		if (idade>=5 && idade<=7)
		{
			System.out.println ("\nCom sua idade, você pertence ao grupo infantil A de 5 a 7 anos");
		}
							
		else if (idade>=8 && idade<= 11)
		{
			System.out.println ("\nCom sua idade, você pertence ao grupo infantil B de 8 a 11 anos");
		}

		else if (idade>= 12 && idade<= 13) 
		{
			System.out.println ("\nCom sua idade, você pertence ao grupo juvenil A de 12 a 13 anos ");
		}			
		
		else if (idade>= 14 && idade <= 17)
		{
			System.out.println ("\nCom sua idade, você pertence ao grupo juvenil B de 14 a 17 anos");
		}
			
		else if (idade>= 18)
		{
			System.out.println("\nCom sua idade, você pertence ao grupo adulto acima de 18 anos");
		}
			
		else
		{
			System.out.println("\nVocê não se aplica em nenhum grupo");
		}
		
		System.out.println("---------------------------------------------------------------");

	}

}
