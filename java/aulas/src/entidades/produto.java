package entidades;

public class produto 
{
	 public String nomeProduto;
     public double medida;
     public int quantidade ;
     public String valorProdutoUni;
     
     public produto ()
     {
    	 
     }
     
     public produto (String nomeProduto, double medida, int quantidade, String valorProdutoUni)
     {
    	 this.nomeProduto = nomeProduto;
    	 this.medida = medida;
    	 this.quantidade = quantidade;
    	 this.valorProdutoUni = valorProdutoUni;
     }
}
