package exercicio3;

public class empregado {

	public static void main(String[] args) {
		
		classeEmpregado empregado = new classeEmpregado();
		
		empregado.setNome("Gustavo");
		empregado.setEnd ("Av Brasil");
		empregado.setCodigoSetor(7);
		empregado.setSalarioBase(750);
		empregado.setImposto(10);
		
		empregado.imprime();
		
		empregado.calcularSalario();
		

	}

}
