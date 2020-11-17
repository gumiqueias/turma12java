package aplicacao;

import java.util.Scanner;

import entidades.disciplina;
import entidades.pessoa;

public class cadAluno {

	public static void main(String[] args) {
		
		//pessoa aluno = new pessoa();
		//pessoa aluno2 = new pessoa();		
		disciplina cursoPessoa = new disciplina();
		disciplina cursoPessoa2 = new disciplina();
		Scanner leia = new Scanner(System.in);
		int escolha=0;
		
		
		System.out.println("SISTEMA DE CADASTRO DE ALUNOS POR MATERIA");
		System.out.print("Digite o nome do aluno: ");
		//aluno.nome = leia.next().toUpperCase();
		System.out.print("Digite M-Masculino, F-feminino ou O-outros: ");
		//aluno.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Escolha 1-JAVA ou 2-SQL");
		escolha = leia.nextInt();
		if (escolha==1) {
			cursoPessoa.nome = "JAVA";
		}
		else if (escolha==2)
		{
			cursoPessoa.nome = "SQL";
		}
		else {
			System.out.println("VC NÃO ESCOLHEU DIREITO, QUE PENA!!!");
		}
		
		
		//if (aluno.genero =='F') {
		//	System.out.printf("Oi %s, você é agora aluna do curso de %s", aluno.nome, cursoPessoa.nome );
			
		//} else if (aluno.genero =='M') {
		//	System.out.printf("Oi %s, você é agora aluno do curso de %s", aluno.nome, cursoPessoa.nome );
		//}
		//else if (aluno.genero =='O') {
			//System.out.printf("Oi %s, você é agora alunx do curso de %s", aluno.nome, cursoPessoa.nome );
		//} else
		{
			System.out.println("Vc não informou seu genereo, que pena!!!");
		}
		System.out.println();
		System.out.println("PROXIMO ALUNO");
		
		
		System.out.print("Digite o nome do aluno: ");
		//aluno2.nome = leia.next().toUpperCase();
		System.out.print("Digite M-Masculino, F-feminino ou O-outros: ");
		//aluno2.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Escolha 1-JAVA ou 2-SQL");
		escolha = leia.nextInt();
		if (escolha==1) {
			cursoPessoa2.nome = "JAVA";
		}
		else if (escolha==2)
		{
			cursoPessoa2.nome = "SQL";
		}
		else {
			System.out.println("VC NÃO ESCOLHEU DIREITO, QUE PENA!!!");
		}
		
		
		//if (aluno2.genero =='F') {
		//	System.out.printf("Oi %s, você é agora aluna do curso de %s", aluno2.nome, cursoPessoa2.nome );
			
		//} else if (aluno2.genero =='M') {
		//	System.out.printf("Oi %s, você é agora aluno do curso de %s", aluno2.nome, cursoPessoa2.nome );
		//}
		//else if (aluno2.genero =='O') {
		//	System.out.printf("Oi %s, você é agora alunx do curso de %s", aluno2.nome, cursoPessoa2.nome );
		//} else
		{
			System.out.println("Vc não informou seu genereo, que pena!!!");
		}
		System.out.println();
		System.out.println("Nossos alunos:");
		//System.out.println(aluno.nome+"  -  "+aluno2.nome);
		

	}

}
