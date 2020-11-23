package luis_vintao;


public class Produto {
	
	private double preco;
	private String nome;
	private int codigo;
	private int estoque;
	
	public Produto(double preco, String nome, int codigo, int quantidade) {

		this.preco = preco;
		this.nome = nome;
		this.codigo = codigo;
		this.estoque = quantidade;
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
		return estoque;
	}

	public void setQuantidade(int quantidade) {
		this.estoque = quantidade;
	}
	
	public void retirar(int quantidade) {
		if(quantidade > this.estoque) {
			System.out.println("PRODUTO FORA DE ESTOQUE OU LIMITE DE QUANTIDADE EXCEDIDO.");
		} else if(quantidade <= this.estoque) {
			this.estoque -= quantidade;
		}
	}
	public double precoQuantidade(int qTotal) {
		double valorQuantidade = this.preco * qTotal;
		return valorQuantidade;
	}
}
