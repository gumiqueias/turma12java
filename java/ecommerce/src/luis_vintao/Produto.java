package luis_vintao;

public class Produto {
	
	private double preco;
	private String nome;
	private int codigo;
	private int quantidade;
	
	public Produto(double preco, String nome, int codigo, int quantidade) {

		this.preco = preco;
		this.nome = nome;
		this.codigo = codigo;
		this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void retirar(int quantidade) {
		this.quantidade -= quantidade;
	
	}
	public double precoQuantidade(int quantidade) {
		double valorQuantidade = this.preco * quantidade;
		return valorQuantidade;
	}
}
