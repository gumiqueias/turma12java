package exercicio1;

public class classePessoa {

	
		private String nome;
		private String end;
		private String tel;
		
		
		
		public classePessoa(String nome)
		{
			this.nome = nome;
		}
	
		public classePessoa(String nome, String end, String tel) 
		{
			this.nome = nome;
			this.end = end;
			this.tel = tel;
		}
	
		public classePessoa() 
		{
				
			}
			
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEnd() {
			return end;
		}
		public void setEnd(String end) {
			this.end = end;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
	
}